package ro.ase.cts.classes;

public class FactoryRaceala implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pret) {
		// TODO Auto-generated method stub
		return new Raceala(pret);
	}

}
