package com.tcc.descubrasuaetec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class ListaCursos extends AppCompatActivity {

    private BDSQLiteHelper bd;
    ArrayList<EtecBean> listaCursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);

        bd = new BDSQLiteHelper(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        ListView lista = findViewById(R.id.lvCursos);

        // USANDO METODO DO BDSQLITEHEPLER PARA PEGAR TODOS OS CURSOS
        // E USANDO O ADAPTER DOS CURSOS PARA INSERIR NA LISTVIEW
        listaCursos = bd.getAllCursos();

        CursoAdapter adapter = new CursoAdapter(this, listaCursos);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // COLOCAR DADOS NA INTENT DE ACORDO COM O CURSO CLICADO E ENCAMINHAR PARA A TELA DO CURSO
                Intent intent = new Intent(ListaCursos.this, TelaCursos.class);
                intent.putExtra("NOME", listaCursos.get(position).getNomeCurso());
                intent.putExtra("DESCRICAO", listaCursos.get(position).getDescCurso());
                intent.putExtra("PROFISSIONAL", listaCursos.get(position).getProfissionalCurso());
                intent.putExtra("TIPO",  listaCursos.get(position).getTipoCurso());
                intent.putExtra("LINK",  listaCursos.get(position).getLinkCurso());

                startActivity(intent);
            }
        });
    }
}