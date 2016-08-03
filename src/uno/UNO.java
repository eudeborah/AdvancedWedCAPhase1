
package uno;

import java.util.ArrayList;


public class UNO {

   static public Game playGame(){
        
        Deck d = new Deck();
        d.createNewDeck();
        String id="deb123";
        ArrayList<Deck> deck = new ArrayList<Deck>();
        ArrayList<Player>players=new ArrayList<Player>();
        players.add(new Player("Janet","Janet"));
        players.add(new Player("Alice","Alice"));
        players.add(new Player("Aaron","Aaron"));
        players.add(new Player("Brandon","Bradon"));
        players.add(new Player("Cat","Cat"));
        
        System.out.println("Ready!!");
        return new Game(id,players,"Started",d.getCards(),d.takeCard());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       Game newGame = playGame();
       
       for(Player p : newGame.getPlayers()){
           for(int i = 0; i < 7 ; i++){
               p.addCard(newGame.takeCardFromDeck());
           }
       }
       
       System.out.println("run:");
       System.out.println("Id: "+newGame.getId());
       System.out.println("Discard card: "+newGame.getDiscardPile());
       System.out.println("Cards on Deck: "+newGame.getDeckCard().size());
       
        for(Player p : newGame.getPlayers()){
            System.out.println("Player: "+p);
            System.out.println("Card in hands");
            for(Card c : p.getHand()){
                System.out.println("Card: "+ c);
            }
        }
               
        
    }
    
}
