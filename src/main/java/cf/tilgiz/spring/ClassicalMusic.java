package cf.tilgiz.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Ilgiz Tukhvatov
 */
@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic createByFactoryMethod(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarina Rhapsody";
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
