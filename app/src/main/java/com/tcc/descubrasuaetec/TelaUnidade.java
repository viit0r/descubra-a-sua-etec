package com.tcc.descubrasuaetec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaUnidade extends AppCompatActivity {

    private TextView cursos;
    private TextView etim;
    private TextView endereco;
    private TextView site;
    private TextView tel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_unidade);

        cursos = findViewById(R.id.cursoId);
        etim = findViewById(R.id.etimId);
        endereco = findViewById(R.id.enderecoId);
        site = findViewById(R.id.siteId);
        tel = findViewById(R.id.telefoneId);

        // PEGAR ITENS DA LISTA
        Bundle bundle = getIntent().getExtras();

        //
        if (bundle != null){

            // ALTERANDO NOME DA ACTIONBAR PARA NOME DA UNIDADE
            String dataNome = bundle.getString("NOME");
            getSupportActionBar().setTitle(dataNome);

            // PEGANDO OS DADOS E COLOCANDO NA TEXTVIEW ESPECIFICADA
            String dataCursos = bundle.getString("CURSOS");
            cursos.setText(dataCursos);
            String dataEtim = bundle.getString("ETIM");
            etim.setText(dataEtim);
            String dataEndereco = bundle.getString("ENDERECO");
            endereco.setText(dataEndereco);
            String dataSite = bundle.getString("SITE");
            site.setText(dataSite);
            String dataTel = bundle.getString("TEL");
            tel.setText(dataTel);

        }

    }
}
