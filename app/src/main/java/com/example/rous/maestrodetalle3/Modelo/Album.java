package com.example.rous.maestrodetalle3.Modelo;

import java.util.ArrayList;

/**
 * Created by rous on 11/11/16.
 */

public class Album {
    String artista;
    String titulo;
    String fecha;
    String genero;
    int numeroPistas;
    int imgAlbun;
    ArrayList<String> pistas;

    public Album(String artista, String titulo, String fecha, String genero,
                 int numeroPistas, int imgAlbun, ArrayList<String> pistas) {
        this.artista = artista;
        this.titulo = titulo;
        this.fecha = fecha;
        this.genero = genero;
        this.numeroPistas = numeroPistas;
        this.imgAlbun = imgAlbun;
        this.pistas = pistas;
    }

    public int getImgAlbun() {
        return imgAlbun;
    }

    public String getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public String getGenero() {
        return genero;
    }

    public int getNumeroPistas() {
        return numeroPistas;
    }

    public ArrayList<String> getPistas() {
        return pistas;
    }

}
