package br.com.tocadorDeMusica;

import br.com.tocadorDeMusica.models.Music;
import br.com.tocadorDeMusica.models.PodCast;

public class Main {
    public static void main ( String[] args ) {
        Music music = new Music();
        PodCast podCast = new PodCast();

        music.setAutor("Scorpions");
        music.setTitle("Send me an angel");
        music.setDuration(3.5);
        music.setLike(1);
        music.setRating(5);
        music.reproduction();
        music.showInfo();
        music.recommendation();
    }
}