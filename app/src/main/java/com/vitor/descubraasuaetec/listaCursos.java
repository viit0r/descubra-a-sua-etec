package com.vitor.descubraasuaetec.adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.vitor.descubraasuaetec.R;

public class listaCursos extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
        //definindo titulo
        getSupportActionBar().setTitle("Cursos");

        recyclerView = findViewById(R.id.recyclerCursos);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new adapterCurso(myDataset);
        recyclerView.setAdapter(adapter);

    }
}