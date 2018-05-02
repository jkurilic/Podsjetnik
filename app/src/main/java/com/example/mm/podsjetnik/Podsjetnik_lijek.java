package com.example.mm.podsjetnik;

import java.util.Date;

public class Podsjetnik_lijek {
    public String Sifra_podsjetnika_uzim;
    public Date Datum_poc_uzimanja;
    public int Br_pod_u_danu_uzim;
    public Date Vrijeme_pod_uzim;
    public int Br_dana_pod_uzim;
    public String Sifra_lijeka;


    public Podsjetnik_lijek(String sifra_podsjetnika_uzim, Date datum_poc_uzimanja, int br_pod_u_danu_uzim, Date vrijeme_pod_uzim, int br_dana_pod_uzim, String sifra_lijeka) {
        Sifra_podsjetnika_uzim = sifra_podsjetnika_uzim;
        Datum_poc_uzimanja = datum_poc_uzimanja;
        Br_pod_u_danu_uzim = br_pod_u_danu_uzim;
        Vrijeme_pod_uzim = vrijeme_pod_uzim;
        Br_dana_pod_uzim = br_dana_pod_uzim;
        Sifra_lijeka = sifra_lijeka;
    }

    public String getSifra_podsjetnika_uzim() {
        return Sifra_podsjetnika_uzim;
    }

    public void setSifra_podsjetnika_uzim(String sifra_podsjetnika_uzim) {
        Sifra_podsjetnika_uzim = sifra_podsjetnika_uzim;
    }

    public Date getDatum_poc_uzimanja() {
        return Datum_poc_uzimanja;
    }

    public void setDatum_poc_uzimanja(Date datum_poc_uzimanja) {
        Datum_poc_uzimanja = datum_poc_uzimanja;
    }

    public int getBr_pod_u_danu_uzim() {
        return Br_pod_u_danu_uzim;
    }

    public void setBr_pod_u_danu_uzim(int br_pod_u_danu_uzim) {
        Br_pod_u_danu_uzim = br_pod_u_danu_uzim;
    }

    public Date getVrijeme_pod_uzim() {
        return Vrijeme_pod_uzim;
    }

    public void setVrijeme_pod_uzim(Date vrijeme_pod_uzim) {
        Vrijeme_pod_uzim = vrijeme_pod_uzim;
    }

    public int getBr_dana_pod_uzim() {
        return Br_dana_pod_uzim;
    }

    public void setBr_dana_pod_uzim(int br_dana_pod_uzim) {
        Br_dana_pod_uzim = br_dana_pod_uzim;
    }

    public String getSifra_lijeka() {
        return Sifra_lijeka;
    }

    public void setSifra_lijeka(String sifra_lijeka) {
        Sifra_lijeka = sifra_lijeka;
    }
}
