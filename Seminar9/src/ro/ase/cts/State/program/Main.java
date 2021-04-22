package ro.ase.cts.State.program;

import ro.ase.cts.State.classes.Masa;
import ro.ase.cts.State.classes.StareLibera;

public class Main {

	public static void main(String[] args) {
	
		Masa masa = new Masa(1);
		masa.rezervaMasa();
		
		masa.rezervaMasa();
		
		//masa.setStareMasa(new StareLibera());
		masa.rezervaMasa();
		masa.ocupaMasa();
		
		masa.elibereazaMasa();
		
	}

}
