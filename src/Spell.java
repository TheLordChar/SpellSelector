import org.json.simple.JSONObject;

import java.util.ArrayList;

public class Spell {
    public
        String CastingTime, Name, School, Shape, Duration, HigherLevels, HigherEffect, Attack, Save, Check, Dice, DmgType, Effect, Range, Size, Value;
        boolean Ritual, Somatic, Verbal, Material, Consumed, Concentration, OrSuck;
        int Level;
    public Spell(){
        CastingTime= "";
        Name= "";
        School= "";
        Shape= "";
        Duration= "";
        HigherLevels= "";
        HigherEffect= "";
        Attack= "";
        Save= "";
        Check= "";
        Dice= "";
        DmgType= "";
        Effect= "";
        Range= "";
        Size= "";
        Value= "";
        Ritual = false;
        Somatic = false;
        Verbal = false;
        Material = false;
        Consumed = false;
        Concentration = false;
        OrSuck = false;
        Level = 0;
    }
    public Spell(JSONObject o){
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

    public ArrayList<String> allStr(){
        ArrayList<String> out = new ArrayList<>();
        out.add(CastingTime);
        out.add(Name);
        out.add(School);
        out.add(Shape);
        out.add(Duration);
        out.add(HigherLevels);
        out.add(HigherEffect);
        out.add(Attack);
        out.add(Save);
        out.add(Check);
        out.add(Dice);
        out.add(DmgType);
        out.add(Effect);
        out.add(Range);
        out.add(Size);
        out.add(Value);
        return out;
    }
    public ArrayList<Boolean> allBool(){
        ArrayList<Boolean> out = new ArrayList<>();
        out.add(Ritual);
        out.add(Somatic);
        out.add(Verbal);
        out.add(Material);
        out.add(Consumed);
        out.add(Concentration);
        out.add(OrSuck);
        return out;
    }

    @Override
    public String toString(){
        return Name;
    }
}
