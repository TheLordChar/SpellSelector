import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class SpellReader{
    private final String filename;
    private final JSONParser parser;
    private final ArrayList<Spell> allSpells;

    public SpellReader(String file) {
        filename = file;
        parser = new JSONParser();
        allSpells = new ArrayList<>();

    }
    public void loadFile(){
        try {
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(filename));
            for (Object obj : jsonArray) {
                JSONObject o = (JSONObject) obj;
                allSpells.add(new Spell(o));
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
    public ArrayList<Spell> retrieveArray(){
        return allSpells;
    }
}