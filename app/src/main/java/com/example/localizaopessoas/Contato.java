package com.example.localizaopessoas;

public class Contato {
    private String nome;
    private String email;
    private Double latitude;
    private Double longitude;

    public Contato(String nome, String email, Double latitude, Double longitude) {
        this.nome = nome;
        this.email = email;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}
