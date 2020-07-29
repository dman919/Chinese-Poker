import java.util.ArrayList;

public class CP_sort extends CP_main {	
	public CP_sort() {
	}

	public CP_sort(ArrayList<String> hand, ArrayList<String> CPU1, ArrayList<String> CPU2, ArrayList<String> CPU3) {
		this.hand = hand;
		this.CPU1 = CPU1;
		this.CPU2 = CPU2;
		this.CPU3 = CPU3;
	}
	
	public ArrayList<String> getHand() {
		return this.hand;
	}
	
	public ArrayList<String> getCPU1() {
		return this.CPU1;
	}
	
	public ArrayList<String> getCPU2() {
		return this.CPU2;
	}
	
	public ArrayList<String> getCPU3() {
		return this.CPU3;
	}
	

	public ArrayList<String> PlayerSort(int x, int y){
		String temp;
		x = x - 1;
		y = y - 1;
		
		temp = this.hand.get(x);
		this.hand.remove(x);
		this.hand.add(y, temp);
				
		return this.hand;
	}
	
	public static void CPUsort() {
		String temp;
		for (int i = 0; i < CPU1.size(); i++) {
			for (int j = 0; j < CPU1.size() - 1; j++) {
				if (CPU1.get(j).charAt(0) > CPU1.get(j + 1).charAt(0)) {
					temp = CPU1.get(j);
					CPU1.remove(j);
					CPU1.add(j + 1, temp);
				}
			}
		}
		for (int i = 0; i < CPU2.size(); i++) {
			for (int j = 0; j < CPU2.size() - 1; j++) {
				if (CPU2.get(j).charAt(0) > CPU2.get(j + 1).charAt(0)) {
					temp = CPU2.get(j);
					CPU2.remove(j);
					CPU2.add(j + 1, temp);
				}
			}
		}
		for (int i = 0; i < CPU3.size(); i++) {
			for (int j = 0; j < CPU3.size() - 1; j++) {
				if (CPU3.get(j).charAt(0) > CPU3.get(j + 1).charAt(0)) {
					temp = CPU3.get(j);
					CPU3.remove(j);
					CPU3.add(j + 1, temp);
				}
			}
		}
	
		for (int i = 0; i < CPU1.size(); i++) {
			if (CPU1.get(i).charAt(0) == '1') {
				temp = CPU1.get(i);
				CPU1.remove(i);
				CPU1.add(temp);
			}
		}
		for (int i = 0; i < CPU1.size(); i++) {
			if (CPU1.get(i).charAt(0) == 'J') {
				temp = CPU1.get(i);
				CPU1.remove(i);
				CPU1.add(temp);
			}
		}
		for (int i = 0; i < CPU1.size(); i++) {
			if (CPU1.get(i).charAt(0) == 'Q') {
				temp = CPU1.get(i);
				CPU1.remove(i);
				CPU1.add(temp);
			}
		}
		for (int i = 0; i < CPU1.size(); i++) {
			if (CPU1.get(i).charAt(0) == 'K') {
				temp = CPU1.get(i);
				CPU1.remove(i);
				CPU1.add(temp);
			}
		}
		for (int i = 0; i < CPU1.size(); i++) {
			if (CPU1.get(i).charAt(0) == 'A') {
				temp = CPU1.get(i);
				CPU1.remove(i);
				CPU1.add(temp);
			}
		}
		for (int i = 0; i < CPU1.size(); i++) {
			if (CPU1.get(i).charAt(0) == '2') {
				temp = CPU1.get(i);
				CPU1.remove(i);
				CPU1.add(temp);
			}
		}
	}
}
