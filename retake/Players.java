import java.util.*;

class Players {
	String pname;
	int points;
	

	Players(String pname) {
		this.pname = pname;
		this.points = 0;
	}

	public String toString() {
		return pname + " - " + points;
	}
}