import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class Spell {
    public
        String CastingTime, Name, School, Shape, Duration, HigherLevels, HigherEffect, Attack, Save, Check, Dice, DmgType, Effect, Range, Size,Value;
        boolean Ritual,Somatic, Verbal, Material,Consumed,Concentration, OrSuck;
        int Level;
    public Spell(JSONObject obj){
        JSONObject o = (JSONObject) obj;
        Level = Integer.parseInt((String)o.get("Level"));
        Name = (String) o.get("Name");
        School = (String) o.get("School");
        Ritual = (((o.get("Ritual"))).equals("Yes"));
        CastingTime = (String) o.get("Casting Time");
        Range = (String)o.get("Range");
        Size = (String) o.get("Size");
        Shape = (String) o.get("Shape");
        Verbal = (((o.get("Verbal"))).equals("Yes"));
        Somatic = (((o.get("Somatic"))).equals("Yes"));
        Material = (((o.get("Material"))).equals("Yes"));
        Value = (String) o.get("Value");
        Consumed = (((o.get("Consumed"))).equals("Yes"));
        Concentration = (((o.get("Concentration"))).equals("Yes"));
        Duration = (String) o.get("Duration");
        HigherLevels = (String) o.get("Higher Levels");
        HigherEffect = (String)o.get("Higher Effect");
        Attack = (String) o.get("Attack");
        Save = (String) o.get("Save...");
        OrSuck = (((o.get("or Suck"))).equals("Yes"));
        Check = (String) o.get("Check");
        Dice = (String) o.get("Dice");
        DmgType = (String) o.get("Dmg Type");
        Effect = (String) o.get("Effect");
    }
    @Override
    public String toString(){
        return Name;
    }
}
