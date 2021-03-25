package ro.ase.cts.main;

import ro.ase.cts.classes.Categorie;
import ro.ase.cts.classes.FactoryBody;
import ro.ase.cts.classes.FactoryCategorie;
import ro.ase.cts.classes.FactoryDurere;
import ro.ase.cts.classes.FactoryGripa;

public class Program {
	
	public static FactoryCategorie getTipFactory()
	{
		return new FactoryGripa();
	}
	
	public static void printeazaCategorie(FactoryCategorie factoryCategorie, float pretDeBaza)
	{
		Categorie categorie=factoryCategorie.createCategorie(pretDeBaza);
		System.out.println(categorie.toString());
		
	}
	
	public static void main(String[] args) {
		
		printeazaCategorie(getTipFactory(), 30);
		
	}


}
