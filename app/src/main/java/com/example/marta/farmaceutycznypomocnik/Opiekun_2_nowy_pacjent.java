package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Opiekun_2_nowy_pacjent extends AppCompatActivity {

    EditText etImie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_2_nowy_pacjent);

        etImie = (EditText) this.findViewById(R.id.imie_pacjenta);
    }

    public void dalejClick (View view) {
        if (etImie.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(),
                    "WPROWADZ IMIE PACJENA!", Toast.LENGTH_SHORT).show();
        } else {
            String imiePacjenta = etImie.getText().toString(); // Pobieramy tekst z pola
            Intent cel = new Intent(this, Opiekun_4_lista_lekow.class); // Definiujemy cel
            cel.putExtra("imieNowyPacjent", imiePacjenta); // Towrzymy Bundle od razu dodając informacje do Intentu
            startActivity(cel);         // Wysyłamy
        }
    }

    public void wsteczClick (View view) {
        startActivity(new Intent(this, Opiekun_2_nowy_pacjent.class));
    }

}
