package com.vitor.descubraasuaetec.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.vitor.descubraasuaetec.R;
import com.vitor.descubraasuaetec.bean.Unidades;
import com.vitor.descubraasuaetec.utils.DBController;
import com.vitor.descubraasuaetec.utils.ListAdapterUnidades;

import java.util.List;

public class ListaUnidadesActivity extends AppCompatActivity {

    RecyclerView unidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_unidades);
        //DEFININDO TITULO E BOTÃO HOME NA ACTIONBAR
        getSupportActionBar().setTitle("Unidades");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        unidades = findViewById(R.id.reyclerUnidades);

        //DEFININDO ADAPTER E O LAYOUTMANAGER DE UNIDADES
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        unidades.setLayoutManager(layoutManager);
        unidades.setAdapter(new ListAdapterUnidades(listaUnidades()));
    }

    //METODO CHAMANDO O METODO DE SELECT UNIDADES
    private List<Unidades> listaUnidades(){
        DBController dbController = new DBController(this);
        return dbController.selecionaTudoUnidades();
    }

    //CONFIGURANDO O BOTAO HOME
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