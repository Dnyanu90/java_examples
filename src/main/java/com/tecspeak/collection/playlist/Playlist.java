package com.tecspeak.collection.playlist;

public class Playlist {
    Song head;

    void addSong(String name, String singerName, String company,double duration,String album) {
        Song newSong = new Song(name, singerName, company,duration,album);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    void dispaly() {
        Song current = head;
        int count = 1;
        while (current != null) {
            System.out.println(count + ": ");
            System.out.println("Song :" + current.name);
            System.out.println("Singer :" + current.singerName);
            System.out.println("Company :" + current.company);
            System.out.println("Duration :" + current.duration);
            System.out.println("Album :" + current.album);
            System.out.println("---------------------------");

            current = current.next;
          count++;
        }

        System.out.println("Total Songs :"+(count-1));
    }

    void searchSong(String searchName){
        Song current =head;
        while(current !=null){
            if (current.name.equals(searchName)){
                System.out.println("Song Status :"+"Song Found");
                return;
            }
            current =current.next;
        }
        System.out.println("Song Status :"+"Song Not Found");
    }

}

class MusicPlayer {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(
                "Manwa lage",
                "Arijit Singh and Shreya Ghoshal",
                "T-Series",
                4.34,
                "Happy New Year (2014)");

        playlist.addSong(
                "Heeriya",
                "Jasleen Royal, Arijit Singh",
                "Warner Music India / Meri Marzi Pictures LLP",
                3.43,
                "Heeriye (Single / Independent Release)");

        playlist.addSong(
                "Tum Hi Ho",
                "Arijit Singh"
                , "T-Series",
                4.23,
                "Aashiqui 2 (2013)");
        playlist.addSong("Raataan Lambiyan",
                "Jubin Nautiyal, Asees Kaur",
                "Sony Music India",
                2.49,
                "Shershaah (2021)");

        playlist.dispaly();
        playlist.searchSong("Tum Hi Ho");


    }


}
