package com.vitor.descubraasuaetec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView cursos, unidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cursos = findViewById(R.id.imgCursos);
        unidades = findViewById(R.id.imgUnidades);

        //criação dos botões para ir para as listas
        cursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), listaCursos.class);
                startActivity(intent);
            }
        });

        unidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), listaUnidades.class);
                startActivity(intent);
            }
        });
    }
}