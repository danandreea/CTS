package ro.ase.cts.State.classes;

public class StareOcupata implements StareMasa{

	public void modificaStare(Masa masa) {
		if(!(masa.getStareMasa() instanceof StareOcupata))
		{
			System.out.println("A fost ocupata masa cu codul: "+ masa.getNrMasa());
			masa.setStareMasa(this);
		}
		else
			System.out.println("Masa este deja ocupata.");
		
	}
}
