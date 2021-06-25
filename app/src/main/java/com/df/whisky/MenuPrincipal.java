package com.df.whisky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnWhiskys;
    private ImageButton btnDestilerias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btnWhiskys = findViewById(R.id.btnWhiskys);
        btnDestilerias = findViewById(R.id.btnDestilerias);
        btnWhiskys.setOnClickListener(this);
        btnDestilerias.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnWhiskys) {
            Intent intentWhiskys = new Intent(this, MainActivity.class);
            startActivity(intentWhiskys);
        } else if (v.getId()==R.id.btnDestilerias){
            Intent intentDestilerias = new Intent(this, Destilerias.class);
            startActivity(intentDestilerias);
        }
    }
}