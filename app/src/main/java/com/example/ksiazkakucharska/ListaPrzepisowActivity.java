package com.example.ksiazkakucharska;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {

    ArrayAdapter<Przepis> adapterPrzepisy;
    ListView listViewPrzepisy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        int kategoria = (int)getIntent().getExtras().get(MainActivity.EXTRA_KATEGORIA);
        Toast.makeText(this, Integer.toString(kategoria), Toast.LENGTH_SHORT).show();
        ArrayList<Przepis> wybranePrzepisy = RepozytoriumPrzepisow.wybierzPrzepisy(kategoria);
        adapterPrzepisy =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                        wybranePrzepisy);

        listViewPrzepisy = findViewById(R.id.listViewPrzepisow);
        listViewPrzepisy.setAdapter(adapterPrzepisy);



    }
}