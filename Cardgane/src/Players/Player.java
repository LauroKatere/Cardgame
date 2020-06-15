package Players;

import java.util.LinkedList;

import Cards.Card;


public class Player {
	
	String name;
	LinkedList<Card> hand = new LinkedList<Card>();
	
	public Player() {
		this("Steve");
	}

	public Player(String Name) {
		name = Name;
	}
	
	public void addCardtoHand(Card drowncard) {
		hand.add(drowncard);
	}
	
	public void playcard() {
		
	}
}
