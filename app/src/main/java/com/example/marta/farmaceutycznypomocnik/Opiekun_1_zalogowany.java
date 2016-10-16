package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Opiekun_1_zalogowany extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_1_zalogowany);
    }

    //trzeba zrobić tak, żeby przycisków z pacjentami było tyle ile pacjentów wprowadzono (czyli tyle ile w bazie danych)

    public void pacjent1Click (View view) {
        startActivity(new Intent(this, Opiekun_4_lista_lekow.class));
    }

    public void pacjent2Click (View view) {
        startActivity(new Intent(this, Opiekun_4_lista_lekow.class));
    }

    public void nowypacjentClick (View view) {
        startActivity(new Intent(this, Opiekun_2_nowy_pacjent.class));
    }

    public void wsteczClick (View view) {
        startActivity(new Intent(this, Start.class));
    }
}
