package ro.ase.cts.classes;

public class FactoryBody implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pret) {
		// TODO Auto-generated method stub
		return new Body(pret);
	}

}
