package com.example.flowershop.model;

public class Bukiet_ElementZamowienia {
    private int BukietID;
    private int ElementZamowieniaID;
    private int ilosc;

    public int getBukietID() {
        return BukietID;
    }

    public void setBukietID(int bukietID) {
        BukietID = bukietID;
    }

    public int getElementZamowieniaID() {
        return ElementZamowieniaID;
    }

    public void setElementZamowieniaID(int elementZamowieniaID) {
        ElementZamowieniaID = elementZamowieniaID;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }
}
