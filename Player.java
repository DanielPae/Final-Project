import java.util.Scanner;
public class Player extends Hand{

    private String name;

    public Player(String n){
	name = n;
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

    public static void main(String[] args){
        Player a = new Player("asd");
	a.imput();
    }
}
