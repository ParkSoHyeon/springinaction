package soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

import java.util.List;

public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;



    public CompactDisc sgtPeppers() {
        return new BlankDisc("Sgt. Pepper's Lonely Hearts Club Band",
                "The Beatles");
    }
    public BlankDisc(@Value("#{systemProperties['disc.title']}") String title,
                     @Value("#{systemProperties['disc.artist']") String artist) {
        //(@Value("${disc.title}") String title,@Value("${disc.artist}") String artist)
        this.title = title;
        this.artist = artist;
    }

//    public BlankDisc(String title, String artist, List<String> tracks) {
//        this.title = title;
//        this.artist = artist;
//        this.tracks = tracks;
//    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }


    public void play() {
        System.out.println("Playing " + title + " by " + artist);

        for(String track : tracks) {
            System.out.println("-Track : " + track);
        }
    }


}
