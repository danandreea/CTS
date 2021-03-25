package ro.ase.cts.main;

import ro.ase.cts.classes.Categorie;
import ro.ase.cts.classes.CategorieFactory;
import ro.ase.cts.classes.CategoriiMedicamente;
import ro.ase.cts.classes.Durere;

public class Program {
	
	
	public static CategoriiMedicamente getTipCategorie()
	{
		return CategoriiMedicamente.raceala;
	}

	public static void main(String[] args) {
		
		
		try {
			CategorieFactory factory=new CategorieFactory();
			Categorie durere=factory.creareCategorie(CategoriiMedicamente.durere,5);
			Categorie body=factory.creareCategorie(CategoriiMedicamente.body,15);
			Categorie categorie=factory.creareCategorie(getTipCategorie(),20);
			
			System.out.println(durere.toString());
			System.out.println(body.toString());
			System.out.println(categorie.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
