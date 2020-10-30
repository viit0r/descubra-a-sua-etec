package com.vitor.descubraasuaetec.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.vitor.descubraasuaetec.R;
import com.vitor.descubraasuaetec.bean.Cursos;
import com.vitor.descubraasuaetec.utils.ListAdapterCursos;

import java.util.Arrays;
import java.util.List;

public class ListaCursosActivity extends AppCompatActivity {

    RecyclerView cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
        //definindo titulo
        getSupportActionBar().setTitle("Cursos");

        cursos = findViewById(R.id.recyclerCursos);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        cursos.setLayoutManager(layoutManager);
        cursos.setAdapter(new ListAdapterCursos(listaCursos()));
    }

    private List<Cursos> listaCursos(){

        return Arrays.asList(
                new Cursos("Titulo 1", "Descrição 1"),
                new Cursos("Titulo 2", "Descrição 2"),
                new Cursos("Titulo 3", "Descrição 3"),
                new Cursos("Titulo 4", "Descrição 4"),
                new Cursos("Titulo 5", "Descrição 5"),
                new Cursos("Titulo 6", "Descrição 6"),
                new Cursos("Titulo 7", "Descrição 7"),
                new Cursos("Titulo 8", "Descrição 8"),
                new Cursos("Titulo 9", "Descrição 9"),
                new Cursos("Titulo 10", "Descrição 10"),
                new Cursos("Titulo 11", "Descrição 11"),
                new Cursos("Titulo 12", "Descrição 12"),
                new Cursos("Titulo 13", "Descrição 13"),
                new Cursos("Titulo 14", "Descrição 14")
        );

    }
}