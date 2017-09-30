package com.example.bry.lista;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VCilindro extends AppCompatActivity {
    private EditText alturacilindro;
    private EditText radiocilindro;
    private Intent i;
    private Bundle b;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vcilindro);
        alturacilindro = (EditText)findViewById(R.id.txtAlturacilindro);
        radiocilindro = (EditText)findViewById(R.id.txtRadioaltura);
        res = this.getResources();
        i = new Intent(this,RCilindro.class);
        b = new Bundle();
    }

    public void Cilindro(View v){
        String rad, alt, aux="";
        int radio,altura;
        double pi=3.1416,res;

        if(validar()){
            rad = radiocilindro.getText().toString();
            radio = Integer.parseInt(rad);

            alt = alturacilindro.getText().toString();
            altura = Integer.parseInt(alt);

            res = altura*radio*pi;
            aux = aux+res;

            b.putString("ResultadoCilindro", aux);
            i.putExtras(b);
            alturacilindro.setText("");
            radiocilindro.setText("");
            startActivity(i);

        }
    }

    public void borrar(View v){
        alturacilindro.setText("");
        radiocilindro.setText("");
    }

    public boolean validar(){
        if(radiocilindro.getText().toString().isEmpty()){
            radiocilindro.setError(res.getString(R.string.campo_vacio));

            return false;
        }
        if(alturacilindro.getText().toString().isEmpty()){
            alturacilindro.setError(res.getString(R.string.campo_vacio));
            return false;
        }
        return true;
    }
}
