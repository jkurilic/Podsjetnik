package com.example.mm.podsjetnik;

import java.util.Date;

public class Podsjetnik_kupovina {

    public String Sifra_podsjetnika_kupovina;
    public Date Datum_poc_kup;
    public int Br_pod_u_danu_kup;
    public Date Vrijeme_pod_kup;
    public String Sifra_popisa;
    public String Sifra_lijeka;

    public Podsjetnik_kupovina(String sifra_podsjetnika_kupovina, Date datum_poc_kup, int br_pod_u_danu_kup, Date vrijeme_pod_kup, String sifra_popisa, String sifra_lijeka) {
        Sifra_podsjetnika_kupovina = sifra_podsjetnika_kupovina;
        Datum_poc_kup = datum_poc_kup;
        Br_pod_u_danu_kup = br_pod_u_danu_kup;
        Vrijeme_pod_kup = vrijeme_pod_kup;
        Sifra_popisa = sifra_popisa;
        Sifra_lijeka = sifra_lijeka;
    }

    public String getSifra_podsjetnika_kupovina() {
        return Sifra_podsjetnika_kupovina;
    }

    public void setSifra_podsjetnika_kupovina(String sifra_podsjetnika_kupovina) {
        Sifra_podsjetnika_kupovina = sifra_podsjetnika_kupovina;
    }

    public Date getDatum_poc_kup() {
        return Datum_poc_kup;
    }

    public void setDatum_poc_kup(Date datum_poc_kup) {
        Datum_poc_kup = datum_poc_kup;
    }

    public int getBr_pod_u_danu_kup() {
        return Br_pod_u_danu_kup;
    }

    public void setBr_pod_u_danu_kup(int br_pod_u_danu_kup) {
        Br_pod_u_danu_kup = br_pod_u_danu_kup;
    }

    public Date getVrijeme_pod_kup() {
        return Vrijeme_pod_kup;
    }

    public void setVrijeme_pod_kup(Date vrijeme_pod_kup) {
        Vrijeme_pod_kup = vrijeme_pod_kup;
    }

    public String getSifra_popisa() {
        return Sifra_popisa;
    }

    public void setSifra_popisa(String sifra_popisa) {
        Sifra_popisa = sifra_popisa;
    }

    public String getSifra_lijeka() {
        return Sifra_lijeka;
    }

    public void setSifra_lijeka(String sifra_lijeka) {
        Sifra_lijeka = sifra_lijeka;
    }
}
