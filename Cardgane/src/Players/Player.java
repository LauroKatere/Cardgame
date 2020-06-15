package Players;

import java.util.LinkedList;

import Cards.*;


public class Player {
	
	String name;
	LinkedList<Card> hand = new LinkedList<Card>();
	
	public Player() {
		this("Steve");
	}

	public Player(String Name) {
		name = Name;
	}
	
	
	
	public void playcard(Playstack playstack, Deck deck) {
		int x = hand.size();
		System.out.println("Card on the stack :" + playstack.peek().getnumber() + " " + playstack.peek().getcolour());
		System.out.println("Your cards are:");
		for(int z = 0; z<x ; z++) {
			System.out.println(hand.get(z).getnumber() + hand.get(z).getcolour());
			System.out.println();
			}
		
		System.out.println("Either type the card you want to play or type 'draw' to draw a card.");
		
		String play = new String(System.in.toString());
		
		if(play.contains("draw")) {
			
			this.drawcard(deck);
			return;
			
		}
		
		for (int u = 0 ; u<x ;u++) {
			if(play.contains(hand.get(u).getcolour()) && play.contains(Integer.toString(hand.get(u).getnumber()))) {
				if(playstack.add(hand.get(u))) {
					hand.remove(u);
					return;
				}
				else {
					System.out.println("Please choose a card you can play.");
					this.playcard(playstack, deck);
				}	
				
			}
			else {
				System.out.println("Please choose a card that's on your hand. Or draw one.");
				this.playcard(playstack, deck);
			}
			
		}
		
	}

	private void drawcard(Deck deck) {
		hand.add(deck.poll());
		
	}
}
