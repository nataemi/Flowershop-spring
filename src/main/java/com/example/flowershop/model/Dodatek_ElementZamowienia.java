package com.example.flowershop.model;

public class Dodatek_ElementZamowienia {
    private int DodatekID;
    private int ElementZamowieniaID;
    private int Ilosc;

    public int getDodatekID() {
        return DodatekID;
    }

    public void setDodatekID(int dodatekID) {
        DodatekID = dodatekID;
    }

    public int getElementZamowieniaID() {
        return ElementZamowieniaID;
    }

    public void setElementZamowieniaID(int elementZamowieniaID) {
        ElementZamowieniaID = elementZamowieniaID;
    }

    public int getIlosc() {
        return Ilosc;
    }

    public void setIlosc(int ilosc) {
        Ilosc = ilosc;
    }
}
