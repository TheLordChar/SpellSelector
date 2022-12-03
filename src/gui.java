import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

class gui{
    public static void main(String[] args) {

        Toolkit t=Toolkit.getDefaultToolkit();

        //Creating the Frame
        JFrame frame = new JFrame("Group 5 Wizard Spell Suggester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600, 900);
        frame.setIconImage(t.getImage("src/SpellSelector2.png"));
        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();



        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("# of Wizard levels:");
        JSlider js = new JSlider(0,20);
        js.setMajorTickSpacing(5);
        js.setMinorTickSpacing(1);
        js.setSnapToTicks(true);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(js);
        panel.add(send);
        panel.add(reset);


        SpellReader Reader = new SpellReader("src/SpellRepo.json");
        Reader.loadFile();
        ArrayList<Spell> SpellList = Reader.retrieveArray();
        ScrollPane scr = new ScrollPane();
        JPanel allSpell = new JPanel(new GridLayout(SpellList.size()/2, 2));
        for (Spell spell : SpellList) {
            allSpell.add(addSpell(spell), -1);
        }
        scr.add(allSpell,0);
        scr.setSize(550,500);

        //makes it to where scrolling doesn't take 50 years
        scr.getVAdjustable().setUnitIncrement(16);

        scr.doLayout();
        ScrollPane scr2 = new ScrollPane();
        JPanel allTag = new JPanel(new GridLayout(8, 8));

        ArrayList<JToggleButton> Schools = new ArrayList<>();
        Schools.add(new JToggleButton("Abjuration",new ImageIcon(new ImageIcon("src/AbjIcSmall.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
        Schools.add(new JToggleButton("Conjuration",new ImageIcon(new ImageIcon("src/ConjIcSmall.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
        Schools.add(new JToggleButton("Divination",new ImageIcon(new ImageIcon("src/DivIcSmall.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
        Schools.add(new JToggleButton("Enchantment",new ImageIcon(new ImageIcon("src/EnchIcSmall.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
        Schools.add(new JToggleButton("Evocation",new ImageIcon(new ImageIcon("src/EvoIcSmall.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
        Schools.add(new JToggleButton("Illusion",new ImageIcon(new ImageIcon("src/IllIcSmall.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
        Schools.add(new JToggleButton("Necromancy",new ImageIcon(new ImageIcon("src/NecIcSmall.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
        Schools.add(new JToggleButton("Transmutation",new ImageIcon(new ImageIcon("src/TranIcSmall.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH))));
        JPanel allSchool = new JPanel(new GridLayout(2, 4));
        for(int i = 0; i < 8; i++){
            allSchool.add(Schools.get(i),i);
        }

        ArrayList<JToggleButton> comp = new ArrayList<>();
        comp.add(new JToggleButton("Somatic"));
        comp.add(new JToggleButton("Verbal"));
        comp.add(new JToggleButton("Material"));
        comp.add(new JToggleButton("Material Components Consumed"));
        comp.add(new JToggleButton("Concentration"));
        comp.add(new JToggleButton("Ritual Cast Available"));
        JPanel allComp = new JPanel(new GridLayout(2, 3));
        for(int i = 0; i < comp.size(); i++){
            allComp.add(comp.get(i),i);
        }

        ArrayList<JToggleButton> time = new ArrayList<>();
        time.add(new JToggleButton("Action"));
        time.add(new JToggleButton("Bonus Action"));
        time.add(new JToggleButton("Reaction"));
        time.add(new JToggleButton("1 Minute"));
        time.add(new JToggleButton("10 Minutes"));
        time.add(new JToggleButton("1 Hour"));
        time.add(new JToggleButton("12 Hours"));
        JPanel allTime = new JPanel(new GridLayout(2, 4));
        for(int i = 0; i < time.size(); i++){
            allTime.add(time.get(i),i);
        }

        ArrayList<JToggleButton> roll = new ArrayList<>();
        roll.add(new JToggleButton("No Attack Roll"));
        roll.add(new JToggleButton("Ranged Roll"));
        roll.add(new JToggleButton("Melee Roll"));
        roll.add(new JToggleButton("No Save"));
        roll.add(new JToggleButton("Str Save"));
        roll.add(new JToggleButton("Dex Save"));
        roll.add(new JToggleButton("Con save"));
        roll.add(new JToggleButton("Int save"));
        roll.add(new JToggleButton("Wis save"));
        roll.add(new JToggleButton("Cha save"));
        roll.add(new JToggleButton("Misc saves"));
        roll.add(new JToggleButton("Save is a Suck"));
        JPanel allRoll = new JPanel(new GridLayout(3, 4));
        for(int i = 0; i < roll.size(); i++){
            allRoll.add(roll.get(i),i);
        }

        allTag.add(allSchool,0);
        allTag.add(allComp, 1);
        allTag.add(allTime, 2);
        allTag.add(allRoll, 3);



        scr2.add(allTag,0);
        scr2.getVAdjustable().setUnitIncrement(16);
        scr.setSize(550,500);
        scr2.doLayout();

        send.setActionCommand("AHLAWD");
        send.addActionListener(e -> {
            ArrayList<Spell> filteredSpells = select(SpellList,Schools,comp,time,roll,js);
            scr.removeAll();
            JPanel allSpell2 = new JPanel(new GridLayout(filteredSpells.size()/2, 2));
            for (Spell spell : filteredSpells) {
                allSpell2.add(addSpell(spell), -1);
            }
            scr.add(allSpell2,0);
        });
        reset.setActionCommand("reset");
        reset.addActionListener(e -> {
            ArrayList<Spell> SpellListRes = Reader.retrieveArray();
            scr.removeAll();
            JPanel allSpellres = new JPanel(new GridLayout(SpellListRes.size()/2, 2));
            for (Spell spell : SpellListRes) {
                allSpellres.add(addSpell(spell), -1);
            }
            scr.add(allSpellres,0);
        });





        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, scr2);
        frame.getContentPane().add(BorderLayout.EAST, scr);
        frame.setVisible(true);
    }

    public static JButton addSpell(Spell s){
        JButton Butt = new JButton(s.Name);
        switch (s.School) {
            case "Abjuration" ->
                    Butt.setIcon(new ImageIcon(new ImageIcon("src/AbjIcSmall.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
            case "Conjuration" ->
                    Butt.setIcon(new ImageIcon(new ImageIcon("src/ConjIcSmall.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
            case "Divination" ->
                    Butt.setIcon(new ImageIcon(new ImageIcon("src/DivIcSmall.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
            case "Enchantment" ->
                    Butt.setIcon(new ImageIcon(new ImageIcon("src/EnchIcSmall.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
            case "Evocation" ->
                    Butt.setIcon(new ImageIcon(new ImageIcon("src/EvoIcSmall.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
            case "Illusion" ->
                    Butt.setIcon(new ImageIcon(new ImageIcon("src/IllIcSmall.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
            case "Necromancy" ->
                    Butt.setIcon(new ImageIcon(new ImageIcon("src/NecIcSmall.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
            case "Transmutation" ->
                    Butt.setIcon(new ImageIcon(new ImageIcon("src/TranIcSmall.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        }
        Butt.setActionCommand(s+"ButtonCLick");
        Butt.addActionListener(e -> {
            JFrame frame = new JFrame("test");
            JOptionPane mess = new JOptionPane("You pressed the " + s + " button");
            JOptionPane.showMessageDialog(frame, mess.getMessage());
        });
        return Butt;
    }

    public static ArrayList<Spell> select(ArrayList<Spell> SpellList, ArrayList<JToggleButton> schools, ArrayList<JToggleButton> comp, ArrayList<JToggleButton> time, ArrayList<JToggleButton> roll, JSlider js){
        SpellSelector Todd = new SpellSelector(SpellList);
        ArrayList<ArrayList<String>> str = new ArrayList<>(16);
        ArrayList<Boolean> bools = new ArrayList<>(7);

        for(int i = 0; i< 16; i++){
            str.add(new ArrayList<>());
        }
        for(int i = 0; i< 7; i++){
            bools.add(false);
        }



        for(int i = 0; i < time.size(); i++){
            if(time.get(i).isSelected()){
                str.get(0).add(time.get(i).getText());
            }
        }
        for(int i = 0; i < schools.size(); i++){
            if(schools.get(i).isSelected()){
                str.get(2).add(schools.get(i).getText());
            }
        }
        for (JToggleButton JT : comp) {
            if(JT.isSelected()){
                if(JT.getText().equals("Ritual Cast Available")){
                    bools.set(0, true);
                }
                else if(JT.getText().equals("Somatic")){
                    bools.set(1, true);
                }
                else if(JT.getText().equals("Verbal")){
                    bools.set(2, true);
                }
                else if(JT.getText().equals("Material")){
                    bools.set(3, true);
                }
                else if(JT.getText().equals("Material Components Consumed")){
                    bools.set(4, true);
                }
                else if(JT.getText().equals("Concentration")){
                    bools.set(5, true);
                }
            }
        }
        for(JToggleButton JT : roll){
            if(JT.isSelected()){
                if(JT.getText().equals("Save is a Suck")){
                    bools.set(6, true);
                }
                if(JT.getText().equals("No Attack Roll") || JT.getText().equals("Ranged Roll") || JT.getText().equals("Melee Roll")){
                    str.get(7).add(JT.getText());
                }
                if(JT.getText().equals("No Save") || JT.getText().equals("Str Save") || JT.getText().equals("Dex Save")
                        || JT.getText().equals("Con save") || JT.getText().equals("Int save") || JT.getText().equals("Cha save")){
                    str.get(8).add(JT.getText());
                }
                if(JT.getText().equals("Misc saves")){
                    str.get(8).add("Multiple");
                }
            }
        }
        return Todd.filter(str, bools, js.getValue());
    }
}

