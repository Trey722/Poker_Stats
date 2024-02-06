import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    
    private List<Card> cards;
    private int cardsLeft;
    
    public Deck()
    {
        initializeDeck();
    }

    private void initializeDeck() {
        cards = new ArrayList<>();
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 2; j <= 14; j++)
            {
                Card cur = new Card(i, j); 
                cards.add(cur); 
            }
        }
        cardsLeft = 52;
    }

    public void shuffle()
    {
        for(int i = 0; i < 100; i++)
        {
            int num1 = functions.getRandomNumber(0, cardsLeft); 
            int num2 = functions.getRandomNumber(0, cardsLeft); 
            Collections.swap(cards, num1, num2);
        }
    }

    public void printDeck()
    {
        for (int i = 0; i < cardsLeft; i++)
        {
            Card card = cards.get(i);
            card.printCard(); 
        }
    }

   
}
