package cf.tilgiz.spring;

/**
 * @author Ilgiz Tukhvatov
 */
public class ClassicalMusic implements Music {

    private ClassicalMusic(){}

    public static ClassicalMusic createByFactoryMethod(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarina Rhapsody";
    }

    public void doMyInitClassicalMusic(){
        System.out.println("Do my initialization ClassicalMusic");
    }

    public void doMyDestroyClassicalMusic(){
        System.out.println("Destroying ClassicalMusic...");
    }
}
