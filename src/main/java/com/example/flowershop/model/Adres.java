package com.example.flowershop.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Adres {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="ID")
    private long ID;
    //@Column(name="Kod pocztowy")
    private String KodPocztowy;
    //@Column(name="Ulica")
    private String Ulica;
    //@Column(name="NrDomu")
    private int NrDomu;
    //@Column(name="NrMieszkania")
    private int NrMieszkania;
    //@Column(name="Miejscowosc")
    private String Miejscowosc;
    //@Column(name="Kraj")
    private String Kraj;

    public long getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUlica() {
        return Ulica;
    }

    public void setUlica(String ulica) {
        Ulica = ulica;
    }

    public int getNrDomu() {
        return NrDomu;
    }

    public void setNrDomu(int nrDomu) {
        NrDomu = nrDomu;
    }

    public int getNrMieszkania() {
        return NrMieszkania;
    }

    public void setNrMieszkania(int nrMieszkania) {
        NrMieszkania = nrMieszkania;
    }

    public String getMiejscowosc() {
        return Miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        Miejscowosc = miejscowosc;
    }

    public String getKraj() {
        return Kraj;
    }

    public void setKraj(String kraj) {
        Kraj = kraj;
    }
}
