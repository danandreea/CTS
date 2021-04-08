package ro.ase.cts.adapter.classes;

public class AdapterCreditObj implements InterfataCredit{

	private Leasing leasing;

	public AdapterCreditObj(Leasing leasing) {
		super();
		this.leasing = leasing;
	}

	@Override
	public void acordaCredit(String nume, float suma) {
		
		this.leasing.oferaLeasing(nume, suma);
	}
	
	
	
	
}
