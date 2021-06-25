package com.df.whisky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.df.whisky.ApiManager.RetrofitClient;
import com.df.whisky.models.Whisky;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listaWhiskys;
    List<Whisky> myWhiskys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "arranco", Toast.LENGTH_SHORT).show();
        listaWhiskys = findViewById(R.id.lvWhiskys);
        getWhiskysFromApi();
        listaWhiskys.setOnItemClickListener(this);
    }
    private void getWhiskysFromApi() {
        Call<List<Whisky>> call = RetrofitClient.getInstance().getMiApi().getWiskys();
        call.enqueue(new Callback<List<Whisky>>() {
            @Override
            public void onResponse(Call<List<Whisky>> call, Response<List<Whisky>> response) {
                myWhiskys = response.body();

                WhiskyAdapter adapter = new WhiskyAdapter(MainActivity.this,myWhiskys);
                listaWhiskys.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Whisky>> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Ocurrió un error", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this,WhiskyDetalle.class);
        intent.putExtra("objetoWhisky", myWhiskys.get(position));
        startActivity(intent);

    }
}