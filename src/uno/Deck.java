package uno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private ArrayList<Card> cards;

    public ArrayList<Card> getCards() {
        return cards;
    }
    int cardAmount = 108;

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
    }
    
    public Deck(){
        cards=new ArrayList<Card>();
    }
    
    public Deck createNewDeck() {

        String colorArray[] = {"red", "yellow", "green", "blue", "wild"};
        String type[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine","skip", "reverse", "draw_two,", "draw_four","wild"};
        cards = new ArrayList<Card>();

        for (int c = 0; c < 4; c++) {

            for (int i = 0; i < 13; i++) {

                for(int a = 0; a < 2 ;a++ ){
                cards.add(new Card(colorArray[c], type[i]));
                } 
            }
            cards.add(new Card(colorArray[c],type[0]));
            cards.add(new Card(colorArray[4],type[14]));
            cards.add(new Card(colorArray[4],type[13]));
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


    


