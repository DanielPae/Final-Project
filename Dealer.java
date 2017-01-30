public class Dealer extends Hand{
    private int num_to_beat;

    public Dealer(){
	isDone();
    }

    public void isntDone(){
	isDone();
    }

    public String toString(){
	return "One face down card " + super.toString();
    }
    
}
