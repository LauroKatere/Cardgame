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
		int y;
		LinkedList<Card> shuffeldeck1 = new LinkedList<Card>();
		LinkedList<Card> shuffeldeck2 = new LinkedList<Card>();	
		for(int z = 0; z<1000000; z++) {
		while(!Deck.isEmpty()) {
			shuffeldeck1.add(Deck.poll());
			shuffeldeck2.add(Deck.poll());
		}
		
		while(!shuffeldeck1.isEmpty()) {
			Deck.add(shuffeldeck1.poll());
		}
		
		while(!shuffeldeck2.isEmpty()) {
			Deck.add(shuffeldeck2.poll());
		}
		
		y = (int) (Math.random()*10);
		for(int x = 0; x<y; x++) {
			shuffeldeck1.add(Deck.poll());			
		}
		
		for(int w = 0; w<y; w++) {
			Deck.add(shuffeldeck1.poll());			
		}
		
		}
	}
	
	public int size() {
		return Deck.size();
	}
	
}
