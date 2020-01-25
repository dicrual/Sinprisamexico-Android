package com.example.sinprisamexicorepartidor.Servicio;

import com.example.sinprisamexicorepartidor.Modelos.ModeloCatAdministrador;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ServicioCatAdministrador {

    @GET("Administrador/Index")
    Call<List<ModeloCatAdministrador>> MetodoObtenerCatAdministrador();

    @POST("Administrador/Crear")
    Call<String> MetodoCrearCatAdministrador(@Query("nvUsuario") String nvUsuario, @Query("nvContrasena") String nvContrasena );
}
