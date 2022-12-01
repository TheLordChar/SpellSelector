import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;
public class Spell {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/Final Final Spell Sheet.json"));
            JSONObject jsonObject = (JSONObject)obj;
            String level = (String)jsonObject.get("Level");
            String name = (String)jsonObject.get("Name");
            String school = (String)jsonObject.get("School");
            String ritual = (String)jsonObject.get("Ritual");
            String castingTime = (String)jsonObject.get("Casting Time");
            String range = (String)jsonObject.get("Range");
            String spellsize = (String)jsonObject.get("Size");
            String shape = (String)jsonObject.get("Shape");
            String verbal = (String)jsonObject.get("Verbal");
            String somatic = (String)jsonObject.get("Somatic");
            String material = (String)jsonObject.get("Material");
            String value = (String)jsonObject.get("Value");
            String consumed = (String)jsonObject.get("Consumed");
            String concentration = (String)jsonObject.get("Concentration");
            String duration = (String)jsonObject.get("Duration");
            String higherLevels = (String)jsonObject.get("Higher Levels");
            String higherEffect = (String)jsonObject.get("Higher Effect");
            String attack = (String)jsonObject.get("Attack");
            String save = (String)jsonObject.get("Save...");
            String suck = (String)jsonObject.get("or Suck");
            String check = (String)jsonObject.get("Check");
            String dice = (String)jsonObject.get("Dice");
            String dmgType = (String)jsonObject.get("Dmg Type");
            String effect = (String)jsonObject.get("Effect");
            System.out.println("Level: " + level);
            System.out.println("Name: " + name);
            System.out.println("School: " + school);
            System.out.println("Ritual: " + ritual);
            System.out.println("Casting Time: " + castingTime);
            System.out.println("Range: " + range);
            System.out.println("Size: " + spellsize);
            System.out.println("Shape: " + shape);
            System.out.println("Verbal: " + verbal);
            System.out.println("Somatic: " + somatic);
            System.out.println("Material: " + material);
            System.out.println("Value: " + value);
            System.out.println("Consumed: " + consumed);
            System.out.println("Concentration: " + concentration);
            System.out.println("Duration: " + duration);
            System.out.println("Higher Levels: " + higherLevels);
            System.out.println("Higher Effect: " + higherEffect);
            System.out.println("Attack: " + attack);
            System.out.println("Save: " + save);
            System.out.println("Suck: " + suck);
            System.out.println("Check: " + check);
            System.out.println("Dice: " + dice);
            System.out.println("Damage Type: " + dmgType);
            System.out.println("Effect Type: " + effect);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
