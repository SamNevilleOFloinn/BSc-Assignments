/**
 * @author Sam O'Floinn
 * 
 * @param 
 * The Deck object is composed of cards. A standard card deck consists of 52 cards.
 * - Upon construction, a deck is initialised. It is created in complete order.
 * - Then it is shuffled; its cards are ordered around differently until it is significantly
 *  different from its original state.
*/
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
  
  private ArrayList<Card> deck = new ArrayList<Card>(52);
  private Card cardDeck[] = new Card[52];
  private String cardType[] = {"Hearts", "Spades", "Diamonds", "Clubs"};
  private String cardName[] = 
  { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  
  Random rand = new Random();  
  
  public static void main(String[] args)
  {
    Deck testDeck = new Deck();
  }
  
  public Deck() {
    this.initialise();
    System.out.println("");
    Collections.shuffle(deck);
    //this.printDeck();
  }
  
  /**
   * @param
   * This method is called upon construction to create the deck.
   * The cards are assigned their types and values, and also added to the deck list.
   */
  private void initialise() {
    int index = 0;  //move through the deck array. Type -> Name -> Value. 
    for (int i = 0; i < cardType.length; i++) //Type loop
    {
      for (int j = 0; j < cardName.length; j++)  //Name loop.
      {
        deck.add(new Card(cardName[j], cardType[i]) );
        index++;
        //System.out.println(deck.size() );
      }
    }
  }
  
  public void printDeck()
  {
    for (int i = 0; i < deck.size(); i++)
    {
      System.out.println("Card at spot " + (i + 1) + ":");
      (deck.get(i)).printCard();
    }
  }
  
  /**
   * @param
   * The following three methods, I hope, exemplify 
   * the advantages I saw in using an arraylist structure.
   */
  public Card drawCard()
  {
    return deck.remove(0);
  }
  
  private void shuffle()
  {
    Collections.shuffle(deck);
  }
  
  public int size()
  {
    return deck.size();
  }
  
}