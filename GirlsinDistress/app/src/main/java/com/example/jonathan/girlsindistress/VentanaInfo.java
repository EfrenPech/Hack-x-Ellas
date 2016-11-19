package com.example.jonathan.girlsindistress;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VentanaInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_info);

        Button boton1 = (Button)findViewById(R.id.Igualdad);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //       Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
                Intent button_uno = new Intent(VentanaInfo.this, Igualdad.class);
                startActivity(button_uno);
            }
        });

        Button boton2 = (Button)findViewById(R.id.Educacion);
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //       Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
                Intent button_dos = new Intent(VentanaInfo.this, Educacion.class);
                startActivity(button_dos);
            }
        });

        Button boton3 = (Button)findViewById(R.id.Salud);
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //       Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
                Intent button_tres = new Intent(VentanaInfo.this, Salud.class);
                startActivity(button_tres);
            }
        });

        Button boton4 = (Button)findViewById(R.id.Violencia);
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //       Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
                Intent button_cuatro = new Intent(VentanaInfo.this, Violencia.class);
                startActivity(button_cuatro);
            }
        });

        Button boton5 = (Button)findViewById(R.id.Trabajo);
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //       Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
                Intent button_cinco = new Intent(VentanaInfo.this, Trabajo.class);
                startActivity(button_cinco);
            }
        });

        Button boton6 = (Button)findViewById(R.id.Desarrollo);
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //       Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
                Intent button_seis = new Intent(VentanaInfo.this, Desarrollo.class);
                startActivity(button_seis);
            }
        });

        Button boton7 = (Button)findViewById(R.id.Politica);
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //       Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
                Intent button_siete = new Intent(VentanaInfo.this, Politica.class);
                startActivity(button_siete);
            }
        });

        Button boton8 = (Button)findViewById(R.id.Ambiente);
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //       Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
                Intent button_ocho = new Intent(VentanaInfo.this, Ambiente.class);
                startActivity(button_ocho);
            }
        });

        Button boton9 = (Button)findViewById(R.id.Informacion);
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //       Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
                Intent button_nueve = new Intent(VentanaInfo.this, Informacion.class);
                startActivity(button_nueve);
            }
        });
    }
}
