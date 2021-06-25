package com.df.whisky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.df.whisky.ApiManager.RetrofitClient;
import com.df.whisky.models.Distillery;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Destilerias extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lvDestilerias;
    List<Distillery> listaDestilerias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destilerias);
        lvDestilerias = findViewById(R.id.lvDestilerias);
        getDestileriasFromApi();
        lvDestilerias.setOnItemClickListener(this);
    }

    private void getDestileriasFromApi() {
        Call<List<Distillery>> call = RetrofitClient.getInstance().getMiApi().getDistilleries();
        call.enqueue(new Callback<List<Distillery>>() {
            @Override
            public void onResponse(Call<List<Distillery>> call, Response<List<Distillery>> response) {
                listaDestilerias = response.body();
                DestileriaAdapter adapter = new DestileriaAdapter(Destilerias.this, listaDestilerias);
                lvDestilerias.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Distillery>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Ocurrió un error", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, DestileriaDetalle.class);
        intent.putExtra("objetoDestileria", listaDestilerias.get(position));
        startActivity(intent);
    }
}