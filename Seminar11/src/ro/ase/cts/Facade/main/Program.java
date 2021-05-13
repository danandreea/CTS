package ro.ase.cts.Facade.main;

import ro.ase.cts.Facade.classes.Facade;
import ro.ase.cts.Facade.classes.Pacient;

public class Program {
	public static void main(String[] args) {
		
		Pacient p1=new Pacient("Dani", false);
		Pacient p2=new Pacient("Catalin", true);
		
		System.out.println(Facade.verificaPacient(p1));
		System.out.println(Facade.verificaPacient(p2));
	}
}
