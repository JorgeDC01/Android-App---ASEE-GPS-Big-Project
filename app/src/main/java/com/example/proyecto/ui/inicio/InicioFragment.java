package com.example.proyecto.ui.inicio;


import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.os.IResultReceiver;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.proyecto.MainActivity;
import com.example.proyecto.databinding.FragmentInicioBinding;
import com.example.proyecto.ui.Eventos.CrearEventoActivity;
import com.example.proyecto.ui.Eventos.DetallesEventoActivity;
import com.example.proyecto.utils.APIManagerDelegate;
import com.example.proyecto.R;
import com.example.proyecto.Room.Modelo.Weather;
import com.example.proyecto.utils.APIManager;

import pl.droidsonroids.gif.GifImageView;

public class InicioFragment extends Fragment{


    private FragmentInicioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentInicioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }



    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}