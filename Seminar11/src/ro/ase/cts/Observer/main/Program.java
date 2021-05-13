package ro.ase.cts.Observer.main;

import ro.ase.cts.Observer.classes.ClientAbonat;
import ro.ase.cts.Observer.classes.Sala;

public class Program {

	public static void main(String[] args) {
	
		ClientAbonat clientPopescu= new ClientAbonat("Popescu");
		ClientAbonat clientVasilescu= new ClientAbonat("Vasilescu");
		ClientAbonat clientIonescu= new ClientAbonat("Ionescu");
		
		Sala sala=new Sala("Sala Sporturilor");
		
		sala.aboneazaClient(clientPopescu);
		sala.aboneazaClient(clientVasilescu);
		sala.aboneazaClient(clientIonescu);
		
		sala.anuntaMeciFotbal();
		sala.dezaboneazaClient(clientIonescu);
		sala.anuntaMeciVolei();
	}
}
