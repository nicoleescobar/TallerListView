package com.example.bry.lista;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RCilindro extends AppCompatActivity {
    private TextView enviado;
    private Bundle b;
    private String resultado, aux;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcilindro);
        enviado = (TextView)findViewById(R.id.txtRespuestacilindro);
        b = getIntent().getExtras();
        resultado = b.getString("ResultadoCilindro");
        res = this.getResources();

        aux = resultado;

        enviado.setText(aux);
    }
}
