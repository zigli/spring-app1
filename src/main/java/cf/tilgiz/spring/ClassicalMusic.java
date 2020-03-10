package cf.tilgiz.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Ilgiz Tukhvatov
 */
@Component
public class ClassicalMusic implements Music {

    private String[] songs = {"Classical music 1", "Classical music 2", "Classical music 3"};
    private ClassicalMusic(){}

    public static ClassicalMusic createByFactoryMethod(){
        return new ClassicalMusic();
    }

    @Override
    public String[] getSong() {
        return songs;
    }

    @PostConstruct
    public void doMyInitClassicalMusic(){
        System.out.println("Do my initialization ClassicalMusic");
    }

    @PreDestroy
    public void doMyDestroyClassicalMusic(){
        System.out.println("Destroying ClassicalMusic...");
    }
}
