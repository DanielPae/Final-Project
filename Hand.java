import java.util.ArrayList;
public class Hand{
    private ArrayList<Card> currentHand;
    private boolean done;
    
    //basic constructor
    public Hand(){
	currentHand = new ArrayList<Card>();
	done = false;
    }

    //adds card to this hand
    public void add(Card card){
        currentHand.add(card);
    }

    public boolean done(){
	return done;
    }

    public Card get(int index){
	return currentHand.get(index);
    }

    public void isDone(){
	done = true;
    }
    public void isntDone(){
	done = false;
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

    public String toString(){
	String ans = "";
	for(int i = 1; i < currentHand.size(); i++){
	    ans = ans + "\n \n" + currentHand.get(i);
	}return ans;
    }
}
