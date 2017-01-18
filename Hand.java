import java.util.ArrayList;
public class Hand{
    private ArrayList<Card> currentHand;
    
    //basic constructor
    public Hand(){
	currentHand = new ArrayList<Card>();
    }

    //adds card to this hand
    public void add(Card card){
        currentHand.add(card);
    }

    public int total(){
	int total = 0;
	for(int i = 0; i < currentHand.size(); i++){
	    total = total + (currentHand.get(i)).getVal();
	}return total;
    }

    public void empty(){
	currentHand.clear();
    }
}
