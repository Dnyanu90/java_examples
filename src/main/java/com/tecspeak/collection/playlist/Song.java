package com.tecspeak.collection.playlist;

public class Song {
    String name;
    String singerName;
    String company;
    Song next;

    public Song(String name, String singerName, String company) {
        this.company = company;
        this.name = name;
        this.next = null;
        this.singerName = singerName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", singerName='" + singerName + '\'' +
                ", next=" + next +
                '}';
    }
}
