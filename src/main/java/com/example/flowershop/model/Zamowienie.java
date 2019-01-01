package com.example.flowershop.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name="Zamówienie")
public class Zamowienie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private int KlientID;
    private int KurierID;
    private int AdresID;
    private int BilecikID;
    @Nullable
    private int LiczbaElementow;

   // @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private String TerminDostarczenia;

   // @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private String DataZamowienia;

    private BigDecimal Kwota;
    @Column(name="CzyOplacone")
    private Boolean CzyOplacone;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getKlientID() {
        return KlientID;
    }

    public void setKlientID(int klientID) {
        KlientID = klientID;
    }

    public int getKurierID() {
        return KurierID;
    }

    public void setKurierID(int kurierID) {
        KurierID = kurierID;
    }

    public int getAdresID() {
        return AdresID;
    }

    public void setAdresID(int adresID) {
        AdresID = adresID;
    }

    public int getBilecikID() {
        return BilecikID;
    }

    public void setBilecikID(int bilecikID) {
        BilecikID = bilecikID;
    }

    public int getLiczbaElementow() {
        return LiczbaElementow;
    }

    public void setLiczbaElementow(int liczbaElementow) {
        LiczbaElementow = liczbaElementow;
    }

    public String getTerminDostarczenia() {
        return TerminDostarczenia;
    }

    public void setTerminDostarczenia(String terminDostarczenia) {
        TerminDostarczenia = terminDostarczenia;
    }

    public String getDataZamowienia() {
        return DataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        DataZamowienia = dataZamowienia;
    }

    public BigDecimal getKwota() {
        return Kwota;
    }

    public void setKwota(BigDecimal kwota) {
        Kwota = kwota;
    }

    public Boolean getCzyOplacone() {
        return CzyOplacone;
    }

    public void setCzyOplacone(Boolean czyOplacone) {
        CzyOplacone = czyOplacone;
    }
}
