package com.example.flowershop.model;

import java.sql.Date;

public class Dodatek {
private int ID;
private int Obraz;
private int Cena;
private Date DoKiedyObnizka;
private int ProcentObnizki;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getObraz() {
        return Obraz;
    }

    public void setObraz(int obraz) {
        Obraz = obraz;
    }

    public int getCena() {
        return Cena;
    }

    public void setCena(int cena) {
        Cena = cena;
    }

    public Date getDoKiedyObnizka() {
        return DoKiedyObnizka;
    }

    public void setDoKiedyObnizka(Date doKiedyObnizka) {
        DoKiedyObnizka = doKiedyObnizka;
    }

    public int getProcentObnizki() {
        return ProcentObnizki;
    }

    public void setProcentObnizki(int procentObnizki) {
        ProcentObnizki = procentObnizki;
    }
}