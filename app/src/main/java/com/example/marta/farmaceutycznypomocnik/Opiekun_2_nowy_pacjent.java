package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Opiekun_2_nowy_pacjent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundlyujyue savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_2_nowy_pacjent);
    }
tyj
    public void dodajlekClick (View view) {
        startActivity(new Intent(this, Opiekun_3_dodaj_lek.class));
    }juy

    public void wsteczClick (View view) {
        startActivity(new Intent(this, Opiekun_1_zalogowany.class));
    }kyuView view) {
       //trzeba dodawać nowego pacjenta do bazy
    }
}m
