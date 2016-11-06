package com.example.marta.farmaceutycznypomocnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class Opiekun_4_lista_lekow extends AppCompatActivity implements View.OnClickListener{

    DBController controller = new DBController(this);
    TextView tvImie,tvLista;
    Button bdodajlek,bwstecz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_4_lista_lekow);

        tvImie = (TextView) this.findViewById(R.id.imieP);
        tvLista = (TextView) this.findViewById(R.id.lista_lekow);
        bdodajlek = (Button) this.findViewById(R.id.dodajlek_button);
        bwstecz = (Button) this.findViewById(R.id.wstecz_button);


        tvImie.setText(getIntent().getExtras().getString("imieNowyPacjent"));
        List<Lek> leki= controller.dajWszystkie();
        for(Lek l:leki){
            tvLista.setText(tvLista.getText() + "\n" + l.getNr() + " "
                    + l.getNazwa() + " " + l.getDawka() + " "
                    + l.getInfo() + " " + l.getDni() + " " + l.getGodziny());
        }

        bdodajlek.setOnClickListener(this);
        bwstecz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dodajlek_button:
                startActivity(new Intent(this, Opiekun_3_dodaj_lek.class));
                break;
            case R.id.wstecz_button:
                startActivity(new Intent(this, Opiekun_2_nowy_pacjent.class));
                break;
        }
    }
}
