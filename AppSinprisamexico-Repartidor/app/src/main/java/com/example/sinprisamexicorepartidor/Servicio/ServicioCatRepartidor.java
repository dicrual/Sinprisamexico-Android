package com.example.sinprisamexicorepartidor.Servicio;

import com.example.sinprisamexicorepartidor.Modelos.ModeloCatRepartidor;

import java.math.BigInteger;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServicioCatRepartidor {


    @GET("Repartidor/Index")
    Call<List<ModeloCatRepartidor>> MetodoObtenerCatRepartidor(@Query("bigTelefono") long bigTelefono, @Query("nvContrasena") String nvContrasena);

    @GET("Repartidors/{id}")
    Call <List<ModeloCatRepartidor>> MetodoObtenerCatRepartidorId(@Path("id") int groupId);
}
