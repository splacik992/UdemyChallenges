package TimBuchalka.section8.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) == null) {
            this.songs.add(new Song(songTitle, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {
        Song songExist = findSong(songTitle);
        if (songExist != null) {
            playlist.add(songExist);
            return true;
        }
        return false;
    }
}
