package com.tcc.descubrasuaetec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class ListaUnidade extends AppCompatActivity {

    private BDSQLiteHelper bd;
    ArrayList<EtecBean> listaEtecs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_unidade);

        bd = new BDSQLiteHelper(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        ListView lista = findViewById(R.id.lvUnidade);

        // USANDO METODO DO BDSQLITEHEPLER PARA PEGAR TODOS OS CURSOS
        // E USANDO O ADAPTER DOS CURSOS PARA INSERIR NA LISTVIEW
        listaEtecs = bd.getAllEtec();

        UnidadeAdapter adapter = new UnidadeAdapter(this, listaEtecs);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // COLOCAR DADOS NA INTENT DE ACORDO COM A UNIDADE CLICADA E ENCAMINHAR PARA A TELA DA UNIDADE
                Intent intent = new Intent(ListaUnidade.this, TelaUnidade.class);
                intent.putExtra("NOME", listaEtecs.get(position).getNome());
                intent.putExtra("CURSOS", listaEtecs.get(position).getCurso());
                intent.putExtra("ETIM", listaEtecs.get(position).getEtim());
                intent.putExtra("ENDERECO", listaEtecs.get(position).getEndereco());
                intent.putExtra("SITE", listaEtecs.get(position).getSite());
                intent.putExtra("TEL", listaEtecs.get(position).getTelefone());

                startActivity(intent);
            }
        });
    }
}