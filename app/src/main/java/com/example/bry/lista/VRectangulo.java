package com.example.bry.lista;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VRectangulo extends AppCompatActivity {

    private EditText baserectangulo;
    private EditText alturarectangulo;
    private Intent i;
    private Bundle b;
    private Resources res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrectangulo);

        baserectangulo = (EditText)findViewById(R.id.txtBase);
        alturarectangulo = (EditText)findViewById(R.id.txtAltura);
        res = this.getResources();

        i = new Intent(this,RRectangulo.class);
        b = new Bundle();
    }

    public void Rectangulo(View v){
        String bas, alt, aux="";
        int base,altura,res;

        if(validar()){
            bas = baserectangulo.getText().toString();
            base = Integer.parseInt(bas);

            alt = baserectangulo.getText().toString();
            altura = Integer.parseInt(alt);

            res = base*altura;
            aux = aux+res;

            b.putString("ResultadoRectangulo", aux);
            i.putExtras(b);
            alturarectangulo.setText("");
            baserectangulo.setText("");
            startActivity(i);

        }
    }

    public void borrar(View v){
        alturarectangulo.setText("");
        baserectangulo.setText("");
    }

    public boolean validar(){
        if(baserectangulo.getText().toString().isEmpty()){
            baserectangulo.setError(res.getString(R.string.campo_vacio));

            return false;
        }
        if(alturarectangulo.getText().toString().isEmpty()){
            alturarectangulo.setError(res.getString(R.string.campo_vacio));
            return false;
        }
        return true;
    }
}
