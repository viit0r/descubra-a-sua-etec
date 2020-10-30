package com.vitor.descubraasuaetec.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.vitor.descubraasuaetec.R;

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
                Intent intent = new Intent(getApplicationContext(), ListaCursosActivity.class);
                startActivity(intent);
            }
        });

        unidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListaUnidadesActivity.class);
                startActivity(intent);
            }
        });
    }
}