package cf.tilgiz.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Ilgiz Tukhvatov
 */
@Component
public class PopMusic implements Music {

    private String[] songs = {"Pop music 1", "Pop music 2", "Pop music 3"};

    @Override
    public String[] getSong() {
        return songs;
    }

    @PostConstruct
    public void doMyInitPopMusic(){
        System.out.println("Do my initialization PopMusic");
    }

    @PreDestroy
    public void doMyDestroyPopMusic(){
        System.out.println("Destroying PopMusic...");
    }
}
