package com.example.mm.podsjetnik;

public class Lijek {
    public String Sifra_lijeka;
    public String Naziv_lijeka;
    public String Lista;
    public double Cijena_lijeka;
    public Boolean Ponavljanje_da_ne;
    public String Oblik_lijeka;
    public int Jedinice_po_uzimanju;
    public int Broj_jedinica_u_pak;
    public int Broj_uzimanja_u_danu;


    public Lijek(String sifra_lijeka, String naziv_lijeka, String lista, double cijena_lijeka,
                 Boolean ponavljanje_da_ne, String oblik_lijeka, int jedinice_po_uzimanju,
                 int broj_jedinica_u_pak, int broj_uzimanja_u_danu)
    {

        Sifra_lijeka = sifra_lijeka;
        Naziv_lijeka = naziv_lijeka;
        Lista = lista;
        Cijena_lijeka = cijena_lijeka;
        Ponavljanje_da_ne = ponavljanje_da_ne;
        Oblik_lijeka = oblik_lijeka;
        Jedinice_po_uzimanju = jedinice_po_uzimanju;
        Broj_jedinica_u_pak = broj_jedinica_u_pak;
        Broj_uzimanja_u_danu = broj_uzimanja_u_danu;
    }

    public String getSifra_lijeka() {
        return Sifra_lijeka;
    }

    public void setSifra_lijeka(String sifra_lijeka) {
        Sifra_lijeka = sifra_lijeka;
    }

    public String getNaziv_lijeka() {
        return Naziv_lijeka;
    }

    public void setNaziv_lijeka(String naziv_lijeka) {
        Naziv_lijeka = naziv_lijeka;
    }

    public String getLista() {
        return Lista;
    }

    public void setLista(String lista) {
        Lista = lista;
    }

    public double getCijena_lijeka() {
        return Cijena_lijeka;
    }

    public void setCijena_lijeka(double cijena_lijeka) {
        Cijena_lijeka = cijena_lijeka;
    }

    public Boolean getPonavljanje_da_ne() {
        return Ponavljanje_da_ne;
    }

    public void setPonavljanje_da_ne(Boolean ponavljanje_da_ne) {
        Ponavljanje_da_ne = ponavljanje_da_ne;
    }

    public String getOblik_lijeka() {
        return Oblik_lijeka;
    }

    public void setOblik_lijeka(String oblik_lijeka) {
        Oblik_lijeka = oblik_lijeka;
    }

    public int getJedinice_po_uzimanju() {
        return Jedinice_po_uzimanju;
    }

    public void setJedinice_po_uzimanju(int jedinice_po_uzimanju) {
        Jedinice_po_uzimanju = jedinice_po_uzimanju;
    }

    public int getBroj_jedinica_u_pak() {
        return Broj_jedinica_u_pak;
    }

    public void setBroj_jedinica_u_pak(int broj_jedinica_u_pak) {
        Broj_jedinica_u_pak = broj_jedinica_u_pak;
    }

    public int getBroj_uzimanja_u_danu() {
        return Broj_uzimanja_u_danu;
    }

    public void setBroj_uzimanja_u_danu(int broj_uzimanja_u_danu) {
        Broj_uzimanja_u_danu = broj_uzimanja_u_danu;
    }
}
