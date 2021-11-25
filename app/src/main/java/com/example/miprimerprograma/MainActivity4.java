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
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Drawable drawable1, drawable2, drawable3, drawable4;
    ImageView imagen1, imagen2, imagen3, imagen4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Resources res = getResources();
        drawable1 = res.getDrawable(R.drawable.dir1, getTheme());

        imagen1 = (ImageView) findViewById(R.id.image1);
        imagen1.setImageDrawable(drawable1);

        drawable2 = res.getDrawable(R.drawable.dir2, getTheme());
        imagen2 = (ImageView) findViewById(R.id.image2);
        imagen2.setImageDrawable(drawable2);

        drawable3 = res.getDrawable(R.drawable.dir3, getTheme());
        imagen3 = (ImageView) findViewById(R.id.image3);
        imagen3.setImageDrawable(drawable3);

        drawable4 = res.getDrawable(R.drawable.dir4, getTheme());
        imagen4 = (ImageView) findViewById(R.id.image4);
        imagen4.setImageDrawable(drawable4);
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