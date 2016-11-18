package com.example.jonathan.girlsindistress;

import android.content.Intent;
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
        ImageButton orderButton = (ImageButton)findViewById(R.id.imageButton12);
        //--- BOTON QUE REDIRECCIONA A OTRA ACTIVIDAD--//
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //       Intent intent = new Intent(FirstActivity.this, OrderScreen.class);
                Intent button_uno = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(button_uno);
            }
        });
    }
}
