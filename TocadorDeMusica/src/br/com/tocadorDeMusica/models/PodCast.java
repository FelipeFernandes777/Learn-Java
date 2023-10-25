package br.com.tocadorDeMusica.models;

public class PodCast extends  Audio{
    private String autor;
    private String channel;
    private int epsode;

    public String getAutor ( ) {
        return autor;
    }

    public void setAutor ( String autor ) {
        this.autor = autor;
    }

    public String getChannel ( ) {
        return channel;
    }

    public void setChannel ( String channel ) {
        this.channel = channel;
    }

    public int getEpsode ( ) {
        return epsode;
    }

    public void setEpsode ( int epsode ) {
        this.epsode = epsode;
    }
}
