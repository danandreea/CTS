package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.classes.AbstractDecorator;
import ro.ase.cts.decorator.classes.Card;
import ro.ase.cts.decorator.classes.ConcretDecorator;
import ro.ase.cts.decorator.classes.ICard;

public class Program {

	public static void main(String[] args) {
		ICard card=new Card("Ionel");
		card.platesteOnline();
		
		
		AbstractDecorator decoratorCard=new ConcretDecorator(card);
		decoratorCard.platesteFizic();
		decoratorCard.platesteContactless();	
		
	}

}
