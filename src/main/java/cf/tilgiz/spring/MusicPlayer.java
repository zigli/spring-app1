package cf.tilgiz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * @author Ilgiz Tukhvatov
 */
@Component
@Scope(scopeName = "prototype")
public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;

    public List<Music> getMusic() {
        return musicList;
    }

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

    public MusicPlayer() {}

    @Autowired()
    public void setMusicList (List<Music> musicList) {
        this.musicList = musicList;
    }

    void playMusic(){
        for (Music musicItem: musicList ) {
            System.out.println("Playing: " + musicItem.getSong());
        }
    }

    @Override
    public String toString() {
       return musicList.toString();
    }

    @PostConstruct
    public void doInitMusicPlayer(){
        System.out.println("Do my initialization of MusicPlayer");
    }

    @PreDestroy
    public void doDestroyMusicPlayer(){
        System.out.println("Destroying MusicPlayer...");
    }
}
