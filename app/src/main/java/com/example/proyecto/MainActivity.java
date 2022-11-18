package com.example.proyecto;

import android.content.Intent;
import static java.lang.Thread.sleep;

import android.os.Bundle;

import com.example.proyecto.Json.JsonSingleton;
import com.example.proyecto.Json.Municipio;
import com.example.proyecto.databinding.ActivityMainBinding;
import com.example.proyecto.ui.inicio.InicioFragment;
import com.google.gson.stream.JsonReader;

import android.view.View;

import com.example.proyecto.Room.AppDatabase;

import androidx.navigation.ui.AppBarConfiguration;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.google.gson.Gson;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        // Cargamos la base de datos (en la primera vez, se crea)
        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "database.db").build();

        // Cargamos los JSON en la base de datos
        cargarJSON_en_Singleton();

        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        DrawerLayout drawer = binding.drawerLayout;

        InicioFragment x = new InicioFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.app_bar_main, x)
                .commit();

        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    

    public void cargarJSON_en_Singleton(){

        // CÓDIGO DE MUNICIPIOS
        JsonReader readerMunicipios = new JsonReader(new InputStreamReader(getResources().openRawResource(R.raw.codmunicipios)));
        List<Municipio> municipioList = Arrays.asList(new Gson().fromJson(readerMunicipios, Municipio[].class));

        for (Municipio m: municipioList) {
            JsonSingleton.getInstance().municipioMap.put(m.getMunicipio(), new Municipio(m.getCodigo(), m.getMunicipio(), m.getProvincia()));
        }
    }


}