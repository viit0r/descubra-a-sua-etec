package com.vitor.descubraasuaetec;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class listaCursos extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
        //definindo titulo
        getSupportActionBar().setTitle("Cursos");

        
    }
}