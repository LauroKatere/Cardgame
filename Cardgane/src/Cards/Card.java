package Cards;

public class Card {
	
	int number;
	String colour;
	
	public Card() {
		this(7);
	}
	
	public Card(int Number) {
		this(Number,"Caro");
	}
	
	public Card(int Number, String Colour) {
		number= Number;
		colour = Colour;
	}

}
