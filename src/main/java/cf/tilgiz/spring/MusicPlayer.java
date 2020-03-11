package cf.tilgiz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

import static cf.tilgiz.spring.MusicType.*;

/**
 * @author Ilgiz Tukhvatov
 */
@Component
public class MusicPlayer {

    private Music music;
    @Value("${musicPlayer.name}")
    private String name;
    private int volume;

    public Music getMusic() {
        return music;
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

    @Autowired
    public MusicPlayer(@Qualifier("musicBeanRock")Music music) {
        this.music=music;
    }

    public void setMusic (Music music) {
        this.music = music;
    }

    Random random = new Random();

    public String playMusic(MusicType musicType){
        int i = random.nextInt(3);
        String returnStr = null;
        switch (musicType) {
            case CLASSICAL:
                returnStr = music.getSong()[i];
                break;
            case ROK:
                returnStr = music.getSong()[i];
                break;
            case POP:
                returnStr = music.getSong()[i];
                break;
        }
        return "Random number " + i + ". Playing: " + returnStr;
    }

    @Override
    public String toString() {
       return music.toString();
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
