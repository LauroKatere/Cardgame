package Game;

import Cards.Card;
import Cards.Deck;
import Cards.Playstack;
import Players.Player;
import Players.Playerlist;

public class Gameoperator {
	
	Deck playdeck = new Deck();
	Playstack playstack = new Playstack();
	Playerlist playround = new Playerlist();
	boolean rotation = false;

	public Gameoperator(String cardgame) {
		
		if(cardgame.equals("Uno")) {
			Card b0 = new Card(0, "blue");
			Card b1 = new Card(1, "blue");
			Card b2 = new Card(2, "blue");
			Card b3 = new Card(3, "blue");
			Card b4 = new Card(4, "blue");
			Card b5 = new Card(5, "blue");
			Card b6 = new Card(6, "blue");
			Card b7 = new Card(7, "blue");
			Card b8 = new Card(8, "blue");
			Card b9 = new Card(9, "blue");
			Card r0 = new Card(0, "red");
			Card r1 = new Card(1, "red");
			Card r2 = new Card(2, "red");
			Card r3 = new Card(3, "red");
			Card r4 = new Card(4, "red");
			Card r5 = new Card(5, "red");
			Card r6 = new Card(6, "red");
			Card r7 = new Card(7, "red");
			Card r8 = new Card(8, "red");
			Card r9 = new Card(9, "red");
			Card g0 = new Card(0, "green");
			Card g1 = new Card(1, "green");
			Card g2 = new Card(2, "green");
			Card g3 = new Card(3, "green");
			Card g4 = new Card(4, "green");
			Card g5 = new Card(5, "green");
			Card g6 = new Card(6, "green");
			Card g7 = new Card(7, "green");
			Card g8 = new Card(8, "green");
			Card g9 = new Card(9, "green");
			Card y0 = new Card(0, "yellow");
			Card y1 = new Card(1, "yellow");
			Card y2 = new Card(2, "yellow");
			Card y3 = new Card(3, "yellow");
			Card y4 = new Card(4, "yellow");
			Card y5 = new Card(5, "yellow");
			Card y6 = new Card(6, "yellow");
			Card y7 = new Card(7, "yellow");
			Card y8 = new Card(8, "yellow");
			Card y9 = new Card(9, "yellow");
			Card b12 = new Card(1, "blue");
			Card b22 = new Card(2, "blue");
			Card b32 = new Card(3, "blue");
			Card b42 = new Card(4, "blue");
			Card b52 = new Card(5, "blue");
			Card b62 = new Card(6, "blue");
			Card b72 = new Card(7, "blue");
			Card b82 = new Card(8, "blue");
			Card b92 = new Card(9, "blue");
			Card r12 = new Card(1, "red");
			Card r22 = new Card(2, "red");
			Card r32 = new Card(3, "red");
			Card r42 = new Card(4, "red");
			Card r52 = new Card(5, "red");
			Card r62 = new Card(6, "red");
			Card r72 = new Card(7, "red");
			Card r82 = new Card(8, "red");
			Card r92 = new Card(9, "red");
			Card g12 = new Card(1, "green");
			Card g22 = new Card(2, "green");
			Card g32 = new Card(3, "green");
			Card g42 = new Card(4, "green");
			Card g52 = new Card(5, "green");
			Card g62 = new Card(6, "green");
			Card g72 = new Card(7, "green");
			Card g82 = new Card(8, "green");
			Card g92 = new Card(9, "green");
			Card y12 = new Card(1, "yellow");
			Card y22 = new Card(2, "yellow");
			Card y32 = new Card(3, "yellow");
			Card y42 = new Card(4, "yellow");
			Card y52 = new Card(5, "yellow");
			Card y62 = new Card(6, "yellow");
			Card y72 = new Card(7, "yellow");
			Card y82 = new Card(8, "yellow");
			Card y92 = new Card(9, "yellow");
			Card w1 = new Card(0, "wish", true);
			Card w2 = new Card(0, "wish", true);
			Card w3 = new Card(0, "wish", true);
			Card w4 = new Card(0, "wish", true);
			Card w5 = new Card(4, "wish", true);
			Card w6 = new Card(4, "wish", true);
			Card w7 = new Card(4, "wish", true);
			Card w8 = new Card(4, "wish", true);
			Card dr1 = new Card(2, "+red");
			Card dr2 = new Card(2, "+red");
			Card dr3 = new Card(2, "+red");
			Card dr4 = new Card(2, "+red");
			Card db1 = new Card(2, "+blue");
			Card db2 = new Card(2, "+blue");
			Card db3 = new Card(2, "+blue");
			Card db4 = new Card(2, "+blue");
			Card dg1 = new Card(2, "+green");
			Card dg2 = new Card(2, "+green");
			Card dg3 = new Card(2, "+green");
			Card dg4 = new Card(2, "+green");
			Card dy1 = new Card(2, "+yellow");
			Card dy2 = new Card(2, "+yellow");
			Card dy3 = new Card(2, "+yellow");
			Card dy4 = new Card(2, "+yellow");
			Card sr1 = new Card(31, "red");
			Card sr2 = new Card(31, "blue");
			Card sr3 = new Card(31, "yellow");
			Card sr4 = new Card(31, "green");
			
			playdeck.add(sr1);
			playdeck.add(sr2);
			playdeck.add(sr3);
			playdeck.add(sr4);
			
			playdeck.add(w1);
			playdeck.add(w2);
			playdeck.add(w3);
			playdeck.add(w4);
			playdeck.add(w5);
			playdeck.add(w6);
			playdeck.add(w7);
			playdeck.add(w8);
			
			playdeck.add(dr1);
			playdeck.add(db1);
			playdeck.add(dg1);
			playdeck.add(dy1);

			playdeck.add(dr2);
			playdeck.add(db2);
			playdeck.add(dg2);
			playdeck.add(dy2);

			playdeck.add(dr3);
			playdeck.add(db3);
			playdeck.add(dg3);
			playdeck.add(dy3);

			playdeck.add(dr4);
			playdeck.add(db4);
			playdeck.add(dg4);
			playdeck.add(dy4);
			
			
			playdeck.add(b0);
			playdeck.add(b1);
			playdeck.add(b2);
			playdeck.add(b3);
			playdeck.add(b4);
			playdeck.add(b5);
			playdeck.add(b6);
			playdeck.add(b7);
			playdeck.add(b8);
			playdeck.add(b9);

			playdeck.add(b12);
			playdeck.add(b22);
			playdeck.add(b32);
			playdeck.add(b42);
			playdeck.add(b52);
			playdeck.add(b62);
			playdeck.add(b72);
			playdeck.add(b82);
			playdeck.add(b92);
			
			playdeck.add(r0);
			playdeck.add(r1);
			playdeck.add(r2);
			playdeck.add(r3);
			playdeck.add(r4);
			playdeck.add(r5);
			playdeck.add(r6);
			playdeck.add(r7);
			playdeck.add(r8);
			playdeck.add(r9);
			

			playdeck.add(r12);
			playdeck.add(r22);
			playdeck.add(r32);
			playdeck.add(r42);
			playdeck.add(r52);
			playdeck.add(r62);
			playdeck.add(r72);
			playdeck.add(r82);
			playdeck.add(r92);
			
			playdeck.add(g0);
			playdeck.add(g1);
			playdeck.add(g2);
			playdeck.add(g3);
			playdeck.add(g4);
			playdeck.add(g5);
			playdeck.add(g6);
			playdeck.add(g7);
			playdeck.add(g8);
			playdeck.add(g9);
			

			playdeck.add(g12);
			playdeck.add(g22);
			playdeck.add(g32);
			playdeck.add(g42);
			playdeck.add(g52);
			playdeck.add(g62);
			playdeck.add(g72);
			playdeck.add(g82);
			playdeck.add(g92);
			
			playdeck.add(y0);
			playdeck.add(y1);
			playdeck.add(y2);
			playdeck.add(y3);
			playdeck.add(y4);
			playdeck.add(y5);
			playdeck.add(y6);
			playdeck.add(y7);
			playdeck.add(y8);
			playdeck.add(y9);
			
			playdeck.add(y12);
			playdeck.add(y22);
			playdeck.add(y32);
			playdeck.add(y42);
			playdeck.add(y52);
			playdeck.add(y62);
			playdeck.add(y72);
			playdeck.add(y82);
			playdeck.add(y92);
			
			playdeck.shuffel();
			
			playstack.addfirstcard(playdeck);
					
			
		}
		
		
	}
	
	public Player getLast() {
		return playround.getLast();
	}

	public void addPlayertoround(Player player) {
		playround.addPlayer(player);
	}
	
	public void play() {
		if(playround.size()==0) { 
			System.out.println("Please add at least tow player to the game.");
			return;
		}
		int numberofcards = (int) (playdeck.size()/playround.size());
		if(numberofcards>5) {
			numberofcards = 5;
		}
		else if (numberofcards<1) {
			System.out.println("There are to many players to play with this normal deck. Please remove some players from the round.");
			return;
		}
		
		for (int x = 0; x<playround.size(); x++) {
			for(int z = 0; z<numberofcards; z++) {
			playround.getPlayer(x).drawcard(playdeck);
		}
		}
		
		boolean playerhand = false;
		Player active = new Player();
		while(playerhand==false) {
			if(playdeck.isEmpty()) {
				playdeck.fillDeck(playstack);
			}
			active = playround.getactivePlayer();
			active.playcard(playstack, playdeck);
			rotation = playstack.rotation;
			playround.activecount(rotation);
			 
			if(active.handsiEmpty()) {
				playerhand = true;
				
			}
			
		}
		
		System.out.println("Winner is "+ active.getname());
		
	}
}