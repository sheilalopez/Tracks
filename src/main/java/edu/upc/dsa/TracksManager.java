package edu.upc.dsa;

import java.util.List;

public interface TracksManager {
    public String añadirAutor (String nombre);
    public String añadirAlbum(String nombre, String cantante, int año, String idAutor) throws AutorNotFoundException;
    public Track añadirTrack (String titulo, String cantante, String idAlbum, String idAutor) throws AutorNotFoundException, AlbumNotFoundException;
    Track getTrack (String id) throws TrackNotFoundException;
    Album getAlbum (String id) throws AlbumNotFoundException;

    Track getTrack(int id) throws TrackNotFoundException;

    Album getAlbum(int id) throws AlbumNotFoundException;

    Autor getAutor (String id) throws AutorNotFoundException;
    List<Track> getTracks();
    List<Album> getAlbums();
    List<Autor> getAutors();
    public  void updateTrack (Track track) throws TrackNotFoundException;
    public void updateAlbum (Album album) throws AlbumNotFoundException;
    public void deleteTrack (String id) throws TrackNotFoundException;
    public void deleteAlbum (String id) throws AlbumNotFoundException;
    int numTracks();
    int numAlbums();
    void clear();

}
