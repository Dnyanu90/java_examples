package com.tecspeak.collection.playlist;

public class Song {
    String name;
    String singerName;
    String company;
    Song next;
    double duration;
    String album;

    public Song(String name, String singerName, String company,double duration ,String album) {
        this.company = company;
        this.name = name;
        this.next = null;
        this.singerName = singerName;
        this.duration=duration;
        this.album=album;
    }

}
