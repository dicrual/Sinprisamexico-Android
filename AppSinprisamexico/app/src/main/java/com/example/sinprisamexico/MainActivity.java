package com.example.sinprisamexico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.widget.Toast;

import com.example.sinprisamexico.Conexion.ConexionSinprisa;
import com.example.sinprisamexico.Modelos.ModeloCatAdministrador;
import com.example.sinprisamexico.Servicio.ServicioCatAdministrador;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ServicioCatAdministrador servicioCatAdministrador = ConexionSinprisa.ObtenerConexion().create(ServicioCatAdministrador.class);
       // Call<List<ModeloCatAdministrador>> modeloCatAdministradorCall = servicioCatAdministrador.MetodoObtenerCatAdministrador();
        Call<String> metodoCrearCatAdministrador = servicioCatAdministrador.MetodoCrearCatAdministrador("Diego", "12345");

        metodoCrearCatAdministrador.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String Resultado = response.body();
                Toast.makeText(MainActivity.this, Resultado, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
            }
        });


       // modeloCatAdministradorCall.enqueue(new Callback<List<ModeloCatAdministrador>>() {
         //   @Override
          //  public void onResponse(Call<List<ModeloCatAdministrador>> call, Response<List<ModeloCatAdministrador>> response) {

            //    List<ModeloCatAdministrador> modeloCatAdministradors = response.body();
             //   Toast.makeText(MainActivity.this, "Correcto", Toast.LENGTH_LONG).show();
            //}

            //@Override
            //public void onFailure(Call<List<ModeloCatAdministrador>> call, Throwable t) {

              //  Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
            //}
        //});

        //
       // ModeloCatAdministrador modeloCatAdministrador = gson.fromJson()
    }
}
