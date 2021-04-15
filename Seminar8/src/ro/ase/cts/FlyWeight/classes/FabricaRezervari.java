package ro.ase.cts.FlyWeight.classes;

import java.util.HashMap;
import java.util.Map;

public class FabricaRezervari {

	
	private Map<String, FlyWeightAbstract> clienti;

	public FabricaRezervari() {
		super();
		this.clienti = new HashMap<String, FlyWeightAbstract>();
	}
	
	public FlyWeightAbstract getClient(String email)
	{
		FlyWeightAbstract client=clienti.get(email);
		if(client==null)
		{
			client=new Client("Alisa", "0732881231", email);
			clienti.put(email, client);
		}
		return client;
	}
	
}
