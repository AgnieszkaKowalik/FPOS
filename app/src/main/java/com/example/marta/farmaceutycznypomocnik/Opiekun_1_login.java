package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Opiekun_1_login extends AppCompatActivity implements View.OnClickListener{

    Button bzaloguj, bprzypomnij, bwstecz;
    EditText ethaslo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_1_login);

        bzaloguj = (Button)this.findViewById(R.id.zaloguj_button);
        bprzypomnij = (Button)this.findViewById(R.id.przypomnij_button);
        bwstecz = (Button)this.findViewById(R.id.wstecz_button);
        ethaslo = (EditText)this.findViewById(R.id.haslo);

        bzaloguj.setOnClickListener(this);
        bprzypomnij.setOnClickListener(this);
        bwstecz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.zaloguj_button:
                if (ethaslo.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "MUSISZ WPISAC HASLO!", Toast.LENGTH_SHORT).show();
                } else { // trzeba jeszcze sprawdzać, czy wpisane hasło jest takie, jak podane przy rejestracji
                    startActivity(new Intent(this, Opiekun_2_nowy_pacjent.class));
                }
                break;
            case R.id.przypomnij_button:
                startActivity(new Intent(this, Przypomnij_haslo.class));
                break;
            case R.id.wstecz_button:
                startActivity(new Intent(this, Start.class));
                break;
            default:
                break;
        }
    }
}
