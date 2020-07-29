public class CP_CPU extends CP_main {
	public static void Player1Turn(){
		for (int i = 0; i < CPU1.size(); i++) {
			if (pile.get(0).charAt(0) == '9') {
				if (CPU1.get(i).charAt(0) == '1') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == 'J') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == 'Q') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 1 Passes\n");
					pass = 1;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == '1') {
				if (CPU1.get(i).charAt(0) == 'J') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == 'Q') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 1 Passes\n");
					pass = 1;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'J') {
				if (CPU1.get(i).charAt(0) == 'Q') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 1 Passes\n");
					pass = 1;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'Q') {
				if (CPU1.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 1 Passes\n");
					pass = 1;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'K') {
				if (CPU1.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else if (CPU1.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 2 Passes\n");
					pass = 1;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'A') {
				if (CPU1.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 1 Passes\n");
					pass = 1;
					break;
				}
			}
			else if (CPU1.get(i).charAt(0) > pile.get(0).charAt(0)) {
				pile.clear();
				pile.add(CPU1.get(i));
				CPU1.remove(i);
				break;
			}
			else if (pile.get(0).charAt(0) == '2' && pile.get(0).charAt(3) == 'D') {
				if (CPU1.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;					
				}
			}
			else if (pile.get(0).charAt(0) == '2' && pile.get(0).charAt(3) == 'C') {
				if ((CPU1.get(i).charAt(0) == '2' && CPU1.get(i).charAt(3) == 'H') || (CPU1.get(i).charAt(0) == '2' && CPU1.get(i).charAt(3) == 'S')) {
					pile.clear();
					pile.add(CPU1.get(i));
					CPU1.remove(i);
					break;					
				}
			}
			else if (CPU1.get(i).charAt(0) == '2' && CPU1.get(i).charAt(3) == 'S') {
				System.out.print("\nPlayer 1 Passes\n");
				pass = 1;
				break;
			}
		}
		
		turn = 2;
	}
	public static void Player2Turn(){
		for (int i = 0; i < CPU2.size(); i++) {
			if (pile.get(0).charAt(0) == '9') {
				if (CPU2.get(i).charAt(0) == '1') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == 'J') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == 'Q') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 2 Passes\n");
					pass = 2;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == '1') {
				if (CPU2.get(i).charAt(0) == 'J') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == 'Q') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 2 Passes\n");
					pass = 2;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'J') {
				if (CPU2.get(i).charAt(0) == 'Q') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 2 Passes\n");
					pass = 2;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'Q') {
				if (CPU2.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 2 Passes\n");
					pass = 2;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'K') {
				if (CPU2.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else if (CPU2.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 2 Passes\n");
					pass = 2;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'A') {
				if (CPU2.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 2 Passes\n");
					pass = 2;
					break;
				}
			}
			else if (CPU2.get(i).charAt(0) > pile.get(0).charAt(0)) {
				pile.clear();
				pile.add(CPU2.get(i));
				CPU2.remove(i);
				break;
			}
			else if (pile.get(0).charAt(0) == '2' && pile.get(0).charAt(3) == 'D') {
				if (CPU2.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;					
				}
			}
			else if (pile.get(0).charAt(0) == '2' && pile.get(0).charAt(3) == 'C') {
				if ((CPU2.get(i).charAt(0) == '2' && CPU2.get(i).charAt(3) == 'H') || (CPU2.get(i).charAt(0) == '2' && CPU2.get(i).charAt(3) == 'S')) {
					pile.clear();
					pile.add(CPU2.get(i));
					CPU2.remove(i);
					break;					
				}
			}
			else if (CPU2.get(i).charAt(0) == '2' && CPU2.get(i).charAt(3) == 'S') {
				System.out.print("\nPlayer 2 Passes\n");
				pass = 2;
				break;
			}
		}

		turn = 3;
	}
	public static void Player3Turn(){
		for (int i = 0; i < CPU3.size(); i++) {
			if (pile.get(0).charAt(0) == '9') {
				if (CPU3.get(i).charAt(0) == '1') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == 'J') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == 'Q') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 3 Passes\n");
					pass = 3;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == '1') {
				if (CPU3.get(i).charAt(0) == 'J') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == 'Q') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 3 Passes\n");
					pass = 3;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'J') {
				if (CPU3.get(i).charAt(0) == 'Q') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 3 Passes\n");
					pass = 3;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'Q') {
				if (CPU3.get(i).charAt(0) == 'K') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 3 Passes\n");
					pass = 3;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'K') {
				if (CPU3.get(i).charAt(0) == 'A') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else if (CPU3.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 3 Passes\n");
					pass = 3;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == 'A') {
				if (CPU3.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;
				}
				else {
					System.out.print("\nPlayer 3 Passes\n");
					pass = 3;
					break;
				}
			}
			else if (pile.get(0).charAt(0) == '2' && pile.get(0).charAt(3) == 'D') {
				if (CPU3.get(i).charAt(0) == '2') {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;					
				}
			}
			else if (pile.get(0).charAt(0) == '2' && pile.get(0).charAt(3) == 'C') {
				if ((CPU3.get(i).charAt(0) == '2' && CPU3.get(i).charAt(3) == 'H') || (CPU3.get(i).charAt(0) == '2' && CPU3.get(i).charAt(3) == 'S')) {
					pile.clear();
					pile.add(CPU3.get(i));
					CPU3.remove(i);
					break;					
				}
			}
			else if (CPU3.get(i).charAt(0) == '2' && CPU3.get(i).charAt(3) == 'S') {
				System.out.print("\nPlayer 3 Passes\n");
				pass = 3;
				break;
			}
			else if (CPU3.get(i).charAt(0) > pile.get(0).charAt(0)) {
				pile.clear();
				pile.add(CPU3.get(i));
				CPU3.remove(i);
				break;
			}
		}

		turn = 0;
	}
}