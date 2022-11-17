package com.example.ksiazkakucharska;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ListaPrzepisowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        int kategoria = (int)getIntent().getExtras().get(MainActivity.EXTRA_KATEGORIA);
        Toast.makeText(this, Integer.toString(kategoria), Toast.LENGTH_SHORT).show();
    }
}