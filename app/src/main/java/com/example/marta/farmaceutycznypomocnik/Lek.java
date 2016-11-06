package com.example.marta.farmaceutycznypomocnik;

/**
 * Created by Marta on 06.11.2016.
 */

public class Lek {
    private Long nr;
    private String imie;
    private String nazwa;
    private String dawka;
    private String info;
    private String dni;
    private String godziny;

    // poszczególne pola klasy Lek - gettery i settery (pozwalają na dostęp do prywatnych pól klasy Lek); większa kontrola nad polami klasy
    // UWAGA: aby wygenerować gettery i settery - prawy przycisk mysz -> generate -> getter and setter -> zaznaczyć wszystkie zmienne i po sprawie
    // nie trzeba pisać wszystkiego ręcznie

    public Long getNr() {
        return nr;
    }

    public void setNr(Long nr) {
        this.nr = nr;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getDawka() {
        return dawka;
    }

    public void setDawka(String dawka) {
        this.dawka = dawka;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGodziny() {
        return godziny;
    }

    public void setGodziny(String godziny) {
        this.godziny = godziny;
    }

}
