package com.example.bry.lista;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RCuadrado extends AppCompatActivity {
    private TextView enviado;
    private Bundle b;
    private String resultado, aux;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcuadrado);
        enviado = (TextView)findViewById(R.id.txtResultado);
        b = getIntent().getExtras();
        resultado = b.getString("ResultadoCuadrado");
        res = this.getResources();

        aux = resultado;

        enviado.setText(aux);
    }
}
