package com.example.mm.podsjetnik;

import java.util.Date;

public class Popis_za_kupovinu {

    public String Sifra_popisa;
    public Date Datum_dodavanja;
    public  Date Datum_zavrsetka;
    public double Ukupna_cijena;
    public int Zaliha;
    public String Sifra_lijeka;


    public Popis_za_kupovinu(String sifra_popisa, Date datum_dodavanja, Date datum_zavrsetka, double ukupna_cijena, int zaliha, String sifra_lijeka) {

        Sifra_popisa = sifra_popisa;
        Datum_dodavanja = datum_dodavanja;
        Datum_zavrsetka = datum_zavrsetka;
        Ukupna_cijena = ukupna_cijena;
        Zaliha = zaliha;
        Sifra_lijeka = sifra_lijeka;
    }

    public String getSifra_popisa() {
        return Sifra_popisa;
    }

    public void setSifra_popisa(String sifra_popisa) {
        Sifra_popisa = sifra_popisa;
    }

    public Date getDatum_dodavanja() {
        return Datum_dodavanja;
    }

    public void setDatum_dodavanja(Date datum_dodavanja) {
        Datum_dodavanja = datum_dodavanja;
    }

    public Date getDatum_zavrsetka() {
        return Datum_zavrsetka;
    }

    public void setDatum_zavrsetka(Date datum_zavrsetka) {
        Datum_zavrsetka = datum_zavrsetka;
    }

    public double getUkupna_cijena() {
        return Ukupna_cijena;
    }

    public void setUkupna_cijena(double ukupna_cijena) {
        Ukupna_cijena = ukupna_cijena;
    }

    public int getZaliha() {
        return Zaliha;
    }

    public void setZaliha(int zaliha) {
        Zaliha = zaliha;
    }

    public String getSifra_lijeka() {
        return Sifra_lijeka;
    }

    public void setSifra_lijeka(String sifra_lijeka) {
        Sifra_lijeka = sifra_lijeka;
    }
}
