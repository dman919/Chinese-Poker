import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class CP_main {
	protected static ArrayList<String> hand = new ArrayList<>();
	protected static ArrayList<String> CPU1 = new ArrayList<>();
	protected static ArrayList<String> CPU2 = new ArrayList<>();
	protected static ArrayList<String> CPU3 = new ArrayList<>();
	protected static ArrayList<String> pile = new ArrayList<>();
	protected static int turn;
	protected static int pass;
	protected static ArrayList<String> straight = new ArrayList<>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Chinese Poker");
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		
		CP_sort sort = new CP_sort();		
		
		playerCards();
		System.out.println("\nYour hand is: \n" + hand);
		System.out.print("\nWould you like to arrange your cards? Y/N: ");
		char a = input.next().charAt(0);
		if (a == 'Y' || a == 'y') {
			System.out.println("\nWhen you want to start the game enter '0'");
			int x = 1, y = 1;
			while (x != 0 || y != 0) {
				System.out.print("Enter the location of the card you want to move (1-13): ");
				x = input.nextInt();
				if (x == 0) {
					break;
				}
				System.out.print("Enter the location of where you want it to go (1-13): ");
				y = input.nextInt();
				if (y == 0) {
					break;
				}
				System.out.println("\n" + sort.PlayerSort(x, y) + "\n");
			}
		}
		
		sort.CPUsort();

		System.out.println("\nGame starts now!\n");
		Start(name);
		while (!Win() || !Lose()) {
			if (Win()) {
				System.out.print("You win!");
				break;
			}
			if (Lose()) {
				System.out.print("You lost :(");
				break;
			}

			if (turn == 0) {
				System.out.println("\nYour hand is: " + hand);
				System.out.println("\nIf you would like to play a combo, enter 14");
				System.out.print("What would you like to place? (Enter a digit location) / If you want to pass enter 0: ");
				int pick = input.nextInt();
				PlayerTurn(pick);
				System.out.println("\n" + name + " placed: " + pile);
			}
			
			if (turn == 1) {
				CP_CPU.Player1Turn();
				if (pass == 1) {
					pass = 0;
					continue;
				}
				else {
					System.out.println("\nPlayer1 placed: " + pile);
				}
			}

			if (turn == 2) {
				CP_CPU.Player2Turn();
				if (pass == 2) {
					pass = 0;
					continue;
				}
				else {
					System.out.println("\nPlayer2 placed: " + pile);
				}
			}
			
			if (turn == 3) {
				CP_CPU.Player3Turn();
				if (pass == 3) {
					pass = 0;
					continue;
				}
				else {
					System.out.println("\nPlayer3 placed: " + pile);
				}
			}
		}
	}
	
	public static void playerCards() {
		String[] deck = {"Ace (Diamond)", "Ace (Clover)", "Ace (Heart)", "Ace (Spade)",
							"2 (Diamond)", "2 (Clover)", "2 (Heart)", "2 (Spade)",
							"3 (Diamond)", "3 (Clover)", "3 (Heart)", "3 (Spade)",
							"4 (Diamond)", "4 (Clover)", "4 (Heart)", "4 (Spade)",
							"5 (Diamond)", "5 (Clover)", "5 (Heart)", "5 (Spade)",
							"6 (Diamond)", "6 (Clover)", "6 (Heart)", "6 (Spade)",
							"7 (Diamond)", "7 (Clover)", "7 (Heart)", "7 (Spade)",
							"8 (Diamond)", "8 (Clover)", "8 (Heart)", "8 (Spade)",
							"9 (Diamond)", "9 (Clover)", "9 (Heart)", "9 (Spade)",
							"10 (Diamond)", "10 (Clover)", "10 (Heart)", "10 (Spade)",
							"Jack (Diamond)", "Jack (Clover)", "Jack (Heart)", "Jack (Spade)",
							"Queen (Diamond)", "Queen (Clover)", "Queen (Heart)", "Queen (Spade)",
							"King (Diamond)", "King (Clover)", "King (Heart)", "King (Spade)"};
		ArrayList<String> shuffle = new ArrayList<>(Arrays.asList(deck));
		java.util.Collections.shuffle(shuffle);
		
		for (int i = 0; i < 13; i++) {
			hand.add(shuffle.get(i));
		}
		
		for (int i = 13; i < 26; i++) {
			CPU1.add(shuffle.get(i));
		}
		for (int i = 26; i < 39; i++) {
			CPU2.add(shuffle.get(i));
		}
		for (int i = 39; i < 52; i++) {
			CPU3.add(shuffle.get(i));
		}
		
	}
		
	public static boolean Win() {
		if (hand.size() == 0) {
			return true;
		}
		return false;
	}
	public static boolean Lose() {
		if (CPU1.size() == 0 || CPU2.size() == 0 || CPU3.size() == 0) {
			return true;
		}
		return false;
	}
	
	public static void Start(String name) {
		for (int i = 0; i < hand.size(); i++) {
			if (hand.get(i).charAt(0) == '3' && hand.get(i).charAt(3) == 'D') {
				System.out.print(name + " starts\n");
				turn = 0;
			}
		}
		
		for (int i = 0; i < CPU1.size(); i++) {
			if (CPU1.get(i).charAt(0) == '3' && CPU1.get(i).charAt(3) == 'D') {
				turn = 2;
				System.out.println("Player1 starts");
				pile.add(CPU1.get(i));
				CPU1.remove(i);
				System.out.println("\nPlayer1 placed: " + pile);
			}
		}
		for (int i = 1; i < CPU2.size(); i++) {
			if (CPU2.get(i).charAt(0) == '3' && CPU2.get(i).charAt(3) == 'D') {
				turn = 3;
				System.out.println("Player2 starts");
				pile.add(CPU2.get(i));
				CPU2.remove(i);
				System.out.println("\nPlayer2 placed: " + pile);
			}
		}
		for (int i = 1; i < CPU3.size(); i++) {
			if (CPU3.get(i).charAt(0) == '3' && CPU3.get(i).charAt(3) == 'D') {
				turn = 0;
				System.out.println("Player3 starts");
				pile.add(CPU3.get(i));
				CPU3.remove(i);
				System.out.println("\nPlayer3 placed: " + pile);
			}
		}
	}
	
	public static void PlayerTurn(int pick){
		Scanner input = new Scanner(System.in);
		
		if (pick == 0) {
			turn = 1;
		}
		
		if (pick == 14) {
			CP_moves s = new CP_moves();
			do {
				System.out.println("Enter S for straight");
				System.out.println("Enter F for flush");
				System.out.println("Enter H for Full House");
				char combo = input.next().charAt(0);
				if (combo == 'S') {
					System.out.print("\nEnter the five cards (digit location) in order for the straight: ");
					int combo1 = input.nextInt();
					int combo2 = input.nextInt();
					int combo3 = input.nextInt();
					int combo4 = input.nextInt();
					int combo5 = input.nextInt();
					s = new CP_moves(hand, combo1 - 1, combo2 - 1, combo3 - 1, combo4 - 1, combo5 - 1, pile);
					
					if (s.straight()) {
						pile.clear();
						pile = straight;
						turn = 1;
						break;
					}
					else {
						System.out.println("That is not a straight");
						System.out.print("Would you like to enter another 5 cards? Y/N");
						char a = input.next().charAt(0);
						if (a == 'Y' || a == 'y') {
							continue;
						}
						else {
							turn = 0;
							break;
						}
					}
				}
			}
			while (!s.straight());
		}

		if (pick >= 1 && pick <= 13){
			pile.clear();
			pile.add(hand.get(pick - 1));
			hand.remove(pick - 1);
			turn = 1;
		}
	}
}