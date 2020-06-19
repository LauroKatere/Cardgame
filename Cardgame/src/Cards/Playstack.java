package Cards;

import java.util.Scanner;
import java.util.Stack;

public class Playstack {
	
	Stack<Card> playstack = new Stack<Card>();
	boolean actioncard = false;
	boolean draw2 = false;
	boolean wish = false;
	public boolean rotation = false;
	int draw = 0;
	String wishcolour = new String();
	Card fanish = new Card();
	
	public Playstack() {
		
	}
	
	public void addfirstcard(Deck deck) {
		playstack.add(deck.poll());
	}
	
	public void addCard(Card card) {
		playstack.add(card);
	}
	
	public boolean playonstack(Card playcard) {
		Card first = new Card();
		first = playstack.peek();
		System.out.println("amount ouf draw " + draw);
		
		if(wish==true && !playcard.getwish()) {
			
			if(playcard.getnumber()>30) {
				if(playcard.getnumber()==31) {
					System.out.println("T1");
					if(rotation==true) {
						rotation = false;
					}
					else {
						rotation = true;
					}
				}
			}
			
			if((playcard.getcolour().contains("+") && playcard.getcolour().contains(first.getcolour())) ||(playcard.getcolour().contains("+") && playcard.getnumber()==2)) {
				
				draw = draw + playcard.getnumber();
				draw2=true;
				wish = false;
				playstack.pop();
				playstack.add(playcard);
				return true;
				
			}
			
			else if(playcard.getcolour().equals(wishcolour)) {
				playstack.pop();
				playstack.add(playcard);
				wish = false;
					return true;
				}
				else {
					return false;
				}
		}
		
		
		if(playcard.getwish()) {
			if(wish==true) {
				playstack.pop();
			}
			System.out.println("Please type the colour you wish.");
			@SuppressWarnings("resource")
			Scanner x = new Scanner(System.in);
			do {
				wishcolour = x.next();
				if(wishcolour.equals("blue")) {
					break;
				}
				else if(wishcolour.equals("red")) {
					break;
				}
				else if(wishcolour.equals("green")) {
					break;
				}
				else if(wishcolour.equals("yellow")) {
					break;
				}
				
				System.out.println("Please enter one colour that exists.");
				
			}while(true);
			fanish = new Card(0, wishcolour);
			playstack.add(fanish);
			
			draw = draw + playcard.getnumber();
			if(draw>0) {
			draw2 = true;
			}			
			
			wish = true;
			return true;
		}
		
		if((playcard.getcolour().contains("+") && playcard.getcolour().contains(first.getcolour())) || (playcard.getcolour().contains("+") && playcard.getnumber()==2)) {
		
			draw = draw + playcard.getnumber();
			draw2=true;
			playstack.add(playcard);
			return true;
			
		}
		
			
		
		
		if(playcard.getnumber() == first.getnumber() || playcard.getcolour().contains(first.getcolour())) {			
		
			if(playcard.getnumber()>30) {
				if(playcard.getnumber()==31) {
					rotation = !rotation;
					
				}
			}
			
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
	
	public boolean getdraw() {
		return draw2;
	}
	
	public int getdrawamount() {
		return draw;
	}
	
	public void setdrawfalse() {
		draw2=false;
	}
	
	public void setdrawamounttozero() {
		draw = 0;
	}

}
