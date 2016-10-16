package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Opiekun_3_dodaj_lek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_3_dodaj_lek);
    }

    public void zapiszClick (View view) {
        //trzeba dodawać lek do bazy do odpowiedniego pacjenta
    }

    public void wsteczClick (View view) {
        startActivity(new Intent(this, Opiekun_4_lista_lekow.class));
    }
}
