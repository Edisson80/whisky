package com.df.whisky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.df.whisky.models.Distillery;

public class DestileriaDetalle extends AppCompatActivity {
    TextView nameDestileria;
    TextView slugDestileria;
    TextView countryDestileria;
    TextView whiskiesDestileria;
    TextView votesDestileria;
    TextView ratingDestileria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destileria_detalle);

        nameDestileria = findViewById(R.id.txtNameDestileriaDetalle);
        slugDestileria = findViewById(R.id.txtSlugDestileriaDetalle);
        countryDestileria = findViewById(R.id.txtCountryDestileriaDetalle);
        whiskiesDestileria = findViewById(R.id.txtWhiskiesDestileriaDetalle);
        votesDestileria = findViewById(R.id.txtVotesDestileriaDetalle);
        ratingDestileria = findViewById(R.id.txtRatingDestileriaDetalle);
        Distillery distillery = (Distillery) getIntent().getSerializableExtra("objetoDestileria");
        nameDestileria.setText("NOMBRE DESTILERIA: "+ distillery.getNombreDestileria());
        slugDestileria.setText("SLUG DE LA DESTILERIA: "+ distillery.getSlugDestileria());
        countryDestileria.setText("PAIS:"+distillery.getCountryDestileria());
        whiskiesDestileria.setText("WHISKYS DE LA DESTILERIA: "+ distillery.getWhiskybase_whiskiesDestileria());
        votesDestileria.setText("VOTOS DE LA DESTILERIA: "+distillery.getWhiskybase_votesDestileria());
        ratingDestileria.setText("REITING DE LA DESTILERIA: "+ distillery.getWhiskybase_ratingDestileria());
    }
}