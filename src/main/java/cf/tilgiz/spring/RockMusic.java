package cf.tilgiz.spring;

/**
 * @author Ilgiz Tukhvatov
 */
public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
    public void doMyInitRockMusic(){
        System.out.println("Do my initialization RockMusic");
    }

    public void doMyDestroyRockMusic(){
        System.out.println("Destroying RockMusic...");
    }
}
