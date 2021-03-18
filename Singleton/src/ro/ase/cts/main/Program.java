package ro.ase.cts.main;

import ro.ase.cts.classes.Dovada;


public class Program {

	public static void main(String[] args) {
		
		Dovada dovada1=Dovada.getInstance(101, "vaccin", "Ion Georgescu", 23.4f);
		Dovada dovada2=Dovada.getInstance(102, "apt sport", "Popescu Maria", 13.5f);
		
			
		System.out.println(dovada1.toString());
		System.out.println(dovada2.toString());
		
		
		dovada1.setPosesor("Ionescu Mihai");
		dovada2.setPret(12.6f);
		
		System.out.println(dovada1.toString());
		System.out.println(dovada2.toString());
		

	}

}
