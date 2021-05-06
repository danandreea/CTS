package ro.ase.cts.main;


import ro.ase.cts.classes.Constituire;
import ro.ase.cts.classes.ContBancar;
import ro.ase.cts.classes.Depunere;
import ro.ase.cts.classes.ManagerComenzi;
import ro.ase.cts.classes.Retragere;

public class Program {

	
	public static void main(String[] args) {
		
		ManagerComenzi manager = new ManagerComenzi();
		manager.invoca(new Constituire(new ContBancar("Deea"), 500));
		manager.executaComanda();
		manager.invoca(new Retragere(new ContBancar("Ioana"), 100));

		manager.executaComanda();
		
		manager.invoca(new Depunere(new ContBancar("Andrei"), 100));
		manager.executaComanda();
	}

}
