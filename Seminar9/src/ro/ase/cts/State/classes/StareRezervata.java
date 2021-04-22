package ro.ase.cts.State.classes;

public class StareRezervata implements StareMasa{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStareMasa() instanceof StareLibera)
		{
			System.out.println("Ati rezervat masa cu codul: "+ masa.getNrMasa());
			masa.setStareMasa(this);
		}
		else
			System.out.println("Masa nu este disponibila.");
		
	}

}
