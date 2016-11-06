package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Opiekun_4_lista_lekow extends AppCompatActivity {

    TextView tvImie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_4_lista_lekow);

        tvImie = (TextView) this.findViewById(R.id.imieP);

        tvImie.setText("");
    }

    public void dodajlekClick (View view) {
        startActivity(new Intent(this, Opiekun_3_dodaj_lek.class));
    }

    public void wsteczClick (View view) {
        startActivity(new Intent(this, Opiekun_2_nowy_pacjent.class));
    }
}
