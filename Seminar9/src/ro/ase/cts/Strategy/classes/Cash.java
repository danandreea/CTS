
package ro.ase.cts.Strategy.classes;

public class Cash implements ModPlata{

	@Override
	public void plateste(double sumaPlatita) {
	
		System.out.println("Se plateste cash suma: " + sumaPlatita);
	}

}
