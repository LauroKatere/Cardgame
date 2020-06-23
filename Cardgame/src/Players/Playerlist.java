package Players;

import java.util.LinkedList;

public class Playerlist {
	
	LinkedList<Player> round = new LinkedList<Player>();
	int activePlayer = 0;
	
	public Playerlist() {
		
	}
	
	public Player getLast() {
		return round.getLast();
	}
	
	public boolean addPlayer(Player p) {
		return round.add(p);
	}
	
	public void removePlayer(int index) {
		round.remove(index);
	}
	
	public void activecount(boolean rotation) {
		if(rotation==false) {
		if(activePlayer<round.size()-1) {
			System.out.println("T3");
			activePlayer= activePlayer + 1;
		}
		else if (activePlayer==round.size()-1) {
		activePlayer = 0;
		System.out.println("T4");
		}
		else {
			activePlayer = 0;
			System.out.println("T5");
		}
		}
		else {
			if(activePlayer<round.size() && activePlayer>0) {
				activePlayer = activePlayer - 1;
				System.out.println("T6");
			}
			else if (activePlayer== 0) {
				activePlayer = round.size()-1;
				System.out.println("T7");
				
			}
		}
	}

	public Player getactivePlayer() {
		return round.get(activePlayer);
	}
	public int size() {
		return round.size();
	}
	
	public Player getPlayer(int index) {
		return round.get(index);
	}
	}

