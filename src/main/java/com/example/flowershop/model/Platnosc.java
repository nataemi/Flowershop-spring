package com.example.flowershop.model;

import java.math.BigDecimal;

public class Platnosc {
    private int ID;
    private int ZamowienieID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getZamowienieID() {
        return ZamowienieID;
    }

    public void setZamowienieID(int zamowienieID) {
        ZamowienieID = zamowienieID;
    }

    public BigDecimal getKwota() {
        return Kwota;
    }

    public void setKwota(BigDecimal kwota) {
        Kwota = kwota;
    }

    private BigDecimal Kwota;
}
