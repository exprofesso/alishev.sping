package alieshev.spring.course;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> music = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

//    public Music getMusic() {
//        return music;
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

        public List<Music> getMusic() {
        return music;
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }


    public MusicPlayer(List<Music> music){
        this.music = music;
    }

        public void playMusic(){
        for (Music music1 : music) {
            System.out.println("Playing " + music1.getSong());
        }
    }

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public void playMusic() {
//        System.out.println("Playing " + music.getSong());
//
//    }
}
