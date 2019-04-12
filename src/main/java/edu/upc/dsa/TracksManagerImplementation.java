package edu.upc.dsa;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class TracksManagerImplementation implements TracksManager {
    private final static Logger logger = Logger.getLogger(TracksManagerImplementation.class.getName());
    //SINGLETON
    private static TracksManager instance;
    private HashMap<String,Autor> autores;
    private LinkedList<Album> albums;
    private LinkedList<Track> tracks;
    //constructos privado
    private TracksManagerImplementation(){
        this.albums = new LinkedList<>();
        this.tracks = new LinkedList<>();
    }
    //getInstance Method
    public static TracksManager getInstance(){
        if(instance == null) instance = new TracksManagerImplementation();
        return instance;
    }
    @Override
    public String añadirAutor(String nombre) {
        Autor autor = new Autor(nombre);
        this.autores.put(autor.getIdAutor(),autor);
        logger.info("Autor añadido");
        return autor.getIdAutor();

    }

    @Override
    public String añadirAlbum(String nombre, String cantante, int año, String idAutor) throws AutorNotFoundException {
        Autor autor = this.getAutor(idAutor);
        Album album = new Album(nombre, cantante, año);
        autor.añadirAlbum(album);
        this.albums.add(album);
        logger.info("Album añadido");
        return album.getIdAlbum();


    }

    @Override
    public Track añadirTrack(String titulo, String cantante, String idAlbum, String idAutor) throws AutorNotFoundException, AlbumNotFoundException {
        Autor autor = this.getAutor(idAutor);
        Album album = this.getAlbum(idAlbum);
        Track track = new Track(titulo,cantante);
        autor.añadirAlbum(album);
        album.añadirTracks(track);
        this.tracks.add(track);
        logger.info("Track añadida");
        return track;


    }

    @Override
    public Track getTrack(String id) throws TrackNotFoundException {
        return null;
    }

    @Override
    public Album getAlbum(String id) throws AlbumNotFoundException {
        return null;
    }

    @Override
    public Track getTrack(int  id) throws TrackNotFoundException {
        Track track = this.tracks.get(id);
        if (track !=null) return track;
        else throw new TrackNotFoundException();

    }

    @Override
    public Album getAlbum(int id) throws AlbumNotFoundException {
        Album album = this.albums.get(id);
        if (album != null ) return album;
        else throw new AlbumNotFoundException();

    }

    @Override
    public Autor getAutor(String id) throws AutorNotFoundException {
        Autor autor = this.autores.get(id);
        if (autor != null) return autor;
        else throw new AutorNotFoundException();
    }

    @Override
    public List<Track> getTracks() {
        return new LinkedList<>(this.tracks);
    }

    @Override
    public List<Album> getAlbums() {
        return new LinkedList<>(this.albums);
    }

    @Override
    public List<Autor> getAutors() {
        return new LinkedList<>(this.autores.values());
    }

    @Override
    public void updateTrack(Track track) throws TrackNotFoundException {
        this.getTrack(track.getIdTrack());
        this.tracks.add(track);
        logger.info("Track updated");
    }

    @Override
    public void updateAlbum(Album album) throws AlbumNotFoundException {
        this.getAlbum(album.getIdAlbum());
        this.albums.add(album);
        logger.info("Album updated");
    }

    @Override
    public void deleteTrack(String id) throws TrackNotFoundException {
        this.getTrack(id);
        this.tracks.remove(id);
        logger.info("Track deleted");
    }

    @Override
    public void deleteAlbum(String id) throws AlbumNotFoundException {
        this.getAlbum(id);
        this.albums.remove(id);
        logger.info("Album deleted");
    }

    @Override
    public int numTracks() {
        logger.info("Number of tracks: " + this.tracks.size());
        return this.tracks.size();
    }

    @Override
    public int numAlbums() {
        logger.info("Number of albums: " + this.albums.size());
        return this.albums.size();
    }

    @Override
    public void clear() {
        this.albums = new LinkedList<>();
        this.tracks = new LinkedList<>();
        this.autores = new HashMap<>();

    }
}
