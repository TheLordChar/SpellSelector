package src;

import java.util.ArrayList;

public class FilterSpells {

    //if userInput = Level, then we will sort by level first.

    ArrayList<Spell> filteredSpellList = new ArrayList<Spell>();

    //This would be easier to do backwards. Give the user
    //the full list of spells, then remove spells from the
    //list as it filters through. No adding something back
    //after checking.

    public static void main(){


        int n = Integer.parseInt(spell.getLevel());

        //LEVEL WANTED

        //user input is level n. Remove all spells != n
        if (spell.getLevel() != n)

        {
            filteredSpellList.remove(spell);
        }

        //DAMAGE SPELL WANTED
        //user wants a damage spell. remove spells with - DmgType
        if (spell.getDmgType() = "-"){
            filteredSpellList.remove(spell);
        }

        //DAMAGE SPELL UNWANTED
        //user does not want a damage spell. remove spells != -
        if (spell.getDmgType() != "-"){
            filteredSpellList.remove(spell);
        }

        //UTILITY WANTED
        //user wants a utility spell. remove spells with != Utility
        if (spell.getEffect() != "Utility"){
            filteredSpellList.remove(spell);
        }

        //UTILITY SPELL NOT WANTED
        //user does not want utility spell. remove spells with Utility
        if (spell.getEffect() = "Utility"){
            filteredSpellList.remove(spell);
        }

        //SUPPORT WANTED
        //user wants support spell. remove spells with Utility and -
        if (spell.getEffect() = "Utility" || spell.getEffect() = "-"){
            filteredSpellList.remove(spell);
        }

        //SUPPORT NOT WANTED
        //user does not want support spell. Remove != Utility and != -
        if (spell.getEffect() != "Utility" || spell.getEffect() != "-"){
            filteredSpellList.remove(spell);
        }

        //CONCENTRATION WANTED
        //user wants concentration. remove if concentration != Yes
        if (spell.getConcentration() != "Yes"){
            filteredSpellList.remove(spell);
        }

        //CONCENTRATION NOT WANTED
        //user does not want concentration. remove if concentration != No
        if (spell.getConcentration() != "No"){
            filteredSpellList.remove(spell);
        }

    }
}
