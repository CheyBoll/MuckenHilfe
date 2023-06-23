import java.util.ArrayList; 
import java.util.List;

public class Test{
    
    public Test()
    {

    }

    public static void main(String[] args) {
        List<String> deck = generateDeck();
    }

    public static List<String> generateDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Eichel", "Gras", "Herz", "Schelln"};
        String[] ranks = {"Ass", "10", "König", "Ober", "Unter", "9"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }
}
