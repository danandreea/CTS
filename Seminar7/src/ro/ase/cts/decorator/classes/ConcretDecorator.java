package ro.ase.cts.decorator.classes;

public class ConcretDecorator extends AbstractDecorator{

	public ConcretDecorator(ICard card) {
		super(card);
		
	}

	@Override
	public void platesteContactless() {
		System.out.println(super.getCard().getDetinatorCard() + " a platit contactless");
	}



}
