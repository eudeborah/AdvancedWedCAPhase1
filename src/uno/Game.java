
package uno;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    
    private String id;
    private ArrayList<Player> players;
    private String status;
    private ArrayList<Card> deckCard;
    private Card discardPile;

    public Game(String id, ArrayList<Player> players, String status, ArrayList<Card> deckCard, Card discardPile) {
        this.id = id;
        this.players = players;
        this.status = status;
        this.deckCard = deckCard;
        this.discardPile = discardPile;
    }
    
    public Game(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Card> getDeckCard() {
        return deckCard;
    }

    public void setDeckCard(ArrayList<Card> deckCard) {
        this.deckCard = deckCard;
    }

    public Card getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(Card discardPile) {
        this.discardPile = discardPile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void addPlayer(Player p){
        players.add(p);
    }
    
    public Card takeCardFromDeck(){
        if(!deckCard.isEmpty()){
            deckCard.remove(0);
        }
        return null;
    }
    
    public void takeCardFromPile(){
        this.discardPile = null;
    }
    
    public void discardCard(Card c){
         this.discardPile=c;
    }
    
    public void changeStatus(String status){
        this.status=status;
    }
    
}
