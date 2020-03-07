package cf.tilgiz.spring;

/**
 * @author Ilgiz Tukhvatov
 */
public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    void playMusic(){
        System.out.println("Playing: " + music.getSong());
    }
}
