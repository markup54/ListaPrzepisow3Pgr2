package com.example.ksiazkakucharska;

public class Przepis {
    private String nazwa;
    private int kateoria;
    private String listaSkladnikow;
    private int idObrazka;

    public Przepis(String nazwa, int kateoria, String listaSkladnikow, int idObrazka) {
        this.nazwa = nazwa;
        this.kateoria = kateoria;
        this.listaSkladnikow = listaSkladnikow;
        this.idObrazka = idObrazka;
    }

    @Override
    public String toString() {
        return nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getKateoria() {
        return kateoria;
    }

    public void setKateoria(int kateoria) {
        this.kateoria = kateoria;
    }

    public String getListaSkladnikow() {
        return listaSkladnikow;
    }

    public void setListaSkladnikow(String listaSkladnikow) {
        this.listaSkladnikow = listaSkladnikow;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }
}
