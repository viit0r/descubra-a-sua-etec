package com.tcc.descubrasuaetec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TelaInicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ESCONDENDO ACTIONBAR
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_inicio);

        //CRIANDO TELA COM TEMPORIZADOR PARA INICIALIZAR O APP
        Thread timerInicio  = new Thread() {
            @Override
            public void run() {

                try{
                    sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent (TelaInicio.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };

        timerInicio.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}