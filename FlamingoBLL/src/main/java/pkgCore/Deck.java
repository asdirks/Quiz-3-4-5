package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private int numberOfDecks;
	private ArrayList<Card> Cards = new ArrayList<Card>(52*numberOfDecks);

	
	public Deck() {
		BuildDeck();
	}
	
	public Deck(int numberOfDecks) {
		
		for(int i = 0; i < numberOfDecks; i++) {
			BuildDeck();
		}
		
	}
	
	private void BuildDeck() {
		for(eRank eRank: eRank.values()) {
			for(eSuit eSuit: eSuit.values()) {
				Cards.add(new Card(eRank, eSuit));
			}
		}
		
		Collections.shuffle(Cards);
		
	}
		
	/*Collections.shuffle(Cards);
		
		for(Card c: Cards) {
			
			System.out.print(c.geteRank() + " ");
			System.out.println(c.geteSuit());
			
		}*/
	
	
	public Card draw() throws Exception {
		
		if(Cards.size() == 0) {
			
			throw new Exception("Deck is empty");
		}
		
		return Cards.remove(0);	
	}	
	
	public int deckSize() {
		return this.Cards.size();
	}
	
	public int getRemaining(Object eNum) { 
		int tally = 0;
		for(Card card : Cards) {
			if((eNum instanceof eRank && card.geteRank() == eNum) || (eNum instanceof eSuit && card.geteSuit() == eNum)){
				tally++;
			}
		}
		return tally;
	}
}
