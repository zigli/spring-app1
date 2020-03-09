package cf.tilgiz.spring;

import java.util.List;

/**
 * @author Ilgiz Tukhvatov
 */
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
}
