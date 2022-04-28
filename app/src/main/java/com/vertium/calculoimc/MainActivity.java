package com.vertium.calculoimc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btCalcularM, btLimpiarM;
    private EditText etPesoM, etAlturaM;
    private TextView tvResultadoM;
    private float fPeso,fAltura,fResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btLimpiarM = (Button)findViewById(R.id.btLimpiar);
        etAlturaM =(EditText)findViewById(R.id.etAltura);
        etPesoM =(EditText)findViewById(R.id.etPeso);
        tvResultadoM =(TextView)findViewById(R.id.tvResultado);

        btLimpiarM.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                etAlturaM.setText("");
                etPesoM.setText("");
                tvResultadoM.setText("");
            }
        });
        btCalcularM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fAltura=Float.parseFloat(etAlturaM.getText().toString());
                fPeso=Float.parseFloat(etPesoM.getText().toString());
                fResultado=fPeso/(fAltura*fAltura);
                tvResultadoM.setText("Su IMC es: "+fResultado);

            }
        });
    }
}