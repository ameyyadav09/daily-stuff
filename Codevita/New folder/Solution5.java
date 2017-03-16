import java.util.*;
import java.io.*;

class Team {
	public String name;
	public int goals_for;
	public int goals_aganist;
	public int points;

	public Team(String name) {
		this.name = name;
		this.goals_for = 0;
		this.goals_aganist = 0;
		this.points = 0;
	}

	public String toString() {
		return name;
	}
}

class Match {
	public String team1;
	public String team2;
	public int played;

	public Match(String team1, String team2) {
		this.team1 = team1;
		this.team2 = team2;
		played = 1;
	}

	public String toString() {
		return team1+" "+team2;
	}
}

public class Solution5 {

	public static Team [] sorter (Hashtable<String, Team> teams, int size) {

		Team [] array = new Team[size]; int index = 0;
		Set<String> keyset = teams.keySet();
		Iterator<String> it = keyset.iterator();

		while (it.hasNext()) {
			array[index++] = teams.get(it.next());
		}
		
		for ( int i = 0; i < array.length-1; i++) {
			int min = i;
			for ( int j = i+1; j < array.length; j++) {
				Team temp1 = array[min];
				Team temp2 = array[j];
				if ( temp1.points < temp2.points) {
					min = j;
				}
				else if (temp1.points == temp2.points) {
					int team1_gd = temp1.goals_for - temp1.goals_aganist;
					int team2_gd = temp2.goals_for - temp2.goals_aganist;

					if (team1_gd < team2_gd) {
						min = j;
					}
					else if(team1_gd == team2_gd) {
						if (temp1.goals_for < temp2.goals_for) {
							min = j;
						}
						else if(temp1.goals_for == temp2.goals_for) {
							if (temp1.name.compareTo(temp2.name) > 0) {
								min = j;
							}
						}
					}
				}
			}
			if (min != i) {
				Team temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
		return array;
	}


	public static void main(String...args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Hashtable<String, Team> teams = new Hashtable<String, Team>();
		Hashtable<Match, Integer> matches = new Hashtable<Match, Integer>();
		while(st.hasMoreTokens()) {
			String str = st.nextToken();
			Team obj = new Team(str);
			teams.put(str, obj);
		}
		int k = Integer.parseInt(br.readLine());
		while (k!=0) {
			st = new StringTokenizer(br.readLine());
			String team1 = st.nextToken();
			String team2 = st.nextToken();
			int team1_goals = Integer.parseInt(st.nextToken());
			int team2_goals = Integer.parseInt(st.nextToken());
			if (team1.equals(team2)) {
				System.out.println("Invalid Input");
				System.exit(0);
			}
			else {
				Match obj = new Match(team1, team2);
				if (matches.containsKey(obj)) {
					if (matches.get(obj) > 2) {
						System.out.println("Invalid Input");
						System.exit(0);
					}
					else {
						matches.put(obj, matches.get(obj)+1);
					}
				}
				else {
					matches.put(obj,1);
				}
				Team temp1 = teams.get(team1);
				Team temp2 = teams.get(team2);

				if(team1_goals > team2_goals) {

					temp1.goals_for += team1_goals;
					temp1.goals_aganist += team2_goals;
					temp1.points += 2;

					temp2.goals_aganist += team1_goals;
					temp2.goals_for += team2_goals;

				}
				else if( team2_goals > team1_goals) {
					temp2.goals_for += team2_goals;
					temp2.goals_aganist += team1_goals;
					temp2.points += 2;

					temp1.goals_aganist += team2_goals;
					temp1.goals_for += team1_goals;
				}
				else {
					temp1.goals_for += team1_goals;
					temp1.goals_aganist += team2_goals;
					temp1.points += 1;

					temp2.goals_for += team2_goals;
					temp2.goals_aganist += team1_goals;
					temp2.points += 1;
				}
			}
			k--;
		}
		Team [] list = Solution5.sorter(teams, teams.size());
		for(Team obj: list) {
			System.out.println(obj);
		}
	}
}