package com.example.android.taller_clase;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class principal extends AppCompatActivity {
    private TextView respuesta;
    private EditText numero_zapatos;
    private Resources resources;
    private Spinner genero_spiner;
    private Spinner tipo_spiner;
    private Spinner marca_spiner;
    private String genero_vector[];
    private String tipo_vector[];
    private String marca_vector[];
    double total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        respuesta=(TextView)findViewById(R.id.lblresultado);
        numero_zapatos=(EditText)findViewById(R.id.txtNumero);
        genero_spiner=(Spinner) findViewById(R.id.cbxGenero);
        tipo_spiner=(Spinner) findViewById(R.id.cbxTipo);
        marca_spiner=(Spinner) findViewById(R.id.cbxmarca);
        resources=this.getResources();
        genero_vector=resources.getStringArray(R.array.genero_array);
        tipo_vector=resources.getStringArray(R.array.tipo_array);
        marca_vector=resources.getStringArray(R.array.marca_array);

        ArrayAdapter<String> adapter_genero = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,genero_vector);
        genero_spiner.setAdapter(adapter_genero);
        ArrayAdapter<String> adapter_tipo = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,tipo_vector);
        tipo_spiner.setAdapter(adapter_tipo);
        ArrayAdapter<String> adapter_marca= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,marca_vector);
        marca_spiner.setAdapter(adapter_marca);
    }

    public void Calcular(View v) {
        int opcion_genero = genero_spiner.getSelectedItemPosition();
        int opcion_marca = marca_spiner.getSelectedItemPosition();
        int opcion_tipo = tipo_spiner.getSelectedItemPosition();
        double valor = 0;
        if (Metodos.ValidarCampos(numero_zapatos.getText().toString()) == false) {
            numero_zapatos.setError(resources.getString(R.string.mensaje_error_uno));
        } else {


            int num=Integer.parseInt(numero_zapatos.getText().toString());
            valor = Metodos.Validar(opcion_genero,opcion_tipo,opcion_marca,num);
            total=num*valor+total;
             double total2=num*valor;
            respuesta.setText(total2 + "");

        }
    }

    public void Terminar(View v){
        numero_zapatos.setText("");
        respuesta.setText("");

        numero_zapatos.requestFocus();
        Toast.makeText(this,"Compra Finalizada Total A pagar: "+total,Toast.LENGTH_SHORT).show();
        total=0;
    }

}


