
package uno;

import java.util.ArrayList;
import java.util.List;

public class Player {
    
    private String id;
    private String name;
    private ArrayList <Card> hand = new ArrayList <Card>();
    
    public Player(String id, String name, ArrayList<Card> hand) {
        this.id = id;
        this.name = name;
        this.hand = hand;
    }

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", name=" + name + '}';
    }
    
    public void addCard(Card c){
        hand.add(c);
    }
    
    public void removeCard(Card c){
        if(!hand.isEmpty()){
           hand.remove(c);
        }
    }
    

}
