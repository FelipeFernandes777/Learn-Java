package br.com.tocadorDeMusica.models;

public class Music extends Audio {
    private String autor;
    private String album;

    public String getAutor ( ) {
        return autor;
    }

    public void setAutor ( String autor ) {
        this.autor = autor;
    }

    public String getAlbum ( ) {
        return album;
    }

    public void setAlbum ( String album ) {
        this.album = album;
    }
}
