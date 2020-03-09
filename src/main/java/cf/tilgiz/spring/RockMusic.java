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

    @Override
    public String getSong() {
        return "Wind cries Mary";
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
