package com.example.t3_zegarraherrera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton = findViewById(R.id.Registrar);
        boton.setOnClickListener(new BtonClick());

        Button BtonClickmis = findViewById(R.id.MisPoke);
        BtonClickmis.setOnClickListener(new BtonClickmispoke());
    }

    public class  BtonClick implements  View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),RegistrarActivity.class);
            startActivity(intent);
        }
    }

    public class  BtonClickmispoke implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),ListaPokeActivityw.class);
            startActivity(intent);
        }
    }

}