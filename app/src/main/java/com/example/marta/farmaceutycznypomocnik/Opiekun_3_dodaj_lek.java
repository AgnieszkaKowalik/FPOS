package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Opiekun_3_dodaj_lek extends AppCompatActivity implements View.OnClickListener {

    DBController controller = new DBController(this);
    Button bzapisz,banuluj;
    EditText etNazwa, etDawka, etInfo, etDni, etGodz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_3_dodaj_lek);

        bzapisz = (Button)this.findViewById(R.id.zapiszButton);
        banuluj = (Button) this.findViewById(R.id.anuluj_button);
        etNazwa = (EditText)this.findViewById(R.id.nazwa_leku);
        etDawka = (EditText)this.findViewById(R.id.dawka_leku);
        etInfo = (EditText)this.findViewById(R.id.dodatkowe_info);
        etDni = (EditText)this.findViewById(R.id.dni_tyg);
        etGodz = (EditText)this.findViewById(R.id.godzina);

        bzapisz.setOnClickListener(this);
        banuluj.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.zapiszButton:
                if (etNazwa.getText().toString().equals("") || etDawka.getText().toString().equals("") ||
                        etInfo.getText().toString().equals("") || etDni.getText().toString().equals("") ||
                        etGodz.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "UZUPELNIJ WSZYSTKIE POLA!", Toast.LENGTH_SHORT).show();
                }else {
                    Lek nowyLek = new Lek();
                    nowyLek.setNazwa(etNazwa.getText().toString());
                    nowyLek.setDawka(etDawka.getText().toString());
                    nowyLek.setInfo(etInfo.getText().toString());
                    nowyLek.setDni(etDni.getText().toString());
                    nowyLek.setGodziny(etGodz.getText().toString());
                    controller.dodajLek(nowyLek);
                    Toast.makeText(getApplicationContext(),
                            "Zapisano!", Toast.LENGTH_SHORT).show();
                }
                startActivity(new Intent(this, Opiekun_4_lista_lekow.class));
                break;
            case R.id.anuluj_button:
                startActivity(new Intent(this, Opiekun_4_lista_lekow.class));
                break;
            default:
                break;
        }
    }
}
