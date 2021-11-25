package com.example.miprimerprograma;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
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

public class MainActivity extends AppCompatActivity {

    Drawable drawable1;
    ImageView imagen1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.logo1, getTheme());
        imagen1 =(ImageView) findViewById(R.id.logo1);
        imagen1.setImageDrawable(drawable1);

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
