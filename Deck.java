import java.util.Random;
public class Deck{
    private Card[] deck;

    public Deck(){
	deck = new Card[52];
	fillDeck();
    }

    public void fillDeck(){
	int deck_spot = 0;
	for(int cNum = '1'; cNum < '1' + 9 ; cNum++){
	    for(int suit = 'a'; suit < 'e'; suit++){
		deck[deck_spot] = new Card((char)cNum,suit);
		deck_spot++;
	    }
	}
	for(int suit = 'a'; suit < 'e'; suit++){
	    deck[deck_spot] = new Card('j',suit);
	    deck_spot++;
	    deck[deck_spot] = new Card('q',suit);
	    deck_spot++;
	    deck[deck_spot] = new Card('k',suit);
	    deck_spot++;
	    deck[deck_spot] = new Card('a',suit);
	    deck_spot++;
	}
    }

    public void shuffle(){
	Random rand = new Random();
	for(int x = 0; x < 250; x++){
	    int  n = rand.nextInt(52);
	    int  m = rand.nextInt(52);
	    Card temp = deck[n];
	    deck[n] = deck[m];
	    deck[m] = temp;
	}
    }

    public Card dealCard(int cx, int cy){
        Card[] newD = new Card[deck.length - 1];
	for(int x = 0; x < newD.length; x++){
	    newD[x] = deck[x];
	}
	Card a = deck[deck.length - 1];
	deck = newD;
	a.setX(cx);
	a.sety(cy);
	return a;
    }

    public static void main(String[] args){
	Deck a = new Deck();
	a.shuffle();/*
	for(int x = 0; x < a.deck.length; x++){
	    System.out.println(a.deck[x]);
	    }*/
	System.out.println(a.dealCard());
	System.out.println(a.dealCard());
	System.out.println(a.dealCard());
	System.out.println(a.dealCard());
	System.out.println(a.dealCard());
		 
	
}

}
