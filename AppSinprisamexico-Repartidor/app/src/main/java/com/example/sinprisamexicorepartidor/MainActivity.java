package com.example.sinprisamexicorepartidor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sinprisamexicorepartidor.Conexion.Conexion;
import com.example.sinprisamexicorepartidor.Modelos.ModeloCatAdministrador;
import com.example.sinprisamexicorepartidor.Modelos.ModeloCatRepartidor;
import com.example.sinprisamexicorepartidor.Servicio.ServicioCatAdministrador;
import com.example.sinprisamexicorepartidor.Servicio.ServicioCatRepartidor;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText et_bigTelefono, et_nvContrasena;
    private Button btn_Ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GenerarBotones();

        btn_Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    ServicioCatRepartidor servicioCatRepartidor = Conexion.ObtenerConexion().create(ServicioCatRepartidor.class);

                    Long number =  Long. parseLong("2223024637") ;

                    Call<List<ModeloCatRepartidor>> modeloCatRepartidorCall = servicioCatRepartidor.MetodoObtenerCatRepartidor(number,"12345");

                    modeloCatRepartidorCall.enqueue(new Callback<List<ModeloCatRepartidor>>() {
                        @Override
                        public void onResponse(Call<List<ModeloCatRepartidor>> call, Response<List<ModeloCatRepartidor>> response) {

                            List<ModeloCatRepartidor> modeloCatRepartidors = response.body();

                            if (modeloCatRepartidors.size()>0)
                            {
                                String Nombre =  modeloCatRepartidors.get(0).nvNombre + " " + modeloCatRepartidors.get(0).nvPaterno;
                                int inRepartidorPK = modeloCatRepartidors.get(0).inRepartidorPK;

                                MetodoCambiarLayout(inRepartidorPK, Nombre);
                            }
                            else {
                                Toast.makeText(MainActivity.this, "No existe el usuario", Toast.LENGTH_LONG).show();
                            }



                        }

                        @Override
                        public void onFailure(Call<List<ModeloCatRepartidor>> call, Throwable t) {

                            String Respuesta = t.getMessage();
                            Toast.makeText(MainActivity.this, Respuesta + "-Repuesta", Toast.LENGTH_LONG).show();
                        }
                    });


                }
                catch (Exception ex)
                {

                    String Mensaje = ex.toString();
                    Toast.makeText(MainActivity.this, Mensaje + "Catch", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void GenerarBotones ()
    {
        btn_Ingresar = (Button) findViewById(R.id.btn_Ingresar);
        et_bigTelefono = (EditText) findViewById(R.id.et_bigTelefono);
        et_nvContrasena = (EditText) findViewById(R.id.et_nvContrasena);
    }

    private void MetodoCambiarLayout (int inRepartidorPK, String Nombre)
    {
        Intent intent = new Intent(this, Menu.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

}
