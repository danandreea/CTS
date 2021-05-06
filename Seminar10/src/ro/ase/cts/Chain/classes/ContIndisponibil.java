package ro.ase.cts.Chain.classes;

public class ContIndisponibil extends Cont{

	public ContIndisponibil(String numeClient) {
		super(0, numeClient, null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		System.out.println("Plata a fost refuzata. Fonduri insuficiente");
	}

}
