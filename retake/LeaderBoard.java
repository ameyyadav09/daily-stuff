import java.util.*;


//type exit at the end of output

class LeaderBoard {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		Methods mj = new Methods();
		sc.nextLine();
		while(sc.hasNext()) {
			String pName = sc.nextLine();
			if (pName.equals("/* GAMES PLAYED */"))break;
			mj.addPlayers(pName);
		}

		while(sc.hasNext()) {
			String game = sc.nextLine();
			mj.addGame (game);
		}
		mj.declaringWinner();
		Players [] array = mj.sorting();
		for ( int i = 0; array[i] != null; i++) {
			System.out.println(array[i].toString());
		}
	}
}