package com.example.jonathan.girlsindistress;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VentanaDenuncias extends MapsActivity {
    TextView latitud = (TextView)findViewById(R.id.Latitud);
    TextView longitud =(TextView)findViewById(R.id.Longitud);
    double latitude=0.0;double longitude=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_denuncias);
       // miUbicacion();
        latitud.setText("Latitud: ");
        longitud.setText("Longitud: ");


    }


}
