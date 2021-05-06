package ro.ase.cts.Chain.main;

import ro.ase.cts.Chain.classes.Cont;
import ro.ase.cts.Chain.classes.ContCredit;
import ro.ase.cts.Chain.classes.ContCurent;
import ro.ase.cts.Chain.classes.ContEconomii;
import ro.ase.cts.Chain.classes.ContIndisponibil;

public class Program {

	public static void main(String[] args) {
		
	Cont contCredit=new ContCredit(1800, "Deea", null);
	Cont contCurent=new ContCurent(1200, "Deea", null);
	Cont contEconomii=new ContEconomii(1500, "Deea", null);
	Cont contIndisponibil=new ContIndisponibil("Deea");
	
	contCurent.setSuccesor(contEconomii);
	contEconomii.setSuccesor(contCredit);
	contCredit.setSuccesor(contIndisponibil);
	
	contCurent.plateste(1600);
	}
}
