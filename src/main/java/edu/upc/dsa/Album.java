package edu.upc.dsa;

import sun.awt.image.ImageWatched;

import java.util.HashMap;
import java.util.LinkedList;

public class Album {
    //atributos
    private String idAlbum;
    private String nombre;
    private String cantante;
    private int año;
    private LinkedList<Track> tracks;

    //constructor
    public Album(String nombre, String cantante, int año){
        this.tracks = new LinkedList<>();

    }

    public Album(String idAlbum, String nombre, String cantante, int año) {
        this.idAlbum = idAlbum;
        this.nombre = nombre;
        this.cantante = cantante;
        this.año = año;
        this.tracks = tracks;
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public LinkedList<Track> getTracks() {
        return tracks;
    }

    public void setTracks(LinkedList<Track> tracks) {
        this.tracks = tracks;
    }
    public void añadirTracks (Track track){
        this.tracks.add(track);
    }
}
