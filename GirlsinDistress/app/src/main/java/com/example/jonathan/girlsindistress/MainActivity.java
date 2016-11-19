package com.example.jonathan.girlsindistress;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton mapa = (ImageButton)findViewById(R.id.btn1);
        ImageButton denuncias =(ImageButton)findViewById(R.id.btn2);
        ImageButton informacion = (ImageButton)findViewById(R.id.btn3);
        ImageButton contacto = (ImageButton)findViewById(R.id.btn4);
        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VentanaContacto = new Intent(MainActivity.this, com.example.jonathan.girlsindistress.VentanaContacto.class);
            startActivity(VentanaContacto);
            }
        });
        informacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VentanaInfo= new Intent(MainActivity.this, com.example.jonathan.girlsindistress.VentanaInfo.class);
                startActivity(VentanaInfo);
            }
        });
        denuncias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VentanaDenuncias = new Intent(MainActivity.this, com.example.jonathan.girlsindistress.VentanaDenuncias.class);
                startActivity(VentanaDenuncias);
            }
        });
        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ventanaMapa = new Intent(MainActivity.this,VentanaMapa.class);
                startActivity(ventanaMapa);
            }
        });
    }
}
