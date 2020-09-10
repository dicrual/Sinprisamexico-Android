package com.example.sinprisamexicorepartidor.Conexion;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Conexion {

    public static final String URL = "http://serviciolk.enfa.online/api/";
    private static Retrofit retrofit = null;

    public static Retrofit ObtenerConexion ()
    {


        if (retrofit == null)
        {
            final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(90, TimeUnit.SECONDS)
                    .writeTimeout(90, TimeUnit.SECONDS)
                    .readTimeout(90, TimeUnit.SECONDS)
                    .build();

            retrofit = new Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        return retrofit;
    }
}
