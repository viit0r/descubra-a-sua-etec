package com.vitor.descubraasuaetec.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.vitor.descubraasuaetec.R;

public class listaUnidades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_unidades);
        //definindo titulo
        getSupportActionBar().setTitle("Unidades");


    }
}