package com.example.bry.lista;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VEsfera extends AppCompatActivity {
    private EditText radioesfera;
    private Intent i;
    private Bundle b;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vesfera);
        radioesfera = (EditText)findViewById(R.id.txtRadioesfera);
        res = this.getResources();

        i = new Intent(this,REsfera.class);
        b = new Bundle();
    }

    public void Esfera(View v){
        String radio, aux="";
        int radio2;
        double vol;
        double pi=3.14;

        if(validar()){
            radio = radioesfera.getText().toString();
            radio2 = Integer.parseInt(radio);

            vol = ((radio2)*(radio2)*(radio2))*(3.0/4.0)*pi;

            aux = aux+vol;
            radioesfera.setText("");
            b.putString("ResultadoEsfera", aux);
            i.putExtras(b);

            startActivity(i);
        }
    }

    public void Borrar(View v){
        radioesfera.setText("");
    }

    public boolean validar(){
        if(radioesfera.getText().toString().isEmpty()){
            radioesfera.setError(res.getString(R.string.campo_vacio));
            return false;
        }
        return true;
    }
}
