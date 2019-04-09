package com.example.ras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText correo, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = (EditText)findViewById(R.id.correo);
        contrasena = (EditText)findViewById(R.id.contrasena);

        setUpToolBar();
        setUpHomeUpIcon(R.drawable.icono_regresar_gris);
    }

    public void setUpToolBar(){
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        showHomeUpIcon();
    }

    public void showHomeUpIcon(){
        if(getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    public void setUpHomeUpIcon(int drawable){
        if(getSupportActionBar()!=null){
            getSupportActionBar().setHomeAsUpIndicator(drawable);
        }
    }

    public void acceder(View view){
        if(correo.getText().toString().equals("") || contrasena.getText().toString().equals("")){
            sesion f=new sesion();
            f.finish();
            Intent intent = new Intent(this, principal.class);
            startActivity(intent);
            finish();
        }
        else {
            Toast.makeText(this, "Correo electronico o contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }
    }

}
