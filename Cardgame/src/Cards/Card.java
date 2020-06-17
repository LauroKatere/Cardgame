package Cards;

public class Card {
	
	int number;
	String colour;
	boolean  wishcolour;
	
	public Card() {
		this(7);
	}
	
	public Card(int Number) {
		this(Number,"Caro");
	}
	
	public Card(int Number, String Colour) {
		this(Number, Colour, false);
	}
	
	public Card(int Number, String Colour, boolean wishcard) {
		number= Number;
		colour = Colour;
		wishcolour = wishcard;
	}
	
	public int getnumber() {
		return number;
	}
	
	public String getcolour() {
		return colour;
	}
	
	public boolean getwish() {
		return wishcolour;
	}
	

}
