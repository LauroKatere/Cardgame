package Players;

import java.util.LinkedList;
import java.util.Scanner;

import Cards.Card;
import Cards.Deck;
import Cards.Playstack;
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
		
		if(playstack.getdraw()) {
			System.out.println("T2");
			for(int y = 0; y<playstack.getdrawamount(); y++) {
				this.drawcard(deck);
				
			}
			System.out.println(name + "has drawn " + playstack.getdrawamount() + "cards.");
			playstack.setdrawamounttozero();
			playstack.setdrawfalse();
		}
		else {
		int x = hand.size();
		if(playstack.peek().getnumber()>30) {
			if(playstack.peek().getnumber()==31) {
				System.out.println("Card on the stack : " +  "switchrotation" + playstack.peek().getcolour());
			}
		}
		else{
		System.out.println("Card on the stack : " + playstack.peek().getnumber() + " " + playstack.peek().getcolour());
		}
		
		System.out.println(name +" your cards are:");
		for(int z = 0; z<x ; z++) {
			if(hand.get(z).getnumber()>30) {
				if(hand.get(z).getnumber()==31) {
					System.out.println("switchrotation"+hand.get(z).getcolour());
				}
				
			}
			else {
			System.out.println(hand.get(z).getnumber() + hand.get(z).getcolour());
			}}
		
		System.out.println("Either type the card you want to play or type 'draw' to draw a card.");
		
		@SuppressWarnings("resource")
		Scanner play1 = new Scanner(System.in);
		String play = play1.next();
		
		if(play.contains("draw")) {
			
			this.drawcard(deck);
			return;
			
		}
		
		if(play.contains("switchrotation")) {
			play = play.replaceFirst("switchrotation", "31");
		}
		
		
		for (int u = 0 ; u<x ;u++) {
			if( play.contains(hand.get(u).getcolour()) && play.contains(Integer.toString(hand.get(u).getnumber()))) {
				if(playstack.playonstack(hand.get(u))) {
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
