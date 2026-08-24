package com.tecspeak.collection.playlist;

public class Song {
    String name;
    Song next;

    public Song(String name) {
        this.name = name;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}
