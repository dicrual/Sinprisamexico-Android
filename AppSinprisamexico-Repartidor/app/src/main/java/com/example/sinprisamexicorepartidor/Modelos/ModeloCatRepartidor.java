package com.example.sinprisamexicorepartidor.Modelos;

import java.math.BigInteger;

public class ModeloCatRepartidor {

    public int inRepartidorPK;
    public int inAlmacenFK;
    public String nvNombre;
    public String nvPaterno;
    public String nvMaterno;
    public String nvImagen;
    public Long bigTelefono;
    public String nvToken;

    public ModeloCatRepartidor(int inRepartidorPK, int inAlmacenFK, String nvNombre, String nvPaterno, String nvMaterno, String nvImagen, Long bigTelefono, String nvToken) {
        this.inRepartidorPK = inRepartidorPK;
        this.inAlmacenFK = inAlmacenFK;
        this.nvNombre = nvNombre;
        this.nvPaterno = nvPaterno;
        this.nvMaterno = nvMaterno;
        this.nvImagen = nvImagen;
        this.bigTelefono = bigTelefono;
        this.nvToken = nvToken;
    }

    public int getInRepartidorPK() {
        return inRepartidorPK;
    }

    public int getInAlmacenFK() {
        return inAlmacenFK;
    }

    public String getNvNombre() {
        return nvNombre;
    }

    public String getNvPaterno() {
        return nvPaterno;
    }

    public String getNvMaterno() {
        return nvMaterno;
    }

    public String getNvImagen() {
        return nvImagen;
    }

    public Long getBigTelefono() {
        return bigTelefono;
    }

    public String getNvToken() {
        return nvToken;
    }
}
