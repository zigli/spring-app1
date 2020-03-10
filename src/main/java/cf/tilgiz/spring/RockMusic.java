package cf.tilgiz.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import sun.misc.Contended;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.beans.ConstructorProperties;

/**
 * @author Ilgiz Tukhvatov
 */
@Component("musicBeanRock")
public class RockMusic implements Music {

    private String[] songs = {"Rock music 1", "Rock music 2", "Rock music 3"};

    @Override
    public String[] getSong() {
        return songs;
    }

    @PostConstruct
    public void doMyInitRockMusic() {
        System.out.println("Do my initialization RockMusic");
    }

    @PreDestroy
    public void doMyDestroyRockMusic() {
        System.out.println("Destroying RockMusic...");
    }
}
