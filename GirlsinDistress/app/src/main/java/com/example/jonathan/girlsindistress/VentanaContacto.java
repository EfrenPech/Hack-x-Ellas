package com.example.jonathan.girlsindistress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Button;
import android.view.View;
import android.net.Uri;
import android.content.Intent;
public class VentanaContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana_contacto);
        ImageButton tw_ciam = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton fb_ciam = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton tel_ciam = (ImageButton) findViewById(R.id.imageButton4);
        Button tw_b_ciam = (Button) findViewById(R.id.button2);
        Button fb_b_ciam = (Button) findViewById(R.id.button3);
        Button tel_b_ciam = (Button) findViewById(R.id.button4);

        tw_b_ciam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
