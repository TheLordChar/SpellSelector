import java.util.Arrays;

public class Wizard {
    private String name;
    private int lvl;
    private String[] spells;

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
    public void lvlUp(){
        lvl = lvl +1;
    }
    public String[] getSpells(){
        return spells;
    }
    public void setSpells(String[] spells){
        this.spells = spells;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("**********Your Wizard**********\n");
        sb.append("Name: " + getName()+ "\n");
        sb.append("Level: " + getLevel() + "\n");
        sb.append("Spells: " + Arrays.toString(getSpells())+ "\n");
        sb.append("\n*******************************");

        return sb.toString();
    }
}
