package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Przypomnij_haslo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przypomnij_haslo);
    }

    public void wyslijClick (View view) {
        startActivity(new Intent(this, Opiekun_2_login.class));
        //na razie przechodzi wstecz po prostu
        //trzeba zrobić, żeby po kliknięciu wysyłało na maila hasło
        //i mail musi się zgadzać z tym, który podany został przy rejestracji
    }

    public void wsteczClick (View view) {
        startActivity(new Intent(this, Opiekun_1_login.class));
    }
}
