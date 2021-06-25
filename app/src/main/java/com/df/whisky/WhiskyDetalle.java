package com.df.whisky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.df.whisky.models.Whisky;

public class WhiskyDetalle extends AppCompatActivity implements View.OnClickListener {

    TextView nombreWhisky;
    TextView slugWhisky;
    TextView buyersFeeWhisky;
    TextView sellersFeeWhisky;
    TextView reserveFeeWhisky;
    TextView listingFeeWhisky;
    TextView baseCurrencyWhisky;
    Button btnVisitar;
    String enlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whisky_detalle);
        nombreWhisky = findViewById(R.id.txtNameWhiskyDetalle);
        slugWhisky = findViewById(R.id.txtSlugWhiskyDetalle);
        buyersFeeWhisky = findViewById(R.id.txtBuyersFeeWhiskyDetalle);
        sellersFeeWhisky = findViewById(R.id.txtSellersFeeWhiskyDetalle);
        reserveFeeWhisky = findViewById(R.id.txtReserveFeeWhiskyDetalle);
        listingFeeWhisky = findViewById(R.id.txtListingFeeWhiskyDetalle);
        baseCurrencyWhisky = findViewById(R.id.txtBaseCurrencyWhiskyDetalle);
        btnVisitar = findViewById(R.id.btnVisitar);
        btnVisitar.setOnClickListener(this);
        Whisky whisky = (Whisky) getIntent().getSerializableExtra("objetoWhisky");
        nombreWhisky.setText("NOMBRE DEL WHISKY: "+ whisky.getNombreWisky());
        slugWhisky.setText("SLUG DEL WHISKY: "+whisky.getSlugWisky());
        buyersFeeWhisky.setText("TARIFA DE COMPRADORES: "+whisky.getBuyers_feeWisky());
        sellersFeeWhisky.setText("TARIFA VENDEDORES : "+whisky.getSellers_feeWisky());
        reserveFeeWhisky.setText("TARIFA DE RESERVA : "+whisky.getReserve_feeWisky());
        listingFeeWhisky.setText("TARIFA DE LISTADO : "+whisky.getListing_feeWisky());
        baseCurrencyWhisky.setText("TARIFA DE MONEDA :"+whisky.getBase_currencyWisky());
        enlace = whisky.getUrlWisky();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnVisitar) {
            Uri uri = Uri.parse(enlace);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}