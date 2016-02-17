class Games {
	int gid;
	String player1;
	String player2;
	int winner;
	int gamePoints;

	Games() {
		
	}

	Games (int gid, String player1, String player2, int winner, int gamePoints) {
		this.gid = gid;
		this.player1 = player1;
		this.player2 = player2;
		this.winner = winner;
		this.gamePoints = gamePoints;
	}
}