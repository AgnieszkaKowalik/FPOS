package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void pacjentClick (View view) {
        startActivity(new Intent(this, Opiekun_1_login.class)); //tymczasowo otwiera się wersja opiekuna, don't panic
                                                                //to tylko, żeby sprawdzić, czy działa
    }

    public void opiekunClick (View view) {
        startActivity(new Intent(this, Opiekun_1_register.class)); //trzeba zrobić tak, żeby to się otwierało tylko
                                        //przy pierwszym otwieraniu apki, później ma się pojawiać Opiekun_1_login.class
    }

    public void zamknijClick (View view) {
        finish(); //nie działa zamykanie apki, metoda finish() zamyka tylko otwarte activity i pojawia się to,
                  // które było otwarte wcześniej :( na razie nie wiem jak wyłączać apkę, ale jakoś do tego dojdziemy!
        }
}
