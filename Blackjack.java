public class Blackjack{
    public int playerTurn;

    //Basic constructor
    public Blackjack(){
	playerTurn = 1;
    }

    //gives a card to the player who's turn it currently is
    public void giveCard(){
	//uses deal from Deck and add from Hand, along with playerTurn
    }

    //creates players and gives them each starting hands
    public void startUp(){
	//uses a scanner to get imput on the number of players
	//creates that number of players puls a dealer
	//gives each new player a starting hand
    }

    //clears everyones hands and gives out new cards
    public void newRound(){
	//uses remove from Hand and add to Hand
	//redraws everything
    }
}
