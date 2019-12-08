package com.example.sinprisamexico.Conexion;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ConexionSinprisa {
    public static final String URL = "http://servicio.sinprisamexico.com/api/";
    private static Retrofit retrofit = null;

    public static Retrofit ObtenerConexion ()
    {
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        return retrofit;
    }
}
