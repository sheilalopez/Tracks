package edu.upc.dsa;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class Autor {
    private String idAutor;
    private String nombre;
    private LinkedList<Album> albums;
    private LinkedList<Track> tracks;

    public Autor(String nombre){
        this.albums = new LinkedList<>();
        this.tracks = new LinkedList<>();

    }

    public Autor(String idAutor, String nombre) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.albums = albums;
        this.tracks = tracks;
    }

    public String getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(String idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(LinkedList<Album> albums) {
        this.albums = albums;
    }

    public LinkedList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(LinkedList<Track> tracks) {
        this.tracks = tracks;
    }

    //metodos
    public void añadirAlbum (Album album){
        this.albums.add(album);
    }
    public void añadirTrack (Track track){
        this.tracks.add(track);
    }
}
