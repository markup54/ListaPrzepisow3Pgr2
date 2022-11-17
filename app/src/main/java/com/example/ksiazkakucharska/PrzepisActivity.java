package com.example.ksiazkakucharska;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}