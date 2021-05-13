package ro.ase.cts.Template.classes;

public abstract class SpectatorAbstract {
	
	public final void intrareSpectatorPeStadion()
	{
		asezareLaCoada();
		prezintaBilet();
		realizeazaControlCorporal();
		intraPeStadion();
		ocupaLoc();
	}

	public abstract void asezareLaCoada();
	public abstract void  prezintaBilet();
	public abstract void  realizeazaControlCorporal();
	public abstract void intraPeStadion();
	public abstract void ocupaLoc();
	
	
}
