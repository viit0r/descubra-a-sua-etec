package com.vitor.descubraasuaetec.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.vitor.descubraasuaetec.R;
import com.vitor.descubraasuaetec.bean.Cursos;
import com.vitor.descubraasuaetec.utils.DBController;
import com.vitor.descubraasuaetec.utils.ListAdapterCursos;

import java.util.List;

public class ListaCursosActivity extends AppCompatActivity {

    RecyclerView cursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
        //DEFININDO TITULO E BOTÃO HOME NA ACTIONBAR
        getSupportActionBar().setTitle("Cursos");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        cursos = findViewById(R.id.recyclerCursos);

        //DEFININDO ADAPTER E O LAYOUTMANAGER DE CURSOS
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        cursos.setLayoutManager(layoutManager);
        cursos.setAdapter(new ListAdapterCursos(listaCursos()));
    }

    //METODO CHAMANDO O METODO DE SELECT CURSOS
    public List<Cursos> listaCursos(){
        DBController dbController = new DBController(this);
        return dbController.selecionaTudoCursos();
    }

    //CONFIGURANDO DO BOTÃO HOME
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}