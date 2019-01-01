package com.example.flowershop.model;

import java.sql.Date;
import java.sql.Time;

public class DzienPracy {
    private int ID;
    private Time CzasRozp;
    private Time CzasZakon;
    private Date Data;
    private String DzienTygodniaID;
    private int KurierID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Time getCzasRozp() {
        return CzasRozp;
    }

    public void setCzasRozp(Time czasRozp) {
        CzasRozp = czasRozp;
    }

    public Time getCzasZakon() {
        return CzasZakon;
    }

    public void setCzasZakon(Time czasZakon) {
        CzasZakon = czasZakon;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public String getDzienTygodniaID() {
        return DzienTygodniaID;
    }

    public void setDzienTygodniaID(String dzienTygodniaID) {
        DzienTygodniaID = dzienTygodniaID;
    }

    public int getKurierID() {
        return KurierID;
    }

    public void setKurierID(int kurierID) {
        KurierID = kurierID;
    }
}
