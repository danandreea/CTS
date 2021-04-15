package ro.ase.cts.FlyWeight.classes;

public class Client implements FlyWeightAbstract{

	
	private  String nume;
	private String nrTelefon;
	private String email;
	
	
	
	public Client(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}



	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", email=" + email + "]";
	}



	@Override
	public void afisareInformatii(Rezervare rezervare) {
		System.out.println(this.toString()+ rezervare.toString());
		
	}
	
	
}
