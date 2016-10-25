package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Opiekun_1_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_1_login);
        próba kontrolna
    }

    public void przypomnijClick (View view) {
        startActivity(new Intent(this, Przypomnij_haslo.class));
    }

    public void loginClick (View view) {
        startActivity(new Intent(this, Opiekun_1_zalogowany.class));
        //tutaj trzeba jeszcze sprawdzać, czy wpisane hasło jest takie, jak podane przy rejestracji
    }

    public void wsteczClick (View view) {
        startActivity(new Intent(this, Start.class));
    }
}
