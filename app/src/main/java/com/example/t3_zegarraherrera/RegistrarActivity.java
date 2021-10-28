package com.example.t3_zegarraherrera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        Button boton = findViewById(R.id.btnCapturar);
        boton.setOnClickListener(new BtonClickcap());
    }

    public class  BtonClickcap implements  View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            EditText input = findViewById(R.id.txtNombre);
            String nombre = String.valueOf(input.getText());
            EditText inputUrl = findViewById(R.id.txtUrl);
            String url = String.valueOf(inputUrl.getText());
            EditText inputTipo = findViewById(R.id.txtTipo);
            String tipo = String.valueOf(inputTipo.getText());
            EditText inputLat = findViewById(R.id.txtLatitud);
            String latitud = String.valueOf(inputLat.getText());
            EditText inputLon = findViewById(R.id.txtLongitud);
            String longitud = String.valueOf(inputLon.getText());

            intent.putExtra(nombre,nombre);
            intent.putExtra(url,url);
            intent.putExtra(tipo,tipo);
            intent.putExtra(latitud,latitud);
            intent.putExtra(longitud,longitud);
        }
    }
}