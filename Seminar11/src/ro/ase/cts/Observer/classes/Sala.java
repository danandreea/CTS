package ro.ase.cts.Observer.classes;

import java.util.ArrayList;
import java.util.List;

public class Sala implements Subiect{

	private List<Observer> observeri;
	private String numeSala;
	
	

	public Sala( String numeSala) {
		super();
		this.observeri = new ArrayList<>();
		this.numeSala = numeSala;
	}

	@Override
	public void aboneazaClient(Observer observer) {
		// TODO Auto-generated method stub
		observeri.add(observer);
	}

	@Override
	public void dezaboneazaClient(Observer observer) {
		// TODO Auto-generated method stub
		observeri.remove(observer);
	}

	@Override
	public void trimiteMesaj(String mesaj) {
		// TODO Auto-generated method stub
		for(Observer obs: observeri)
		{
			obs.receptionareMesaj(numeSala + ": "+ mesaj);
		}
	}
	
	public void anuntaMeciFotbal()
	{
		trimiteMesaj("Urmeaza un meci de fotbal");
	}
	
	public void anuntaMeciVolei()
	{
		trimiteMesaj("Urmeaza un meci de volei");
	}
}
