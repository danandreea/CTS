package ro.ase.cts.Chain.classes;

public class ContCredit extends Cont{

	public ContCredit(float sold, String numeClient, Cont succesor) {
		super(sold, numeClient, succesor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		if(super.getSold()>=suma)
		{
			System.out.println(this.getNumeClient()+ " a realizat plata de: "+suma+ " din contul de credit.");
		}
		else
		{
			super.getSuccesor().plateste(suma);
		}
	}

}
