import java.util.Arrays;
import java.util.ArrayList;

public class Wizard {
    private String name;
    private int lvl;
    private ArrayList<Spell> wizSpells = new ArrayList<Spell>();
    private ArrayList<Spell> wizCantrips = new ArrayList<Spell>();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getLevel(){
        return lvl;
    }
    public void setLevel(int lvl){
        this.lvl = lvl;
    }

    public void addSpells() {
        wizSpells.add(new Spell());
    }
    public ArrayList<Spell> getSpells(){
        return wizSpells;
    }
    public void addCantrips() {
        wizCantrips.add(new Spell());
    }
    public ArrayList<Spell> getCantrips(){
        return wizCantrips;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("**********Your Wizard**********\n");
        sb.append("Name: " + getName()+ "\n");
        sb.append("Level: " + getLevel() + "\n");
        //sb.append("Cantrips: " + Arrays.toString(getCantrips())+ "\n");
        sb.append("*******************************");

        return sb.toString();
    }
}
