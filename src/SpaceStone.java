/*
 * Fahad Haja Allawdeen
 * 03/01/2023
 * Description: A class that changes a persons location.
 */
public class SpaceStone implements IStone {

    private String location = "Space";

    private static SpaceStone spaceStone = null;

    private SpaceStone(){}

    public static SpaceStone getInstance(){
        if(spaceStone == null){
            spaceStone = new SpaceStone();
        }
        return spaceStone;
    }

    @Override
    public void special(Person person) {
        System.out.println(person.getName() + " is at " + person.getLocation());
        System.out.println("BAMPH!");
        person.setLocation(location);
        System.out.println(person.getName() + " is now at " + person.getLocation());
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
