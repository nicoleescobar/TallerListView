package com.example.bry.lista;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VCuadrado extends AppCompatActivity {

    private EditText ladocuadrado;
    private Intent i;
    private Bundle b;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vcuadrado);

        ladocuadrado = (EditText)findViewById(R.id.txtLadoCuadrado);
        res = this.getResources();

        i = new Intent(this,RCuadrado.class);
        b = new Bundle();
    }

    public void Cuadrado(View v){
        String lado, aux="";
        int lado2;

        if(validar()){
            lado = ladocuadrado.getText().toString();
            lado2 = Integer.parseInt(lado);

            lado2 = lado2*lado2;
            aux = aux+lado2;
            ladocuadrado.setText("");
            b.putString("ResultadoCuadrado", aux);
            i.putExtras(b);

            startActivity(i);
        }
    }

    public void borrar(View v){
        ladocuadrado.setText("");
    }

    public boolean validar(){
        if(ladocuadrado.getText().toString().isEmpty()){
            ladocuadrado.setError(res.getString(R.string.campo_vacio));
            return false;
        }
        return true;
    }
}