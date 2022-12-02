import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.ListIterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.ContainerFactory;

public class Main {
    public static void main(String[] args) throws IOException, ParseException
    {
        JSONParser parser = new JSONParser();
        List<Spell> userSpellList = new ArrayList<Spell>();
        List<Spell> userCantripList = new ArrayList<>();
        List<Spell> canSpellList = new ArrayList<>();
        List<Spell> oneSpellList = new ArrayList<>();
        List<Spell> twoSpellList = new ArrayList<>();
        List<Spell> threeSpellList = new ArrayList<>();
        List<Spell> fourSpellList = new ArrayList<>();
        List<Spell> fiveSpellList = new ArrayList<>();
        List<Spell> sixSpellList = new ArrayList<>();
        List<Spell> sevenSpellList = new ArrayList<>();
        List<Spell> eightSpellList = new ArrayList<>();
        List<Spell> nineSpellList = new ArrayList<>();
        JSONObject masterList = (JSONObject) parser.parse(new FileReader("src/Final Final Spell Sheet - Keyed.json"));
        JSONArray canTrip = (JSONArray) masterList.get("0");
        JSONArray levelOne = (JSONArray)  masterList.get("1");
        JSONArray levelTwo = (JSONArray)  masterList.get("2");
        JSONArray levelThree = (JSONArray)  masterList.get("3");
        JSONArray levelFour = (JSONArray)  masterList.get("4");
        JSONArray levelFive = (JSONArray)  masterList.get("5");
        JSONArray levelSix = (JSONArray)  masterList.get("6");
        JSONArray levelSeven = (JSONArray)  masterList.get("7");
        JSONArray levelEight = (JSONArray)  masterList.get("8");
        JSONArray levelNine = (JSONArray)  masterList.get("9");

        for(int index = 0; index < canTrip.size(); index++)
        {
            JSONObject spellInfo = (JSONObject) canTrip.get(index);

            Spell canSpells = new Spell();
            //canSpells.setLevel((String) spellInfo.get("Level"));
            canSpells.setName((String) spellInfo.get("Name"));
            canSpells.setSchool((String) spellInfo.get("School"));
            canSpells.setRitual((String) spellInfo.get("Ritual"));
            canSpells.setCastingTime((String) spellInfo.get("Casting Time"));
            canSpells.setRange((String) spellInfo.get("Range"));
            canSpells.setSpellSize((String) spellInfo.get("Size"));
            canSpells.setShape((String) spellInfo.get("Shape"));
            canSpells.setVerbal((String) spellInfo.get("Verbal"));
            canSpells.setSomatic((String) spellInfo.get("Somatic"));
            canSpells.setMaterial((String) spellInfo.get("Material"));
            canSpells.setValue((String) spellInfo.get("Value"));
            canSpells.setConsumed((String) spellInfo.get("Consumed"));
            canSpells.setConcentration((String) spellInfo.get("Concentration"));
            canSpells.setDuration((String) spellInfo.get("Duration"));
            canSpells.setHigherLevels((String) spellInfo.get("Higher Levels"));
            canSpells.setHigherEffect((String) spellInfo.get("Higher Effect"));
            canSpells.setAttack((String) spellInfo.get("Attack"));
            canSpells.setSave((String) spellInfo.get("Save..."));
            canSpells.setSuck((String) spellInfo.get("or Suck"));
            canSpells.setCheck((String) spellInfo.get("Check"));
            canSpells.setDice((String) spellInfo.get("Dice"));
            canSpells.setDmgType((String) spellInfo.get("Dmg Type"));
            canSpells.setEffect((String) spellInfo.get("Effect"));

            canSpellList.add(canSpells);
        }
        for(int index = 0; index < levelOne.size(); index++)
        {
            JSONObject spellInfo = (JSONObject) levelOne.get(index);

            Spell lvlOneSpells = new Spell();
            //lvlOneSpells.setLevel((String) spellInfo.get("Level"));
            lvlOneSpells.setName((String) spellInfo.get("Name"));
            lvlOneSpells.setSchool((String) spellInfo.get("School"));
            lvlOneSpells.setRitual((String) spellInfo.get("Ritual"));
            lvlOneSpells.setCastingTime((String) spellInfo.get("Casting Time"));
            lvlOneSpells.setRange((String) spellInfo.get("Range"));
            lvlOneSpells.setSpellSize((String) spellInfo.get("Size"));
            lvlOneSpells.setShape((String) spellInfo.get("Shape"));
            lvlOneSpells.setVerbal((String) spellInfo.get("Verbal"));
            lvlOneSpells.setSomatic((String) spellInfo.get("Somatic"));
            lvlOneSpells.setMaterial((String) spellInfo.get("Material"));
            lvlOneSpells.setValue((String) spellInfo.get("Value"));
            lvlOneSpells.setConsumed((String) spellInfo.get("Consumed"));
            lvlOneSpells.setConcentration((String) spellInfo.get("Concentration"));
            lvlOneSpells.setDuration((String) spellInfo.get("Duration"));
            lvlOneSpells.setHigherLevels((String) spellInfo.get("Higher Levels"));
            lvlOneSpells.setHigherEffect((String) spellInfo.get("Higher Effect"));
            lvlOneSpells.setAttack((String) spellInfo.get("Attack"));
            lvlOneSpells.setSave((String) spellInfo.get("Save..."));
            lvlOneSpells.setSuck((String) spellInfo.get("or Suck"));
            lvlOneSpells.setCheck((String) spellInfo.get("Check"));
            lvlOneSpells.setDice((String) spellInfo.get("Dice"));
            lvlOneSpells.setDmgType((String) spellInfo.get("Dmg Type"));
            lvlOneSpells.setEffect((String) spellInfo.get("Effect"));

            oneSpellList.add(lvlOneSpells);
        }
        for(int index = 0; index < levelTwo.size(); index++)
        {
            JSONObject spellInfo = (JSONObject) levelTwo.get(index);

            Spell lvlTwoSpells = new Spell();
            //lvlTwoSpells.setLevel((String) spellInfo.get("Level"));
            lvlTwoSpells.setName((String) spellInfo.get("Name"));
            lvlTwoSpells.setSchool((String) spellInfo.get("School"));
            lvlTwoSpells.setRitual((String) spellInfo.get("Ritual"));
            lvlTwoSpells.setCastingTime((String) spellInfo.get("Casting Time"));
            lvlTwoSpells.setRange((String) spellInfo.get("Range"));
            lvlTwoSpells.setSpellSize((String) spellInfo.get("Size"));
            lvlTwoSpells.setShape((String) spellInfo.get("Shape"));
            lvlTwoSpells.setVerbal((String) spellInfo.get("Verbal"));
            lvlTwoSpells.setSomatic((String) spellInfo.get("Somatic"));
            lvlTwoSpells.setMaterial((String) spellInfo.get("Material"));
            lvlTwoSpells.setValue((String) spellInfo.get("Value"));
            lvlTwoSpells.setConsumed((String) spellInfo.get("Consumed"));
            lvlTwoSpells.setConcentration((String) spellInfo.get("Concentration"));
            lvlTwoSpells.setDuration((String) spellInfo.get("Duration"));
            lvlTwoSpells.setHigherLevels((String) spellInfo.get("Higher Levels"));
            lvlTwoSpells.setHigherEffect((String) spellInfo.get("Higher Effect"));
            lvlTwoSpells.setAttack((String) spellInfo.get("Attack"));
            lvlTwoSpells.setSave((String) spellInfo.get("Save..."));
            lvlTwoSpells.setSuck((String) spellInfo.get("or Suck"));
            lvlTwoSpells.setCheck((String) spellInfo.get("Check"));
            lvlTwoSpells.setDice((String) spellInfo.get("Dice"));
            lvlTwoSpells.setDmgType((String) spellInfo.get("Dmg Type"));
            lvlTwoSpells.setEffect((String) spellInfo.get("Effect"));

            twoSpellList.add(lvlTwoSpells);
        }
        for(int index = 0; index < levelThree.size(); index++)
        {
            JSONObject spellInfo = (JSONObject) levelThree.get(index);

            Spell lvlThreeSpells = new Spell();
            //lvlThreeSpells.setLevel((String) spellInfo.get("Level"));
            lvlThreeSpells.setName((String) spellInfo.get("Name"));
            lvlThreeSpells.setSchool((String) spellInfo.get("School"));
            lvlThreeSpells.setRitual((String) spellInfo.get("Ritual"));
            lvlThreeSpells.setCastingTime((String) spellInfo.get("Casting Time"));
            lvlThreeSpells.setRange((String) spellInfo.get("Range"));
            lvlThreeSpells.setSpellSize((String) spellInfo.get("Size"));
            lvlThreeSpells.setShape((String) spellInfo.get("Shape"));
            lvlThreeSpells.setVerbal((String) spellInfo.get("Verbal"));
            lvlThreeSpells.setSomatic((String) spellInfo.get("Somatic"));
            lvlThreeSpells.setMaterial((String) spellInfo.get("Material"));
            lvlThreeSpells.setValue((String) spellInfo.get("Value"));
            lvlThreeSpells.setConsumed((String) spellInfo.get("Consumed"));
            lvlThreeSpells.setConcentration((String) spellInfo.get("Concentration"));
            lvlThreeSpells.setDuration((String) spellInfo.get("Duration"));
            lvlThreeSpells.setHigherLevels((String) spellInfo.get("Higher Levels"));
            lvlThreeSpells.setHigherEffect((String) spellInfo.get("Higher Effect"));
            lvlThreeSpells.setAttack((String) spellInfo.get("Attack"));
            lvlThreeSpells.setSave((String) spellInfo.get("Save..."));
            lvlThreeSpells.setSuck((String) spellInfo.get("or Suck"));
            lvlThreeSpells.setCheck((String) spellInfo.get("Check"));
            lvlThreeSpells.setDice((String) spellInfo.get("Dice"));
            lvlThreeSpells.setDmgType((String) spellInfo.get("Dmg Type"));
            lvlThreeSpells.setEffect((String) spellInfo.get("Effect"));

            threeSpellList.add(lvlThreeSpells);
        }
        for(int index = 0; index < levelFour.size(); index++)
        {
            JSONObject spellInfo = (JSONObject) levelFour.get(index);

            Spell lvlFourSpells = new Spell();
            //lvlFourSpells.setLevel((String) spellInfo.get("Level"));
            lvlFourSpells.setName((String) spellInfo.get("Name"));
            lvlFourSpells.setSchool((String) spellInfo.get("School"));
            lvlFourSpells.setRitual((String) spellInfo.get("Ritual"));
            lvlFourSpells.setCastingTime((String) spellInfo.get("Casting Time"));
            lvlFourSpells.setRange((String) spellInfo.get("Range"));
            lvlFourSpells.setSpellSize((String) spellInfo.get("Size"));
            lvlFourSpells.setShape((String) spellInfo.get("Shape"));
            lvlFourSpells.setVerbal((String) spellInfo.get("Verbal"));
            lvlFourSpells.setSomatic((String) spellInfo.get("Somatic"));
            lvlFourSpells.setMaterial((String) spellInfo.get("Material"));
            lvlFourSpells.setValue((String) spellInfo.get("Value"));
            lvlFourSpells.setConsumed((String) spellInfo.get("Consumed"));
            lvlFourSpells.setConcentration((String) spellInfo.get("Concentration"));
            lvlFourSpells.setDuration((String) spellInfo.get("Duration"));
            lvlFourSpells.setHigherLevels((String) spellInfo.get("Higher Levels"));
            lvlFourSpells.setHigherEffect((String) spellInfo.get("Higher Effect"));
            lvlFourSpells.setAttack((String) spellInfo.get("Attack"));
            lvlFourSpells.setSave((String) spellInfo.get("Save..."));
            lvlFourSpells.setSuck((String) spellInfo.get("or Suck"));
            lvlFourSpells.setCheck((String) spellInfo.get("Check"));
            lvlFourSpells.setDice((String) spellInfo.get("Dice"));
            lvlFourSpells.setDmgType((String) spellInfo.get("Dmg Type"));
            lvlFourSpells.setEffect((String) spellInfo.get("Effect"));

            fourSpellList.add(lvlFourSpells);
        }
        for(int index = 0; index < levelFive.size(); index++)
        {
            JSONObject spellInfo = (JSONObject) levelFive.get(index);

            Spell lvlFiveSpells = new Spell();
            //lvlFiveSpells.setLevel((String) spellInfo.get("Level"));
            lvlFiveSpells.setName((String) spellInfo.get("Name"));
            lvlFiveSpells.setSchool((String) spellInfo.get("School"));
            lvlFiveSpells.setRitual((String) spellInfo.get("Ritual"));
            lvlFiveSpells.setCastingTime((String) spellInfo.get("Casting Time"));
            lvlFiveSpells.setRange((String) spellInfo.get("Range"));
            lvlFiveSpells.setSpellSize((String) spellInfo.get("Size"));
            lvlFiveSpells.setShape((String) spellInfo.get("Shape"));
            lvlFiveSpells.setVerbal((String) spellInfo.get("Verbal"));
            lvlFiveSpells.setSomatic((String) spellInfo.get("Somatic"));
            lvlFiveSpells.setMaterial((String) spellInfo.get("Material"));
            lvlFiveSpells.setValue((String) spellInfo.get("Value"));
            lvlFiveSpells.setConsumed((String) spellInfo.get("Consumed"));
            lvlFiveSpells.setConcentration((String) spellInfo.get("Concentration"));
            lvlFiveSpells.setDuration((String) spellInfo.get("Duration"));
            lvlFiveSpells.setHigherLevels((String) spellInfo.get("Higher Levels"));
            lvlFiveSpells.setHigherEffect((String) spellInfo.get("Higher Effect"));
            lvlFiveSpells.setAttack((String) spellInfo.get("Attack"));
            lvlFiveSpells.setSave((String) spellInfo.get("Save..."));
            lvlFiveSpells.setSuck((String) spellInfo.get("or Suck"));
            lvlFiveSpells.setCheck((String) spellInfo.get("Check"));
            lvlFiveSpells.setDice((String) spellInfo.get("Dice"));
            lvlFiveSpells.setDmgType((String) spellInfo.get("Dmg Type"));
            lvlFiveSpells.setEffect((String) spellInfo.get("Effect"));

            fiveSpellList.add(lvlFiveSpells);
        }
        for(int index = 0; index < levelSix.size(); index++)
        {
            JSONObject spellInfo = (JSONObject) levelSix.get(index);

            Spell lvlSixSpells = new Spell();
            //lvlSixSpells.setLevel((String) spellInfo.get("Level"));
            lvlSixSpells.setName((String) spellInfo.get("Name"));
            lvlSixSpells.setSchool((String) spellInfo.get("School"));
            lvlSixSpells.setRitual((String) spellInfo.get("Ritual"));
            lvlSixSpells.setCastingTime((String) spellInfo.get("Casting Time"));
            lvlSixSpells.setRange((String) spellInfo.get("Range"));
            lvlSixSpells.setSpellSize((String) spellInfo.get("Size"));
            lvlSixSpells.setShape((String) spellInfo.get("Shape"));
            lvlSixSpells.setVerbal((String) spellInfo.get("Verbal"));
            lvlSixSpells.setSomatic((String) spellInfo.get("Somatic"));
            lvlSixSpells.setMaterial((String) spellInfo.get("Material"));
            lvlSixSpells.setValue((String) spellInfo.get("Value"));
            lvlSixSpells.setConsumed((String) spellInfo.get("Consumed"));
            lvlSixSpells.setConcentration((String) spellInfo.get("Concentration"));
            lvlSixSpells.setDuration((String) spellInfo.get("Duration"));
            lvlSixSpells.setHigherLevels((String) spellInfo.get("Higher Levels"));
            lvlSixSpells.setHigherEffect((String) spellInfo.get("Higher Effect"));
            lvlSixSpells.setAttack((String) spellInfo.get("Attack"));
            lvlSixSpells.setSave((String) spellInfo.get("Save..."));
            lvlSixSpells.setSuck((String) spellInfo.get("or Suck"));
            lvlSixSpells.setCheck((String) spellInfo.get("Check"));
            lvlSixSpells.setDice((String) spellInfo.get("Dice"));
            lvlSixSpells.setDmgType((String) spellInfo.get("Dmg Type"));
            lvlSixSpells.setEffect((String) spellInfo.get("Effect"));

            sixSpellList.add(lvlSixSpells);
        }
        for(int index = 0; index < levelSeven.size(); index++)
        {
            JSONObject spellInfo = (JSONObject) levelSeven.get(index);

            Spell lvlSevenSpells = new Spell();
            //lvlSevenSpells.setLevel((String) spellInfo.get("Level"));
            lvlSevenSpells.setName((String) spellInfo.get("Name"));
            lvlSevenSpells.setSchool((String) spellInfo.get("School"));
            lvlSevenSpells.setRitual((String) spellInfo.get("Ritual"));
            lvlSevenSpells.setCastingTime((String) spellInfo.get("Casting Time"));
            lvlSevenSpells.setRange((String) spellInfo.get("Range"));
            lvlSevenSpells.setSpellSize((String) spellInfo.get("Size"));
            lvlSevenSpells.setShape((String) spellInfo.get("Shape"));
            lvlSevenSpells.setVerbal((String) spellInfo.get("Verbal"));
            lvlSevenSpells.setSomatic((String) spellInfo.get("Somatic"));
            lvlSevenSpells.setMaterial((String) spellInfo.get("Material"));
            lvlSevenSpells.setValue((String) spellInfo.get("Value"));
            lvlSevenSpells.setConsumed((String) spellInfo.get("Consumed"));
            lvlSevenSpells.setConcentration((String) spellInfo.get("Concentration"));
            lvlSevenSpells.setDuration((String) spellInfo.get("Duration"));
            lvlSevenSpells.setHigherLevels((String) spellInfo.get("Higher Levels"));
            lvlSevenSpells.setHigherEffect((String) spellInfo.get("Higher Effect"));
            lvlSevenSpells.setAttack((String) spellInfo.get("Attack"));
            lvlSevenSpells.setSave((String) spellInfo.get("Save..."));
            lvlSevenSpells.setSuck((String) spellInfo.get("or Suck"));
            lvlSevenSpells.setCheck((String) spellInfo.get("Check"));
            lvlSevenSpells.setDice((String) spellInfo.get("Dice"));
            lvlSevenSpells.setDmgType((String) spellInfo.get("Dmg Type"));
            lvlSevenSpells.setEffect((String) spellInfo.get("Effect"));

            sevenSpellList.add(lvlSevenSpells);
        }
        for(int index = 0; index < levelEight.size(); index++)
        {
            JSONObject spellInfo = (JSONObject) levelEight.get(index);

            Spell lvlEightSpells = new Spell();
            //lvlEightSpells.setLevel((String) spellInfo.get("Level"));
            lvlEightSpells.setName((String) spellInfo.get("Name"));
            lvlEightSpells.setSchool((String) spellInfo.get("School"));
            lvlEightSpells.setRitual((String) spellInfo.get("Ritual"));
            lvlEightSpells.setCastingTime((String) spellInfo.get("Casting Time"));
            lvlEightSpells.setRange((String) spellInfo.get("Range"));
            lvlEightSpells.setSpellSize((String) spellInfo.get("Size"));
            lvlEightSpells.setShape((String) spellInfo.get("Shape"));
            lvlEightSpells.setVerbal((String) spellInfo.get("Verbal"));
            lvlEightSpells.setSomatic((String) spellInfo.get("Somatic"));
            lvlEightSpells.setMaterial((String) spellInfo.get("Material"));
            lvlEightSpells.setValue((String) spellInfo.get("Value"));
            lvlEightSpells.setConsumed((String) spellInfo.get("Consumed"));
            lvlEightSpells.setConcentration((String) spellInfo.get("Concentration"));
            lvlEightSpells.setDuration((String) spellInfo.get("Duration"));
            lvlEightSpells.setHigherLevels((String) spellInfo.get("Higher Levels"));
            lvlEightSpells.setHigherEffect((String) spellInfo.get("Higher Effect"));
            lvlEightSpells.setAttack((String) spellInfo.get("Attack"));
            lvlEightSpells.setSave((String) spellInfo.get("Save..."));
            lvlEightSpells.setSuck((String) spellInfo.get("or Suck"));
            lvlEightSpells.setCheck((String) spellInfo.get("Check"));
            lvlEightSpells.setDice((String) spellInfo.get("Dice"));
            lvlEightSpells.setDmgType((String) spellInfo.get("Dmg Type"));
            lvlEightSpells.setEffect((String) spellInfo.get("Effect"));

            eightSpellList.add(lvlEightSpells);
        }
        for(int index = 0; index < levelNine.size(); index++)
        {
            JSONObject spellInfo = (JSONObject) levelNine.get(index);

            Spell lvlNineSpells = new Spell();
            //lvlNineSpells.setLevel((String) spellInfo.get("Level"));
            lvlNineSpells.setName((String) spellInfo.get("Name"));
            lvlNineSpells.setSchool((String) spellInfo.get("School"));
            lvlNineSpells.setRitual((String) spellInfo.get("Ritual"));
            lvlNineSpells.setCastingTime((String) spellInfo.get("Casting Time"));
            lvlNineSpells.setRange((String) spellInfo.get("Range"));
            lvlNineSpells.setSpellSize((String) spellInfo.get("Size"));
            lvlNineSpells.setShape((String) spellInfo.get("Shape"));
            lvlNineSpells.setVerbal((String) spellInfo.get("Verbal"));
            lvlNineSpells.setSomatic((String) spellInfo.get("Somatic"));
            lvlNineSpells.setMaterial((String) spellInfo.get("Material"));
            lvlNineSpells.setValue((String) spellInfo.get("Value"));
            lvlNineSpells.setConsumed((String) spellInfo.get("Consumed"));
            lvlNineSpells.setConcentration((String) spellInfo.get("Concentration"));
            lvlNineSpells.setDuration((String) spellInfo.get("Duration"));
            lvlNineSpells.setHigherLevels((String) spellInfo.get("Higher Levels"));
            lvlNineSpells.setHigherEffect((String) spellInfo.get("Higher Effect"));
            lvlNineSpells.setAttack((String) spellInfo.get("Attack"));
            lvlNineSpells.setSave((String) spellInfo.get("Save..."));
            lvlNineSpells.setSuck((String) spellInfo.get("or Suck"));
            lvlNineSpells.setCheck((String) spellInfo.get("Check"));
            lvlNineSpells.setDice((String) spellInfo.get("Dice"));
            lvlNineSpells.setDmgType((String) spellInfo.get("Dmg Type"));
            lvlNineSpells.setEffect((String) spellInfo.get("Effect"));

            nineSpellList.add(lvlNineSpells);

        }
        //ListIterator<Spell> iterC = canSpellList.listIterator();
        //ListIterator<Spell> iter1 = oneSpellList.listIterator();
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter a wizard name: ");
        String userName = userInput.nextLine();
        System.out.println("Enter your wizard level: ");
        int userLevel = userInput.nextInt();
        Wizard wizard1 = new Wizard();
        wizard1.setName(userName);
        wizard1.setLevel(userLevel);
        int maxcan = 0;
        int maxspells = 0;
        switch (userLevel){
            case 1:
                System.out.println("You are level 1." + "\n" + "You can choose 3 cantrips and 6 1st level spells.");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");

                for (Spell iterator : canSpellList){
                    System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                    System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        //iterC.remove();
                        maxcan++;
                        if(maxcan >= 3){
                            break;
                    }
                }
                }
                    System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                    System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        //iter1.remove();
                        maxspells++;
                        if(maxspells >= 6){
                            break;
                    }
                }
                }
                break;
            case 2:
                System.out.println("You are level 2." + "\n" + "You can add up to 8 spells and 3 cantrips.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 3){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 8){
                            break;
                        }
                    }
                }
                break;
            case 3:
                System.out.println("You are level 3." + "\n" + "You can add up to 10 spells and 3 cantrips." + "Second Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 3){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 10){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 10){
                            break;
                        }
                    }
                }
                break;
            case 4:
                System.out.println("You are level 4." + "\n" + "You can add up to 4 cantrips and 12 spells." + "Second Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 4){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 12){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 12){
                            break;
                        }
                    }
                }
                break;
            case 5:
                System.out.println("You are level 5." + "\n" + "You can add up to 14 spells and 4 cantrips." + "Third Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 4){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 14){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 14){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 14){
                            break;
                        }
                    }
                }
                break;
            case 6:
                System.out.println("You are level 6." + "\n" + "You can up to 16 spells and 4 cantrips." + "Third Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 4){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 16){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 16){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 16){
                            break;
                        }
                    }
                }
                break;
            case 7:
                System.out.println("You are level 7." + "\n" + "You can add up to 18 spells and 4 cantrips." + "Fourth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 4){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 18){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 18){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 18){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 18){
                            break;
                        }
                    }
                }
                break;
            case 8:
                System.out.println("You are level 8." + "\n" + "You can add up to 20 spells and 4 cantrips." + "Fourth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 4){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 20){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 20){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 20){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 20){
                            break;
                        }
                    }
                }
                break;
            case 9:
                System.out.println("You are level 9." + "\n" + "You can add up to 22 spells and 4 cantrips." + "Fifth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 4){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 22){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 22){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 22){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 22){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 22){
                            break;
                        }
                    }
                }
                break;
            case 10:
                System.out.println("You are level 10." + "\n" + "You can add up to 24 spells and 5 cantrips." + "Fifth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 24){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 24){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 24){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 24){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 24){
                            break;
                        }
                    }
                }
                break;
            case 11:
                System.out.println("You are level 11." + "\n" + "You can add up to 26 spells and 5 cantrips." + "Sixth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 26){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 26){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 26){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 26){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 26){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SIX SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sixSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 26){
                            break;
                        }
                    }
                }
                break;
            case 12:
                System.out.println("You are level 12." + "\n" + "You can add up to 28 spells and 5 cantrips." + "Sixth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 28){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 28){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 28){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 28){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 28){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SIX SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sixSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 28){
                            break;
                        }
                    }
                }
                break;
            case 13:
                System.out.println("You are level 13." + "\n" + "You can add up to 30 spells and 5 cantrips." + "Seventh Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 30){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 30){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 30){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 30){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 30){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SIX SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sixSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 30){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SEVEN SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sevenSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 30){
                            break;
                        }
                    }
                }
                break;
            case 14:
                System.out.println("You are level 14." + "\n" + "You can add up to 32 spells and 5 cantrips." + "Seventh Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 32){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 32){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 32){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 32){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 32){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SIX SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sixSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 32){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SEVEN SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sevenSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 32){
                            break;
                        }
                    }
                }
                break;
            case 15:
                System.out.println("You are level 15." + "\n" + "You can add up to 34 spells and 5 cantrips." + "Eighth Level Spells are now available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 34){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 34){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 34){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 34){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 34){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SIX SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sixSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 34){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SEVEN SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sevenSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 34){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL EIGHT SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : eightSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 34){
                            break;
                        }
                    }
                }
                break;
            case 16:
                System.out.println("You are level 16." + "\n" + "You can add up to 36 spells and 5 cantrips." + "Eighth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 36){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 36){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 36){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 36){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 36){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SIX SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sixSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 36){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SEVEN SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sevenSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 36){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL EIGHT SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : eightSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 36){
                            break;
                        }
                    }
                }
                break;
            case 17:
                System.out.println("You are level 17." + "\n" + "You can add up to 38 spells and 5 cantrips." + "Ninth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 38){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 38){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 38){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 38){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 38){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SIX SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sixSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 38){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SEVEN SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sevenSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 38){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL EIGHT SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : eightSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 38){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL NINE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : nineSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 38){
                            break;
                        }
                    }
                }
                break;
            case 18:
                System.out.println("You are level 18." + "\n" + "You can add up to 40 spells and 5 cantrips." + "Ninth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 40){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 40){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 40){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 40){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 40){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SIX SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sixSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 40){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SEVEN SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sevenSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 40){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL EIGHT SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : eightSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 40){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL NINE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : nineSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 40){
                            break;
                        }
                    }
                }
                break;
            case 19:
                System.out.println("You are level 19." + "\n" + "You can add up to 42 spells and 5 cantrips." + "Ninth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 42){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 42){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 42){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 42){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 42){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SIX SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sixSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 42){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SEVEN SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sevenSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 42){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL EIGHT SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : eightSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 42){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL NINE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : nineSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 42){
                            break;
                        }
                    }
                }
                break;
            case 20:
                System.out.println("You are level 20." + "\n" + "You can add up to 44 spells and 5 cantrips." + "Ninth Level Spells are available.");
                System.out.println("\nCurrent number of cantrips known: " + maxcan + "\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****CANTRIP SPELLS*****\n");
                for (Spell iterator : canSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addCantrips();
                        maxcan++;
                        if(maxcan >= 5){
                            break;
                        }
                    }
                }
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                System.out.println("\n" + "*****LEVEL ONE SPELLS*****\n");
                for (Spell iterator : oneSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 44){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL TWO SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : twoSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 44){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL THREE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : threeSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 44){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FOUR SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fourSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 44){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL FIVE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : fiveSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 44){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SIX SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sixSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 44){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL SEVEN SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : sevenSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 44){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL EIGHT SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : eightSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 44){
                            break;
                        }
                    }
                }
                System.out.println("\n" + "*****LEVEL NINE SPELLS*****\n");
                System.out.println("\nCurrent number of spells known: " + maxspells + "\n");
                for (Spell iterator : nineSpellList){
                    System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                            "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                            "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                            iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                            "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                            + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                            "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n\n"
                            + "Would you like to add this spell? (Y/N)");
                    if(userInput.next().startsWith("y")){
                        wizard1.addSpells();
                        maxspells++;
                        if(maxspells >= 44){
                            break;
                        }
                    }
                }
                break;
            default:
                System.out.println("Invalid Input.");
                break;

        }
        System.out.println(wizard1);
        System.out.println("\n" + "Known Wizard Cantrips: ");
        System.out.println(wizard1.getCantrips());
        for (Spell iterator : wizard1.getCantrips()){
            System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                    "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                    "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                    iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                    "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                    + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                    "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n");
        }
        System.out.println("\n" + "Known Wizard Spells: ");
        System.out.println(wizard1.getSpells());
        for (Spell iterator : wizard1.getSpells()){
            System.out.println("Name: " + iterator.getName() + "\n" + "School: " + iterator.getSchool() + "\n" + "Ritual: " + iterator.getRitual() +
                    "\n" + "Casting Time: " + iterator.getCastingTime() + "\n" + "Range: " + iterator.getRange() + "\n" + "Spell Size: " + iterator.getSpellSize() +
                    "\n" + "Spell Shape: " + iterator.getShape() + "\n" + "Verbal? " + iterator.getVerbal() + "\n" + "Somatic? " + iterator.getSomatic() + "\n" + "Material? " + iterator.getMaterial() + "\n" + "Value: " +
                    iterator.getValue() + "\n" + "Consumed? " + iterator.getConsumed() + "\n" + "Concentration: " + iterator.getConcentration() + "\n" + "Duration: " + iterator.getDuration() + "\n" +
                    "Higher Level Bonus: " + iterator.getHigherLevels() + "\n" + "Higher Effect Bonus: " + iterator.getHigherEffect() + "\n"
                    + "Attack: " + iterator.getAttack() + "\n" + "Saving Throw: " + iterator.getSave() + "\n" + "Fail Save: " + iterator.getSuck() + "\n" + "Skill Check: " + iterator.getCheck() +
                    "\n" + "Dice: " + iterator.getDice() + "\n" + "Damage Type: " + iterator.getDmgType() + "\n" + "Effect: " + iterator.getEffect() + "\n");
        }
    }
}
