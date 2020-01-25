package com.example.sinprisamexicorepartidor.Modelos;

public class ModeloCatAdministrador {

    public int inAdministradorPK;
    public String nvUsuario;
    public String nvContrasena;
    public boolean biEstatus;


    public ModeloCatAdministrador( int inAdministradorPK, String nvUsuario, String nvContrasena, boolean biEstatus) {

        this.inAdministradorPK = inAdministradorPK;
        this.nvUsuario = nvUsuario;
        this.nvContrasena = nvContrasena;
        this.biEstatus = biEstatus;
    }


    public int getInAdministradorPK() {
        return inAdministradorPK;
    }

    public String getNvUsuario() {
        return nvUsuario;
    }

    public String getNvContrasena() {
        return nvContrasena;
    }

    public boolean isBiEstatus() {
        return biEstatus;
    }

}
