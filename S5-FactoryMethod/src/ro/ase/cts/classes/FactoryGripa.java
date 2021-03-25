
package ro.ase.cts.classes;

public class FactoryGripa implements FactoryCategorie{

	@Override
	public Categorie createCategorie(float pret) {
		// TODO Auto-generated method stub
		return new Gripa(pret);
	}

}
