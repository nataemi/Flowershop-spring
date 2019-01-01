package com.example.flowershop.model;

import java.math.BigDecimal;

public class ElementZamowienia {
    private int ID;
    private int LiczbaTowarow;
    private String Status;
    private BigDecimal Cena;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getLiczbaTowarow() {
        return LiczbaTowarow;
    }

    public void setLiczbaTowarow(int liczbaTowarow) {
        LiczbaTowarow = liczbaTowarow;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public BigDecimal getCena() {
        return Cena;
    }

    public void setCena(BigDecimal cena) {
        Cena = cena;
    }
}
