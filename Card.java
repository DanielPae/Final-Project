public class Card{
    private int card_val, x_position, y_position;
    private char suit, card_face;
    private String color;
    

    //construcor just for card number and suit(including face cards)
    public Card(char cNum, int cVal, char soot){
	card_face = cNum;
	card_val = cVal;
	suit = soot;
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

    public char getF(){
	return card_face;
    }

    public String getColor(){
	return color;
    }

    
    
}
