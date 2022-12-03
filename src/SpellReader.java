import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
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
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }
    }
    public ArrayList<Spell> retrieveArray(){
        return allSpells;
    }
}