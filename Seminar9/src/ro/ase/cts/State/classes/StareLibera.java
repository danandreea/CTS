
package ro.ase.cts.State.classes;

public class StareLibera implements StareMasa{

	
	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareLibera))
		{
			System.out.println("A fost eliberata masa cu codul: "+ masa.getNrMasa());
			masa.setStareMasa(this);
		}
		else
			System.out.println("Masa este deja libera.");
		
	}
}
