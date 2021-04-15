package ro.ase.cts.FlyWeight.program;


import ro.ase.cts.FlyWeight.classes.FabricaRezervari;
import ro.ase.cts.FlyWeight.classes.Rezervare;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rezervare rezervare1=new Rezervare(1,2,"12:00");
		Rezervare rezervare2=new Rezervare(3,5,"16:00");
		
		
		FabricaRezervari fabrica=new FabricaRezervari();
		fabrica.getClient("alisa@gmail.com").afisareInformatii(rezervare1);
		fabrica.getClient("alisa@gmail.com").afisareInformatii(rezervare2);
		
		Rezervare rezervare3=new Rezervare(2,4,"13:00");
		fabrica.getClient("email@gmail.com").afisareInformatii(rezervare1);
	}
}
