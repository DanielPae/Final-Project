import java.util.ArrayList;
import java.util.Scanner;
public class Blackjack{

    //Basic constructor
    public Blackjack(){

    }

    //clears everyones hands and gives out new cards
    public static void newRound(ArrayList<Hand> players, Deck deck){
	//uses remove from Hand and add to Hand
        for(int i = 0; i < players.size(); i++){
	    Hand p = players.get(i);
	    p.empty();
	    p.isntDone();
	    p.add(deck.dealCard());
	    p.add(deck.dealCard());
	}
	//redraws everything
    }

    //checks to see if all players have taken their turns
    public static boolean remaining(ArrayList<Hand> players, int lastPlayer){
	for(int i = lastPlayer; i < players.size(); i++){
	    if(!(players.get(i)).done()) return true;
	}return false;
    }

    public static void display(Player player, Dealer dealer){
	String clear = "";
	for(int i = 0; i < 100; i++){
	    clear = clear + " " + "\n";
	}
	System.out.println(clear);
	System.out.println("Dealers Hand: " + "\n \n" + dealer + "\n");
	System.out.println("Your Hand: " + "\n \n" + player);

    }

    public static void main(String args[]){
	//create all players and put them in a arraylist, for functions that need to be run on all players
	Scanner nameImput = new Scanner(System.in);
	System.out.println("What is your name");
	String name = nameImput.next();
       	Player player1 = new Player(name);
	Dealer dealer = new Dealer();
	Deck deck = new Deck();
	ArrayList<Hand> players = new ArrayList<Hand>();
	players.add(player1);
	players.add(dealer);
	//as long as the human wants to play, new rounds will start in this loop. 
	boolean playing = true;
	while(playing){
	    Boolean goodImput = true;
	    newRound(players,deck);
	    display(player1,dealer);
	    //currentPlayer is the human currently typing in commands
	    int currentPlayer = 0;
	    //loop for each players turn, hit until they bust or stay, then repeat for the next player
	    while(remaining(players,currentPlayer)){
		Player player = (Player)players.get(currentPlayer);
		String human = player.imput();
		if(human.equalsIgnoreCase("hit")){
			player.add(deck.dealCard());
			if(player.checkBust())	currentPlayer -= 1;
		    }
		else{
			player.isDone();
		    }
		display(player1,dealer);
		currentPlayer++;
	    }
	    while(dealer.total() < 16){
		dealer.add(deck.dealCard());
		display(player1,dealer);
	    }
	    boolean dealerBust = false;
	    if(dealer.total() > 21){
		dealerBust = true;
	    }
	    System.out.println("Dealers total: " + dealer.total());
	    System.out.println("\n Your total: " + (players.get(0)).total());
	    if(!((Player)(players.get(0))).bust()){
		System.out.println("You Lost");
	    }
	    else if(dealerBust){
		System.out.println("You Won");
	    }
	    else if(dealer.total() < (players.get(0)).total()){
		System.out.println("You Won");
	    }else{
		System.out.println("You Lost");
	    }
	    while(goodImput){
		Scanner again = new Scanner(System.in);
		System.out.println("Play again? (Yes/No)");
		String next = again.next();
		if(next.charAt(0) == 'N' || next.charAt(0) == 'n'){
		    playing = false;
		    goodImput = false;
		}
		else if(!(next.charAt(0) == 'Y' || next.charAt(0) == 'y')){
		    System.out.println("Please type yes or no");
		}
		else{
		    goodImput = false;
		}
	    }
	}
    }
}
