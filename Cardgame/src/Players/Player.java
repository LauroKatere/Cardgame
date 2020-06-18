package Players;

import java.util.LinkedList;
import java.util.Scanner;

import Cards.Card;
import Game.Gameoperator;


public class Player {
	
	String name;
	LinkedList<Card> hand = new LinkedList<Card>();
	
	public Player() {
		this("Steve");
	}

	public Player(String Name) {
		name = Name;
	}
	
	public void createPlayer(Gameoperator game) {
		System.out.println("Please enter the name of your player");
		@SuppressWarnings("resource")
		Scanner x = new Scanner(System.in);
		String name = x.next();
		Player player = new Player(name);
		game.addPlayertoround(player);
	}
	
	
	
	public void playcard(Playstack playstack, Deck deck) {
		int x = hand.size();
		System.out.println("Card on the stack :" + playstack.peek().getnumber() + " " + playstack.peek().getcolour());
		System.out.println(name +" your cards are:");
		for(int z = 0; z<x ; z++) {
			System.out.println(hand.get(z).getnumber() + hand.get(z).getcolour());
			System.out.println();
			}
		
		System.out.println("Either type the card you want to play or type 'draw' to draw a card.");
		
		@SuppressWarnings("resource")
		Scanner play1 = new Scanner(System.in);
		String play = play1.next();
		
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
			
			
		}
		System.out.println("Please choose a card that's on your hand. Or draw one.");
		this.playcard(playstack, deck);
		
	}

	public void drawcard(Deck deck) {
		hand.add(deck.poll());
		
	}
	
	public boolean handsiEmpty() {
		return hand.isEmpty();
	}
	
	public String getname() {
		return name;
	}
}
