package Game;

import Players.*;

public class Maingame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player x = new Player("Julian");
		Player z = new Player("Philipp");
		Gameoperator game = new Gameoperator("Uno");
		
		game.addPlayertoround(x);
		game.addPlayertoround(z);
		game.play();
		
		

	}

}
