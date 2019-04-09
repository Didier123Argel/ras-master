package com.example.ras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class principal extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        setUpToolBar();
        setUpHomeUpIcon(R.drawable.icono_menu_azul);
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
}
