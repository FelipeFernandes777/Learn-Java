package br.com.tocadorDeMusica.models;

import br.com.tocadorDeMusica.commands.Like;
import br.com.tocadorDeMusica.commands.Reproduction;

public class Audio implements Like, Reproduction {
    private String title;
    private double duration;
    private int views;
    private int likes;
    private double rating;

    private int totalRating;

    public void setTitle ( String title ) {
        this.title = title;
    }

    public void setDuration ( double duration ) {
        this.duration = duration;
    }

    public String getTitle ( ) {
        return title;
    }

    public double getDuration ( ) {
        return duration;
    }

    public int getViews ( ) {
        return views;
    }

    public int getLikes ( ) {
        return likes;
    }

    public double getRating ( ) {
        return rating;
    }

    public void showInfo() {
        System.out.println("Titulo: " + getTitle());
        System.out.println("Duração: " + getDuration());
        System.out.println("Quantidade de vizualização: " + getViews());
        System.out.println("Quantidade de Likes: " + getLikes());
        System.out.println("Nota: " + getRating());
    }
    
    public double setRating(double rating) {
        return this.rating += rating;
    }

    public double calcRating () {
      return rating / views;
    }

    public void recommendation() {
        double note = calcRating();

        if( note >= 5) {
            System.out.println("Mais ouvidas no momento");
        } else if (note < 5) {
            System.out.println("Coloque em sua playList");
        }
    }

    @Override
    public int setLike (int like) {
        return this.likes += like;
    }

    @Override
    public int reproduction () {
        System.out.println("Estou repoduzindo: " + getTitle());
        return this.views++;
    }
}
