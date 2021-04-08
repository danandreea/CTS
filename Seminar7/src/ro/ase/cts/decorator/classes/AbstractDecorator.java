package ro.ase.cts.decorator.classes;

public abstract class AbstractDecorator implements ICard{
	
	private ICard card;
	
	public AbstractDecorator(ICard card) {
		super();
		this.card = card;
	}
	
	public ICard getCard()
	{
		return card;
	}

	@Override
	public void platesteOnline() {
		this.card.platesteOnline();
	}

	@Override
	public void platesteFizic() {
		this.card.platesteFizic();
		
	}
	
	@Override
	public String getDetinatorCard()
	{
		return card.getDetinatorCard();
	}
	
	public abstract void platesteContactless();

}
