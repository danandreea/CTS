package ro.ase.cts.adapter.classes;

public class AdapterCreditCls extends Leasing implements InterfataCredit {

	
	
	public AdapterCreditCls() {
		super();
		
	}

	@Override
	public void acordaCredit(String nume, float suma) {
		this.oferaLeasing(nume, suma);
		
	}
	
	

}
