package com.example.rous.maestrodetalle3.Modelo;

import com.example.rous.maestrodetalle3.R;

import java.util.ArrayList;

/**
 * Created by rous on 11/11/16.
 */

public class MockAlbum {
    ArrayList<Album> albunes= new ArrayList<>();

    public MockAlbum() {
        inicializar();
    }
    public  void inicializar(){
        ArrayList<String> pistas = new ArrayList<>();
        pistas.add("Rock or Bust");
        pistas.add("Play Ball");
        pistas.add("Rock the Blues Away");
        pistas.add("Miss Adventure");
        pistas.add("Dogs of War");
        pistas.add("Got Some Rock & Roll Thunder");
        pistas.add("Hard Times");
        pistas.add("Baptism by Fire");
        pistas.add("Rock the House");
        pistas.add("Sweet Candy");
        pistas.add("Emission Control");
        albunes.add(new Album("AC/DC","Rock or Bust", "28 de noviembre de 2014", "Hard rock",
                11, R.mipmap.rock_or_bust, pistas));

        pistas = new ArrayList<>();

        pistas.add("Come Together");
        pistas.add("Something");
        pistas.add("Maxwell");
        pistas.add("Oh! Darling");
        pistas.add("Octopus's Garden");
        pistas.add("Here Comes the Sun");
        pistas.add("Because");
        pistas.add("Baptism by Fire");
        pistas.add("You Never Give Me Your Money");
        pistas.add("Sun King");
        pistas.add("Polythene Pam");
        pistas.add("She Came In Through the Bathroom Window");
        pistas.add("Golden Slumbers");
        pistas.add("Carry That Weight");
        pistas.add("The End");
        pistas.add("Her Majesty");

        albunes.add(new Album("The Beatles","Abbey Road", "26 de Septiembre 1969", "Rock",
                17, R.mipmap.rock_or_bust, pistas));
        /*albunes.add(new Album("Michael Jackson","Thriller", "30 de noviembre de 1982", "Rock",
                9, R.mipmap.albun_acdc, new ArrayList<String>()));
        albunes.add(new Album("Eagles","Hotel California", "8 de diciembre de 1976", "Rock",
                9, R.mipmap.albun_acdc, new ArrayList<String>()));
        albunes.add(new Album("David Guetta","Listen Again", "27 de noviembre de 2015", "Electro",
                17, R.mipmap.albun_acdc, new ArrayList<String>()));
        albunes.add(new Album("Sia", "This Is Acting", "29 de enero de 2016", "Pop",
                12, R.mipmap.albun_acdc, new ArrayList<String>()));
        albunes.add(new Album("Rihanna", "ANTI", "28 de enero de 2016", "Pop",
                13, R.mipmap.albun_acdc, new ArrayList<String>()));
        albunes.add(new Album("Katy Perry", "Prism", " 18 de octubre de 2013", "Pop",
                16, R.mipmap.albun_acdc, new ArrayList<String>()));*/
    }

    public ArrayList<Album> getAlbunes() {
        return albunes;
    }

    public ArrayList<String> getPistas(int position){
        return albunes.get(position).getPistas();
    }

}
