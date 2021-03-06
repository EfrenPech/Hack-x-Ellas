package com.example.jonathan.girlsindistress;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageButton;
import android.widget.Button;
import android.view.View;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;

import static android.net.Uri.parse;

public class VentanaContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_ventana_contacto);
        ImageButton tw_ciam = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton fb_ciam = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton tel_ciam = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton tel_pgr = (ImageButton) findViewById(R.id.t1);
        Button tel_b_pgr = (Button) findViewById(R.id.telpgr);
        Button tw_b_ciam = (Button) findViewById(R.id.button2);
        Button fb_b_ciam = (Button) findViewById(R.id.button3);
        Button tel_b_ciam = (Button) findViewById(R.id.button4);

        fb_b_ciam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = parse("https://www.facebook.com/ciamcancun/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        tw_b_ciam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = parse("https://twitter.com/ciam_cancun");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        fb_ciam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = parse("https://www.facebook.com/ciamcancun/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        tw_ciam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = parse("https://twitter.com/ciam_cancun");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        tel_ciam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8980755"));

                if (ActivityCompat.checkSelfPermission(VentanaContacto.this
                        ,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(intent);
            }
        });

        tel_b_ciam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:8980755"));

                if (ActivityCompat.checkSelfPermission(VentanaContacto.this
                        ,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(intent);
            }
        });

        tel_b_pgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:998881960"));

                if (ActivityCompat.checkSelfPermission(VentanaContacto.this
                        ,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(intent);
            }
        });

        tel_pgr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:998881960"));

                if (ActivityCompat.checkSelfPermission(VentanaContacto.this
                        ,Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(intent);
            }
        });

    }
}
