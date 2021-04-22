
package ro.ase.cts.Strategy.classes;

public class Client {
	
	private String numeClient;
	private ModPlata modPlata;
	
	public ModPlata getModPlata() {
		return modPlata;
	}
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public Client(String numeClient) {
		super();
		this.numeClient = numeClient;
		this.modPlata = new Cash();
	}
	
	
	public void platesteNota(double suma)
	{
		System.out.println(numeClient + " trebuie sa realizeze o plata");
		modPlata.plateste(suma);
	}
	
	
	
	
	

}
