package com.tcc.descubrasuaetec;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView btnUnidade;
    private ImageView btnCursos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUnidade = findViewById(R.id.btnUnid);
        btnCursos = findViewById(R.id.btnCurso);

        //ABRE TELA DA LISTA DE UNIDADE
        btnUnidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaUnidade.class);
                startActivity(intent);
            }
        });

        //ABRE TELA DA LISTA DE CURSOS
        btnCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListaCursos.class);
                startActivity(intent);
            }
        });
    }

    //CRIAR O MENU DE OPÇÕES
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //VERIFICAR O ITEM SELECIONADO E ABRIR A TELA
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

         if(id == R.id.action_sobre){

            Intent intent = new Intent(MainActivity.this, SobreActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}