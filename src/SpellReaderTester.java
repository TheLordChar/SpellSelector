import java.util.ArrayList;

public class SpellReaderTester{
    public static void main(String args[]){
        SpellReader Reader = new SpellReader("src/SpellRepo.json");
        Reader.loadFile();
        ArrayList bill = Reader.retrieveArray();

        System.out.println(bill.size());
    }
}
