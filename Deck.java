import java.util.Random;
public class Deck{
    private Card[] deck;

    public Deck(){
	deck = new Card[52];
	fillDeck();
    }

    public void fillDeck(){
	deck = new Card[52];
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
	shuffle();
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

    public Card dealCard(){
        Card[] newD = new Card[deck.length - 1];
	for(int x = 0; x < newD.length; x++){
	    newD[x] = deck[x];
	}
	Card a = deck[deck.length - 1];
	deck = newD;
	if(deck.length == 1) fillDeck();
	return a;
    }

    public static void main(String[] args){
	Deck a = new Deck();
	a.shuffle();
	for(int i = 0; i < 52; i++){
	    System.out.println(a.dealCard());
	}
	
	a.fillDeck();
	
}

}
