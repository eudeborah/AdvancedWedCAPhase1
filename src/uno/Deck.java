package uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private ArrayList<Card> cards;
    int cardAmount = 108;
    
    public Deck(){
        cards=new ArrayList<Card>();
    }
    
    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }
    
    public Deck createNewDeck() {

        String colorArray[] = {"Red", "Yellow", "Green", "Blue", "Wild"};
        String type[] = {"Number"," Skip", "Reverse", "Draw_two", "Draw_four"};
        int value[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20, 50};
        cards = new ArrayList<Card>();

        for (int i = 0; i < 4; i++) {
            for(int j = 0; j < 9 ;j++ ){
                cards.add(new Card(colorArray[i], type[0], value[j]));
            }
            for (int k = 1; k < 4; k++) {
                    cards.add(new Card(colorArray[i], type[k], value[9]));
                } 
            }
        for(int i = 3; i < 5; i ++ ){
            cards.add(new Card(colorArray[4], type[i], value[10]));
        }

        Collections.shuffle(cards);
        
        return new Deck(cards);
   }
    
    public Card takeCard(){
        if(!cards.isEmpty()){
            cards.remove(0);
        }
         return null;
    }
    
    public void addCard(Card c){
        cards.add(c);
    }
}

    


