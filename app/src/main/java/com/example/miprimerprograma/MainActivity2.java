package com.example.miprimerprograma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
Drawable drawable1, drawable2, drawable3, drawable4;
ImageView imagen1, imagen2, imagen3, imagen4;
Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.chaq4, getTheme());

        imagen1 = (ImageView) findViewById(R.id.image1);
        imagen1.setImageDrawable(drawable1);

        drawable2 = res.getDrawable(R.drawable.chaq3, getTheme());
        imagen2 = (ImageView) findViewById(R.id.image2);
        imagen2.setImageDrawable(drawable2);

        drawable3 = res.getDrawable(R.drawable.chaq2, getTheme());
        imagen3 = (ImageView) findViewById(R.id.image3);
        imagen3.setImageDrawable(drawable3);

        drawable4 = res.getDrawable(R.drawable.chaq1, getTheme());
        imagen4 = (ImageView) findViewById(R.id.image4);
        imagen4.setImageDrawable(drawable4);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Se compra el producto 1", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Se compra el producto 2", Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Se compra el producto 3", Toast.LENGTH_SHORT).show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Se compra el producto 4", Toast.LENGTH_SHORT).show();
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater infalter = getMenuInflater();
        infalter.inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.menuProductos){
            Intent pantallaProductos = new Intent(getApplicationContext(),MainActivity2.class);
            startActivity(pantallaProductos);
            Toast.makeText(getApplicationContext(), "Catálogo de productos", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.menuServicios){
            Intent pantallaServicios = new Intent(getApplicationContext(),MainActivity3.class);
            startActivity(pantallaServicios);
            Toast.makeText(getApplicationContext(), "Servicios", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.menuSucursales){
            Intent pantallaSucursales = new Intent(getApplicationContext(),MainActivity4.class);
            startActivity(pantallaSucursales);
            Toast.makeText(getApplicationContext(), "Sucursales", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    }