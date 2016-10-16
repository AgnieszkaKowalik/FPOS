package com.example.marta.farmaceutycznypomocnik;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Opiekun_1_register extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_1_register);
    }

    public void registerClick (View v) {
        startActivity(new Intent(this, Start.class));
        //na razie po kliknięciu otwiera się ekran startowy
    }

    public void wsteczClick (View v) {

        startActivity(new Intent(this, Start.class));
        }

}
