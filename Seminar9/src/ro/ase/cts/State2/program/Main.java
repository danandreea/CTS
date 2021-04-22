package ro.ase.cts.State2.program;

import ro.ase.cts.State2.classes.Masa;

public class Main {

	public static void main(String[] args) {
	
		Masa masa = new Masa(1);
		masa.rezervaMasa();
		
		masa.rezervaMasa();
		
		masa.rezervaMasa();
		masa.ocupaMasa();
		
		masa.elibereazaMasa();
		

	}

}
