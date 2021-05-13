package ro.ase.cts.Observer.classes;

public class ClientAbonat implements Observer{

	
	private String nume;
	
	
	public ClientAbonat(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void receptionareMesaj(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println(nume + " ai primit un mesajul " + mesaj);
	}

}
