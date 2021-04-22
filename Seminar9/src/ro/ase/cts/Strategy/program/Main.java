package ro.ase.cts.Strategy.program;

import ro.ase.cts.Strategy.classes.Card;
import ro.ase.cts.Strategy.classes.Cash;
import ro.ase.cts.Strategy.classes.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Client client =new Client("Alexandru");
		client.setModPlata(new Cash());
		
		client.platesteNota(200.00);
		
		client.setModPlata(new Card(500.00));
		client.platesteNota(350.00);
		client.platesteNota(200.00);
		
		
	}

}
