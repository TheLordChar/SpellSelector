import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Spell {
    public static void main(String[] args) throws IOException, ParseException
    {
        JSONParser parser = new JSONParser();
        JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("C:/Users/Joshua/IdeaProjects/SpellSelector/src/Final Final Spell Sheet.json"));
        for(Object o : jsonArray)
        {
            JSONObject jsonObject = (JSONObject) o;

            String level = (String) jsonObject.get("Level");
            System.out.println("Level: " + level);
            String name = (String) jsonObject.get("Name");
            System.out.println("Name: " + name);
            String school = (String) jsonObject.get("School");
            System.out.println("School: " + school);
            String ritual = (String) jsonObject.get("Ritual");
            System.out.println("Ritual: " + ritual);
            String castingTime = (String) jsonObject.get("Casting Time");
            System.out.println("Casting Time: " + castingTime);
            String range = (String) jsonObject.get("Range");
            System.out.println("Range: " + range);
            String spellsize = (String) jsonObject.get("Size");
            System.out.println("Size: " + spellsize);
            String shape = (String) jsonObject.get("Shape");
            System.out.println("Shape: " + shape);
            String verbal = (String) jsonObject.get("Verbal");
            System.out.println("Verbal: " + verbal);
            String somatic = (String) jsonObject.get("Somatic");
            System.out.println("Somatic: " + somatic);
            String material = (String) jsonObject.get("Material");
            System.out.println("Material: " + material);
            String value = (String) jsonObject.get("Value");
            System.out.println("Value: " + value);
            String consumed = (String) jsonObject.get("Consumed");
            System.out.println("Consumed: " + consumed);
            String concentration = (String) jsonObject.get("Concentration");
            System.out.println("Concentration: " + concentration);
            String duration = (String) jsonObject.get("Duration");
            System.out.println("Duration: " + duration);
            String higherLevels = (String) jsonObject.get("Higher Levels");
            System.out.println("Higher Levels: " + higherLevels);
            String higherEffect = (String) jsonObject.get("Higher Effect");
            System.out.println("Higher Effect: " + higherEffect);
            String attack = (String) jsonObject.get("Attack");
            System.out.println("Attack: " + attack);
            String save = (String) jsonObject.get("Save...");
            System.out.println("Save: " + save);
            String suck = (String) jsonObject.get("or Suck");
            System.out.println("Suck: " + suck);
            String check = (String) jsonObject.get("Check");
            System.out.println("Check: " + check);
            String dice = (String) jsonObject.get("Dice");
            System.out.println("Dice: " + dice);
            String dmgType = (String) jsonObject.get("Dmg Type");
            System.out.println("Damage Type: " + dmgType);
            String effect = (String) jsonObject.get("Effect");
            System.out.println("Effect Type: " + effect);
        }
    }
}
