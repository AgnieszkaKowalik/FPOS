package com.example.marta.farmaceutycznypomocnik;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Opiekun_1_register extends AppCompatActivity implements View.OnClickListener{

    Button brejestruj, bwstecz;
    EditText ethaslo1, ethaslo2, etemail1, etemail2;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opiekun_1_register);

        brejestruj = (Button)this.findViewById(R.id.register_button);
        bwstecz = (Button)this.findViewById(R.id.wstecz_button);
        ethaslo1 = (EditText)this.findViewById(R.id.haslo1);
        ethaslo2 = (EditText)this.findViewById(R.id.haslo2);
        etemail1 = (EditText)this.findViewById(R.id.email1);
        etemail2 = (EditText) this.findViewById(R.id.email2);

        brejestruj.setOnClickListener(this);
        bwstecz.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.register_button:
                if (ethaslo1.getText().toString().equals("") || ethaslo2.getText().toString().equals("") ||
                        etemail1.getText().toString().equals("") || etemail2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "UZUPELNIJ WSZYSTKIE POLA!", Toast.LENGTH_SHORT).show();
                } else { // dorobić else if (haslo1 = haslo 2 oraz email 1 = email 2)
                    startActivity(new Intent(this, Opiekun_1_login.class));
                }
                break;
            case R.id.wstecz_button:
                startActivity(new Intent(this, Start.class));
            default:
                break;
        }
    }
}
