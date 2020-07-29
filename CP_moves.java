import java.util.ArrayList;

public class CP_moves extends CP_main {
	protected static int combo1;
	protected static int combo2;
	protected static int combo3;
	protected static int combo4;
	protected static int combo5;
	
	public CP_moves() {
		combo1 = 0;
		combo2 = 1;
		combo2 = 2;
		combo2 = 3;
		combo2 = 4;
	}
	
	public CP_moves(ArrayList<String> hand, int combo1, int combo2, int combo3, int combo4, int combo5, ArrayList<String> pile) {
		this.hand = hand;
		this.combo1 = combo1;
		this.combo2 = combo2;
		this.combo3 = combo3;
		this.combo4 = combo4;
		this.combo5 = combo5;
		this.pile = pile;
	}
	
	public ArrayList<String> getHand(){
		return this.hand;
	}
		
	public int getCombo1() {
		return this.combo1;
	}
	
	public int getCombo2() {
		return this.combo2;
	}
	
	public int getCombo3() {
		return this.combo3;
	}
	
	public int getCombo4() {
		return this.combo4;
	}
	
	public int getCombo5() {
		return this.combo5;
	}
	
	public ArrayList<String> getPile(){
		return this.pile;
	}
	
	public static boolean straight() {
		if (StraightRoyal()) {
			return true;
		}
		else if (StraightDigits()) {
			return true;
		}
		else if (StraightNine()) {
			return true;
		}
		else if (StraightTen()) {
			return true;
		}
		else if (StraightRoyal()) {
			return true;
		}
		return false;
	}
	
	public static boolean StraightDigits() {
		straight.clear();
		
		if (hand.get(combo1).charAt(0) + 1 == hand.get(combo2).charAt(0)) {
			straight.add(hand.get(combo1));
		}
		else {
			return false;
		}
		if (hand.get(combo2).charAt(0) + 1 == hand.get(combo3).charAt(0)) {
			straight.add(hand.get(combo2));
		}
		else {
			return false;
		}
		if (hand.get(combo3).charAt(0) + 1 == hand.get(combo4).charAt(0)) {
			straight.add(hand.get(combo3));
		}
		else {
			return false;
		}
		if (hand.get(combo4).charAt(0) + 1 == hand.get(combo5).charAt(0)) {
			straight.add(hand.get(combo4));
			straight.add(hand.get(combo5));
		}
		
		return true;
	}
	
	public static boolean StraightSix() {
		straight.clear();
		if (hand.get(combo1).charAt(0) == 6 && hand.get(combo1).charAt(0) == 7 && hand.get(combo4).charAt(0) == 8 && hand.get(combo5).charAt(0) == 9 && hand.get(combo5).charAt(0) == 1) {
			straight.add(hand.get(combo1));
			straight.add(hand.get(combo2));
			straight.add(hand.get(combo3));
			straight.add(hand.get(combo4));
			straight.add(hand.get(combo5));
			return true;
		}

		else {
			return false;
		}
	}
	
	public static boolean StraightSeven() {
		straight.clear();
		if (hand.get(combo1).charAt(0) == 7 && hand.get(combo1).charAt(0) == 8 && hand.get(combo4).charAt(0) == 9 && hand.get(combo5).charAt(0) == 1 && hand.get(combo5).charAt(0) == 'J') {
			straight.add(hand.get(combo1));
			straight.add(hand.get(combo2));
			straight.add(hand.get(combo3));
			straight.add(hand.get(combo4));
			straight.add(hand.get(combo5));
			return true;
		}

		else {
			return false;
		}
	}
	
	public static boolean StraightEight() {
		straight.clear();
		if (hand.get(combo1).charAt(0) == 8 && hand.get(combo1).charAt(0) == 9 && hand.get(combo4).charAt(0) == 1 && hand.get(combo5).charAt(0) == 'J' && hand.get(combo5).charAt(0) == 'Q') {
			straight.add(hand.get(combo1));
			straight.add(hand.get(combo2));
			straight.add(hand.get(combo3));
			straight.add(hand.get(combo4));
			straight.add(hand.get(combo5));
			return true;
		}

		else {
			return false;
		}
	}
	
	public static boolean StraightNine() {
		straight.clear();
		if (hand.get(combo1).charAt(0) == 9 && hand.get(combo1).charAt(0) == 1 && hand.get(combo4).charAt(0) == 'J' && hand.get(combo5).charAt(0) == 'Q' && hand.get(combo5).charAt(0) == 'K') {
			straight.add(hand.get(combo1));
			straight.add(hand.get(combo2));
			straight.add(hand.get(combo3));
			straight.add(hand.get(combo4));
			straight.add(hand.get(combo5));
			return true;
		}

		else {
			return false;
		}
	}

	public static boolean StraightTen() {
		straight.clear();
		if (hand.get(combo1).charAt(0) == 1 && hand.get(combo1).charAt(0) == 'J' && hand.get(combo4).charAt(0) == 'Q' && hand.get(combo5).charAt(0) == 'K' && hand.get(combo5).charAt(0) == 'A') {
			straight.add(hand.get(combo1));
			straight.add(hand.get(combo2));
			straight.add(hand.get(combo3));
			straight.add(hand.get(combo4));
			straight.add(hand.get(combo5));
			return true;
		}

		else {
			return false;
		}
	}	
	
	public static boolean StraightRoyal() {
		straight.clear();
		if (hand.get(combo1).charAt(0) == 'J' && hand.get(combo1).charAt(0) == 'Q' && hand.get(combo4).charAt(0) == 'K' && hand.get(combo5).charAt(0) == 'A' && hand.get(combo5).charAt(0) == 2) {
			straight.add(hand.get(combo1));
			straight.add(hand.get(combo2));
			straight.add(hand.get(combo3));
			straight.add(hand.get(combo4));
			straight.add(hand.get(combo5));
			return true;
		}

		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> hand = new ArrayList<>();
		hand.add("1");
		hand.add("2");
		hand.add("3");
		hand.add("4");
		hand.add("5");
		
		ArrayList<String> pile = new ArrayList<>();
		
		CP_moves test = new CP_moves(hand, 0, 1, 2, 3, 4, pile);
		
		if (test.straight()) {
			System.out.print(straight);
		}
		else {
			System.out.print("That is not a straight");
		}
	}
}