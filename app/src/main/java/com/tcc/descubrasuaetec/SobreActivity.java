package com.tcc.descubrasuaetec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SobreActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        texto = findViewById(R.id.textSobreId);

        texto.setText("O aplicativo foi realizado em Java Android. Sistema mobile informativo. Feito durante o desenvolvimento do TCC, na instituição Etec Irmã Agostina, produzido para conclusão do curso de técnico de informática.");
    }
}
