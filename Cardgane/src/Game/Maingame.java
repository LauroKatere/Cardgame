package Game;

import java.util.Scanner;

import Players.*;

public class Maingame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gameoperator game = new Gameoperator("Uno");
		Player standart = new Player();
		
		System.out.println("Please enter the number of players");
		@SuppressWarnings("resource")
		Scanner x = new Scanner(System.in);
		int numberofplayers = x.nextInt();
		
		for(int y = 0; y<numberofplayers; y++) {
			if(y==0) {
			standart.createPlayer(game);
			}
			else {
				game.getLast().createPlayer(game);
			}
		}
				
	
		game.play();
		
		

	}
	
	

}
