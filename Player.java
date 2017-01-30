import java.util.Scanner;
public class Player extends Hand{

    private String name;
    private int money;
    private boolean notBust;

    public Player(String n){
	name = n;
	money = 100;
	notBust = true;
    }

    
    public void empty(){
	super.empty();
	notBust = true;
    }
    
    public String imput(){
     Scanner sc = new Scanner(System.in);
     System.out.println(name + ", hit or stay?");
     String answer = sc.next();
     if (!answer.equalsIgnoreCase("hit") && !answer.equalsIgnoreCase("stay")){
	 System.out.println("Please type hit or stay");
	 this.imput();
     }
     return answer;
    }

    public boolean checkBust(){
	if(this.total() > 21){
	    notBust = false;
	    isDone();
	    System.out.println("Bust");
	}return notBust;
    }

    public boolean bust(){
	return notBust;
    }

    public String toString(){
	return this.get(0) + super.toString() + "\n";
    }

    public static void main(String[] args){
        
    }
}
