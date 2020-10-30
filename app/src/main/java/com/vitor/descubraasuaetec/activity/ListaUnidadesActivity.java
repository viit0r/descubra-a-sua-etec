package com.vitor.descubraasuaetec.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vitor.descubraasuaetec.R;
import com.vitor.descubraasuaetec.bean.Unidades;
import com.vitor.descubraasuaetec.utils.ListAdapterUnidades;

import java.util.Arrays;
import java.util.List;

public class ListaUnidadesActivity extends AppCompatActivity {

    RecyclerView unidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_unidades);
        //definindo titulo
        getSupportActionBar().setTitle("Unidades");

        unidades = findViewById(R.id.reyclerUnidades);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        unidades.setLayoutManager(layoutManager);
        unidades.setAdapter(new ListAdapterUnidades(lista()));
    }

    private List<Unidades> lista(){

        return Arrays.asList(
                new Unidades("Titulo 1", "Descrição 1"),
                new Unidades("Titulo 2", "Descrição 2"),
                new Unidades("Titulo 3", "Descrição 3"),
                new Unidades("Titulo 4", "Descrição 4"),
                new Unidades("Titulo 5", "Descrição 5"),
                new Unidades("Titulo 6", "Descrição 6"),
                new Unidades("Titulo 7", "Descrição 7"),
                new Unidades("Titulo 8", "Descrição 8"),
                new Unidades("Titulo 9", "Descrição 9"),
                new Unidades("Titulo 10", "Descrição 10"),
                new Unidades("Titulo 11", "Descrição 11"),
                new Unidades("Titulo 12", "Descrição 12"),
                new Unidades("Titulo 13", "Descrição 13"),
                new Unidades("Titulo 14", "Descrição 14")
        );

    }


}