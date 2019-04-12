package edu.upc.dsa;

public class Track {
    private String idTrack;
    private String titulo;
    private String cantante;


    public Track(String titulo, String cantante){

    }

    public Track(String idTrack, String titulo, String cantante) {
        this.idTrack = idTrack;
        this.titulo = titulo;
        this.cantante = cantante;
    }

    public String getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(String idTrack) {
        this.idTrack = idTrack;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
}
