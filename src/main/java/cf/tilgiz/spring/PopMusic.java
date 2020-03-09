package cf.tilgiz.spring;

/**
 * @author Ilgiz Tukhvatov
 */
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Hello";
    }
    public void doMyInitPopMusic(){
        System.out.println("Do my initialization PopMusic");
    }

    public void doMyDestroyPopMusic(){
        System.out.println("Destroying PopMusic...");
    }
}
