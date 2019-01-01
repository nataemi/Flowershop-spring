package com.example.flowershop.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Kwiat {
    private int ID;
    private Date DoKiedyObnizka;
    private int ProcentObnizki;
    private BigDecimal Cena;
    private String Obraz;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public BigDecimal getCena() {
        return Cena;
    }

    public void setCena(BigDecimal cena) {
        Cena = cena;
    }

    public String getObraz() {
        return Obraz;
    }

    public void setObraz(String obraz) {
        Obraz = obraz;
    }
}
