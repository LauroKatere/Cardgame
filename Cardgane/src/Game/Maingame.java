package Game;

import Cards.*;
import Players.*;

public class Maingame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player x = new Player();
		
		Deck z = new Deck();
		Card c1 = new Card();
		Card c2 = new Card(8);
		Card c3 = new Card(9);
		Card c4 = new Card(10);
		Card c5 = new Card(7, "Kreuz");
		Card c6 = new Card(8, "Kreuz");
		Card c7 = new Card(9, "Kreuz");
		Card c8 = new Card(10, "Kreuz");
		Card c9 = new Card(7, "Herz");
		Card c10 = new Card(8, "Herz");
		Playstack y = new Playstack();
		z.add(c1);
		z.add(c2);
		z.add(c3);
		z.add(c4);
		z.add(c5);
		z.add(c6);
		z.add(c7);
		z.add(c8);
		z.add(c9);
		z.add(c10);
		z.shuffel();
		
		x.drawcard(z);
		x.drawcard(z);
		x.drawcard(z);
		y.addfirstcard(z);
		
		x.playcard(y, z);
		

	}

}
