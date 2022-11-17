package com.example.ksiazkakucharska;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PrzepisActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextView textViewSkladnik;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        int ktoryPrzepis = getIntent().getExtras()
                .getInt(ListaPrzepisowActivity.EXTRA_IDPRZEPISU,0);
        int kategoria = getIntent().getExtras().getInt(ListaPrzepisowActivity.EXTRA_KATEGORIA,0);
        Przepis przepis = RepozytoriumPrzepisow.wybierzPrzepisy(kategoria).get(ktoryPrzepis);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textViewTytul);
        textViewSkladnik = findViewById(R.id.textViewSkladniki);
        imageView.setImageResource(przepis.getIdObrazka());
        textViewSkladnik.setText(przepis.getListaSkladnikow());
        textView.setText(przepis.getNazwa());
        button = findViewById(R.id.button);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //w manifeście dodać filtr do wysyłania sms
                        Intent intencja = new Intent();
                        intencja.setAction(Intent.ACTION_SEND);
                        intencja.putExtra(Intent.EXTRA_TEXT,
                                przepis.getNazwa() +" "+przepis.getListaSkladnikow()+" Smacznego");
                        intencja.setType("text/plain");
                        Intent podzielSieIntencja = Intent.createChooser(intencja,null);
                        startActivity(podzielSieIntencja);
                    }
                }
        );
    }
}