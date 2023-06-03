package com.kris.JavaBook.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JukeBox5 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new JukeBox5().go();
    }

    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println(songList);
    }

    void getSongs() {
        // Код для ввода/вывода
    }

    void addSongs(String lineToParse) {
        // Делаем разбор строки
        // и добавляем песню в список
    }
}
