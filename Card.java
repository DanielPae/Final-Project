public class Card{
    private int card_val, x_position, y_position;
    private char suit;
    private String color, card_face;
    

    //construcor just for card number and suit(including face cards)
    public Card(char cNum, int soot){
	card_face = cNum + "";
	suit = (char)soot;
	card_val = cNum - '0';
        if(cNum == 'k'){
	    card_val = 10;
	    card_face = "King";
	}
	if(cNum == 'q'){
	    card_val = 10;
	    card_face = "Queen";
	}
	if(cNum == 'j'){
	    card_val = 10;
	    card_face = "Jack";
	}
	if(cNum == 'a' || cNum == 1){
	    card_val = 11;
	    card_face = "Ace";
	}
	if (suit == 'a') suit = 's';
	if (suit == 'b') suit = 'h';
	if (card_face == "1" || card_val == 1){
	    card_face = "Ace";
	    card_val = 11;
	}
    } 

    //basic getters and setters
    public void setX(int x){
	x_position = x;
    }

    public void setY(int y){
	y_position = y;
    }

    public int getX(){
	return x_position;
    }

    public int getY(){
	return y_position;
    }

    public char getSuit(){
	return suit;
    }

    public int getVal(){
	return card_val;
    }

    public String getF(){
	return card_face;
    }

    public String getColor(){
	return color;
    }

    //toString for now, change to display the card later
    public String toString(){
	String pSuit = "";
	if(suit == 's') pSuit = "Spades";
	if(suit == 'h') pSuit = "Heart";
	if(suit == 'c') pSuit = "Clubs";
	if(suit == 'd') pSuit = "diamonds";
	return card_face + " of " + pSuit;
    }

    
    
}
