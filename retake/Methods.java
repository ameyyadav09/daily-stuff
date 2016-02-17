import java.util.*;

class Methods {
	Players [] players;
	Games [] games;
	int pcount;
	int gcount;


	Methods () {
		pcount = 0;
		gcount = 0;
		players = new Players[2];
		games = new Games[2];
	}

	private void growPlayers() {
		Players [] temp = new Players[pcount*2];
		for ( int i = 0; i < pcount; i++) {
			temp[i] = players[i];
		}
		players = temp;
	}

	private void growGames() {
		Games [] temp = new Games[gcount*2];
		for ( int i = 0; i < gcount; i++) {
			temp[i] = games[i];
		}
		games = temp;
	}

	public void addPlayers(String  pName) {
		Players obj = new Players(pName);
		if (pcount >= players.length)growPlayers();
		players[pcount] = obj;
		pcount++;
	}

	public void addGame(String game) {
		StringTokenizer st = new StringTokenizer(game," ");
		int gid = -1;
		String p1 = "";
		String p2 = "";
		int winner = -1;
		int points = 0;
		while(st.hasMoreTokens()) {
			String gameid = st.nextToken();
			gid = Integer.parseInt(gameid.substring(1,gameid.length()));
			p1 = st.nextToken();
			p2 = st.nextToken();
			if (p1.charAt(p1.length()-1) == '*') {
				winner = 1;
			}
			else if (p2.charAt(p2.length()-1) == '*') {
				winner = 2;
			}
			else {
				winner = 0;
			}
			points = Integer.parseInt(st.nextToken());
		}
		Games obj = new Games(gid,p1,p2,winner,points);
		if (gcount >= games.length)growGames();
		games[gcount] = obj;
		gcount++;
	}

	public void declaringWinner() {
		for ( int i = 0; games[i] != null; i++) {
			Games obj = games[i];
			String pName = "";
			String draw = "";
			if (obj.winner == 1 ) {
				pName = obj.player1;
				addpoints(pName.substring(0,pName.length()-1), draw, obj.gamePoints);

			}
			else if (obj.winner == 2) {
				pName = obj.player2;
				addpoints(pName.substring(0,pName.length()-1), draw, obj.gamePoints);
			}
			else {
				pName = obj.player1;
				draw = obj.player2;
				addpoints(pName.substring(0,pName.length()), draw.substring(0,draw.length()), obj.gamePoints);
			}
		}
	}
	private void addpoints(String pName, String draw, int pts) {
		if (draw.length()==0) {
			for (int i = 0; players[i] != null ; i++) {
				Players obj = players[i];
				if((obj.pname).equals(pName)) {
					obj.points += pts;
				}
			}
		}
		else {
			for (int i = 0; players[i] != null; i++) {
				Players obj = players[i];
				if((obj.pname).equals(pName)) {
					obj.points += pts/2;
					break;
				}
			}
			for (int i = 0; players[i] != null; i++) {
				Players obj = players[i];
				if((obj.pname).equals(draw)) {
					obj.points += pts/2;
					break;
				}
			}
		}
	}

	public Players[] sorting() {
		for(int i = 0 ; players[i] != null; i++) {
			int min = i;
			for(int j = i + 1; players[j] != null ; j++) {
				if(players[min].points < players[j].points) {
					min = j;
				}
				else if (players[min].points == players[j].points) {
					if ((players[min].pname).compareTo(players[j].pname) > 0) {
						min = j;
					}
				}
			}
			if ( min != i) {
				Players obj = players[min];
				players[min]=players[i];
				players[i]=obj;
			}
		}
		return players;
	}
}