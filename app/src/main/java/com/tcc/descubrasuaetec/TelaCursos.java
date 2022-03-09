package com.tcc.descubrasuaetec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TelaCursos extends AppCompatActivity {

    private TextView desc;
    private TextView profissional;
    private TextView tipo;
    private TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cursos);

        desc = findViewById(R.id.cursoDesc);
        profissional = findViewById(R.id.cursoProf);
        tipo = findViewById(R.id.cursoTipo);
        link = findViewById(R.id.cursoLink);

        //PEGAR ITENS DA LISTA
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {

            // ALTERANDO NOME DA ACTIONBAR PARA NOME DO CURSO
            String dataNomeCurso = bundle.getString("NOME");
            getSupportActionBar().setTitle(dataNomeCurso);

            // PEGANDO OS DADOS E COLOCANDO NA TEXTVIEW ESPECIFICADA
            String dataDesc = bundle.getString("DESCRICAO");
            desc.setText(dataDesc);
            String dataProf = bundle.getString("PROFISSIONAL");
            profissional.setText(dataProf);
            String dataTipo = bundle.getString("TIPO");
            tipo.setText(dataTipo);
            String dataLink = bundle.getString("LINK");
            link.setText(dataLink);

        }
    }
}