import java.util.*;

public class Card {

	String rank;
	String suit;
	int value;
	
	public Card(String rank, String suit, int value) {
		// TODO Auto-generated constructor stub
		
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean equals(Card x, Card y) {
		if (x.equals(y))
		{
			return true;
		}
		return false;
	}
	public String toString()
	{
		
	}
}
