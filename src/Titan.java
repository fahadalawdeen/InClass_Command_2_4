import java.util.HashMap;

public class Titan extends Person{

    private HashMap<String, IStone> iGauntlet = new HashMap<>();

    public Titan(){
        super(500.0,"Thanos","Titan");
    }

    public void activateGauntlet(){
        for(String stone : iGauntlet.keySet()){
            System.out.println("Activating " + stone + " Stone");
            iGauntlet.get(stone).special(this);
        }
    }

    public void addStone(IStone stone){
        if(stone instanceof SpaceStone){
            iGauntlet.put("Space", stone);
        }
        if(stone instanceof PowerStone){
            iGauntlet.put("power", stone);
        }

    }
}
