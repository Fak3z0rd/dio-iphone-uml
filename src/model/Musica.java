package model;

public class Musica {
    private String nome;
    private String artista;
    private String album;

    public Musica(String nome, String artista, String album) {
        this.nome = nome;
        this.artista = artista;
        this.album = album;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }
}
