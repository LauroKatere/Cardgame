package Players;

import java.util.LinkedList;

public class Playerlist {
	
	LinkedList<Player> round = new LinkedList<Player>();
	int activePlayer;
	
	public Playerlist() {
		
	}
	
	public boolean addPlayer(Player p) {
		return round.add(p);
	}
	
	public void removePlayer(int index) {
		round.remove(index);
	}
	
	public void activecount() {
		if(activePlayer<round.size()) {
			activePlayer++;
		}
		else if (activePlayer==round.size()) {
		activePlayer = 0;
		}
		else {
			activePlayer = 0;
		}
		}
	}

