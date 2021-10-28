package com.example.t3_zegarraherrera;

public class Pokemons {
    public String nombre;
    public  String url;
    public  String tipo;
    public  String latitud;
    public String longitud;

    public Pokemons(String nombre, String url, String tipo, String latitud, String longitud) {
        this.nombre = nombre;
        this.url = url;
        this.tipo = tipo;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Pokemons() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }
}
