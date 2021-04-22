package ro.ase.cts.State.classes;

public class Masa {

	private StareMasa stareMasa;
	private int nrMasa;
	
	public Masa(int nrMasa) {
		super();
		this.stareMasa = new StareLibera();
		this.nrMasa = nrMasa;
	}

	public StareMasa getStareMasa() {
		return stareMasa;
	}

	void setStareMasa(StareMasa stareMasa) {
		this.stareMasa = stareMasa;
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	
	public void rezervaMasa()
	{
		//StareMasa stareRezervata=new StareRezervata();
		//stareRezervata.modificaStare(this);
		modificaStareMasa(new StareRezervata());
	}
	
	public void ocupaMasa()
	{
		StareMasa stareOcupata=new StareOcupata();
		stareOcupata.modificaStare(this);
	}
	
	public void elibereazaMasa()
	{
		StareMasa stareLibera=new StareLibera();
		stareLibera.modificaStare(this);
	}
	
	public void modificaStareMasa(StareMasa stare)
	{
		stare.modificaStare(this);
	}
	
}
