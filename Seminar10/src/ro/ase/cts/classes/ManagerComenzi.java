package ro.ase.cts.classes;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

	
	List<Command> listaComenzi;
	
	
	
	public ManagerComenzi() {
		super();
		this.listaComenzi = new ArrayList<>();
	}


	public void invoca(Command comanda)
	{
		listaComenzi.add(comanda);
	}
	
	public void executaComanda()
	{
		if(this.listaComenzi.size()!=0)
			this.listaComenzi.get(0).executa();
		this.listaComenzi.remove(0);
		
	}
	
	
}
