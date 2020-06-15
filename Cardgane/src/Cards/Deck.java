package Cards;

import java.util.LinkedList;

public class Deck {

	LinkedList<Card> Deck = new LinkedList<Card>();
	
	public void add(Card card) {
		Deck.add(card);
	}
	
	public Card poll() {
		return Deck.poll();
	}
	
	public void shuffel() {
		Card e = new Card();
		for(int x=0; x<10000; x++) {
			int z = (int) Math.random()*10;
			e = Deck.get(z);
			Deck.add(e);
		}
	}
	
}
