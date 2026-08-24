package com.tecspeak.collection.playlist;

public class Playlist {
    Song head;
    void addSong(String name){
        Song newSong=new Song(name);
        if (head==null){
            head=newSong;
        }else {
            Song current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newSong;
        }
    }
    void dispaly(){
        Song current =head;
        while (current!=null){
            System.out.println(current.name);
            current=current.next;
        }
    }
}
class MusicPlayer{
    public static void main(String[] args) {
        Playlist playlist =new Playlist();
        playlist.addSong("Manwa lage");
        playlist.addSong("Heeriya");
        playlist.addSong("Tum Hi Ho");
        playlist.addSong("Phir Aur Kya Chahiye");
        playlist.dispaly();


    }


}
