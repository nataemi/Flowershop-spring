package com.example.flowershop.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Bukiet {
    private int ID;
    private String Obraz;
    private BigDecimal Cena;
    private Date DoKiedyObnizka;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getObraz() {
        return Obraz;
    }

    public void setObraz(String obraz) {
        Obraz = obraz;
    }

    public BigDecimal getCena() {
        return Cena;
    }

    public void setCena(BigDecimal cena) {
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

    private int ProcentObnizki;
}
