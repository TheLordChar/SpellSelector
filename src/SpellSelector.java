
import java.util.ArrayList;

public class SpellSelector {
    private ArrayList<Spell> unfiltered;

    public SpellSelector(ArrayList<Spell> spells){
        unfiltered = spells;

    }

    public ArrayList<Spell> filter(ArrayList<ArrayList<String>> str, ArrayList<Boolean> bools, int maxLvl){
        ArrayList<Spell> out = new ArrayList<>();
        ArrayList<ArrayList<Spell>> hold = new ArrayList<>();
        for(int i = 0; i< 24; i++){
            hold.add(new ArrayList<>());
        }

        for(Spell s : unfiltered){
            int count = 0;
            ArrayList<String> sStr = s.allStr();
            ArrayList<Boolean> sBool = s.allBool();
            for(int i = 0; i < 16; i++){
                if(str.get(i).contains(sStr.get(i))){
                    count++;

                }
            }
            for(int i = 0; i < 7; i++){
                if(bools.get(i) == (sBool.get(i)) && bools.get(i)){
                    count++;
                }
            }
            if(count >= 1 && s.Level <= ((maxLvl/2)+1)){hold.get(count).add(s);}
        }
        for(int i = 0; i < hold.size(); i++){
            for(int j = 0; j < hold.get(i).size(); j++){
                out.add(hold.get(i).get(j));
            }
        }
        return out;
    }

}
