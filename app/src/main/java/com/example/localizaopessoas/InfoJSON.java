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
    private JSONArray jsonArray;

    public InfoJSON() {
        contatos = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public boolean parse(String jsonString) {
        try {
            JSONObject json = new JSONObject(jsonString);
            jsonArray = json.getJSONArray("");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject contato = jsonArray.getJSONObject(i);
                Contato c = new Contato(
                contato.getString("nome"),
                contato.getString("email"),
                contato.getDouble("latitude"),
                contato.getDouble("longitude"));
                contatos.add(c);
                }
            return true;
        } catch (JSONException e) {
            Log.e(TAG, "parse: erro ao fazer parse do JSON: " + e.getMessage());
            return false;
        }
    }
}
