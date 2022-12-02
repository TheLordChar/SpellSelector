import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

class gui{
    public static void main(String args[]) {

        //Creating the Frame
        JFrame frame = new JFrame("Please for the love of got please help me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

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
        JToggleButton reset = new JToggleButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(js);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

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
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.getContentPane().add(BorderLayout.EAST, scr);
        frame.setVisible(true);
    }

    public static JButton addSpell(Spell s){
        JButton Butt = new JButton(s.Name);
        Butt.setActionCommand(s+"ButtonCLick");
        Butt.addActionListener(e -> {
            JFrame frame = new JFrame("test");
            JOptionPane mess = new JOptionPane("You pressed the " + s + " button");
            JOptionPane.showMessageDialog(frame, mess.getMessage());
        });
        return Butt;
    }
}

