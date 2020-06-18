package Cards;

import java.util.Scanner;
import java.util.Stack;

public class Playstack {
	
	Stack<Card> playstack = new Stack<Card>();
	boolean actioncard = false;
	boolean draw2 = false;
	boolean wish = false;
	int draw = 0;
	String wishcolour = new String();
	
	public Playstack() {
		
	}
	
	public void addfirstcard(Deck deck) {
		playstack.add(deck.poll());
	}
	
	public boolean add(Card playcard) {
		Card first = new Card();
		first = playstack.peek();
		System.out.println("amount ouf draw" + draw);
		
		if(whish==true && !playcard.getwish()) {
			if(playcard.getcolour().equals(wishcolour)) {			
				playstack.add(playcard);
					return true;
				}
				else {
					return false;
				}
		}
		
		if(playcard.getwish()) {
			System.out.println("Please type the colour you wish.");
			Scanner x = new Scanner(System.in);
			do {
				wishcolour = x.next();
				if(whishcolour.equals("blue")) {
					break;
				}
				else if(whishcolour.equals("red")) {
					break;
				}
				else if(whishcolour.equals("green")) {
					break;
				}
				else if(whishcolour.equals("yellow")) {
					break;
				}
				
				System.out.println("Please enter one colour that exists.");
				
			}while(true);
			
			draw = draw + playcard.getnumber();
			draw2 = true;
			wish = true;
			return true;
		}
		
		
		
		
		
		
		if(playcard.getnumber() == first.getnumber() || playcard.getcolour().equals(first.getcolour())) {			
		playstack.add(playcard);
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public Card peek() {
		return playstack.peek();
	}
	
	public Card pop() {
		return playstack.pop();
	}
	
	public boolean isEmpty() {
		return playstack.isEmpty();
	}

}
