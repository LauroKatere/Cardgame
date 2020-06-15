package Cards;

import java.util.Stack;

public class Playstack {
	
	Stack<Card> playstack = new Stack<Card>();
	
	public Playstack() {
		
	}
	
	public boolean add(Card playcard) {
		Card first = new Card();
		first = playstack.peek();
		if(playcard.getnumber() == first.getnumber() || playcard.getcolour().equals(first.getcolour())) {
		playstack.add(playcard);
			return true;
		}
		else {
			return false;
		}
		
	}

}
