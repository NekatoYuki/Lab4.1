import java.util.ArrayList;

public class Deck {

	ArrayList<Card> unDealt = new ArrayList<Card>();
	ArrayList<Card> dealt = new ArrayList<Card>();
	ArrayList<Deck> deck = new ArrayList<Deck>();
	
	public Deck (String [] rank, String [] suit, int [] value)
	{
		for (int i = 0; i < rank.length; i++)
		{
			for (int j = 0; j < suit.length; j++)
			{
				unDealt.add(new Card(rank[i], suit[j], value[i]));
			}
		}
	}
	
	public boolean isEmpty()
	{
		if ( deck.size() == 0)
		{
			return true;
		}
		return false;
	}
	public int size()
	{
		return deck.size();
	}
	public deal()
	{
		if (deck.size() == 0)
		{
			return null;
		}
		 dealt;
	}
	public shuffle()
	{
		
	}
}
