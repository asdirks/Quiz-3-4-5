package pkgCore;

import pkgCore.Hand;
import pkgCore.Deck;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class cMain {

	public static void main(String[] args) throws Exception {
		
		Deck d = new Deck();
		Card a = d.draw();
		Card b = d.draw();
		Card c = d.draw();
		Card e = d.draw();
		System.out.print(a.geteRank());
		System.out.println(a.geteSuit());
		System.out.print(b.geteRank());
		System.out.println(b.geteSuit());
		System.out.print(c.geteRank());
		System.out.println(c.geteSuit());
		System.out.print(e.geteRank());
		System.out.println(e.geteSuit());		
		
		System.out.println(d.getRemaining(a.geteRank()));
		System.out.println(d.getRemaining(b.geteSuit()));
		System.out.println(d.getRemaining(c.geteRank()));
		System.out.println(d.getRemaining(e.geteSuit()));

	}

}
