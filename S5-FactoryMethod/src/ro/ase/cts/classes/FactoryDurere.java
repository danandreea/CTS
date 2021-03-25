package ro.ase.cts.classes;

public class FactoryDurere implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pret) {
		// TODO Auto-generated method stub
		return new Durere(pret);
	}

}
