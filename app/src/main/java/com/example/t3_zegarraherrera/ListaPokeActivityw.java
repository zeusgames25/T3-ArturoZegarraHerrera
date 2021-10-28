package com.example.t3_zegarraherrera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.t3_zegarraherrera.Adapters.PokesAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes;

public class ListaPokeActivityw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_poke_activityw);

        RecyclerView rv =  findViewById(R.id.rvPokes);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        List<Pokemons> datos = Arrays.asList(new Pokemons("PIKACHU","jkdcdjk","electrico","0","0"));
        PokesAdapter adapter = new PokesAdapter(datos);
        rv.setAdapter(adapter);
    }
}