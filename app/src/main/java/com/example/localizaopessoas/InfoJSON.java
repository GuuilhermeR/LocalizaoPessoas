package com.example.localizaopessoas;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class InfoJSON {
    private static final String TAG = "InfoJSON";
    private List<Contato> contatos;

    public InfoJSON() {
        contatos = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public boolean parse(String jsonString) {
        try {
            JSONObject json = new JSONObject(jsonString);
            JSONArray contatos = json.getJSONArray("contato");

            for (int i = 0; i < contatos.length(); i++) {
                JSONObject contato = contatos.getJSONObject(i);
                Contato p = new Contato();
                p.setNome(contato.getString("nome"));
                p.setEmail(contato.getString("email"));
                p.setLatitude(contato.getDouble("latitude"));
                p.setLongitude(contato.getDouble("longitude"));
                this.contatos.add(p);
            }
            return true;
        } catch (JSONException e) {
            Log.e(TAG, "parse: erro ao fazer parse do JSON: " + e.getMessage());
            return false;
        }
    }
}
