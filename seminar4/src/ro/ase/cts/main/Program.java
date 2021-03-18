package ro.ase.cts.main;

import ro.ase.cts.eager.ClinicaVeterinara;
import ro.ase.cts.lazy.ClinicaVeterinaraLazy;

public class Program {

	public static void main(String[] args) {
		
		
//		ClinicaVeterinara clinicaVeterinara1=ClinicaVeterinara.getInstance();
//		ClinicaVeterinara clinicaVeterinara2=ClinicaVeterinara.getInstance();
//		
//		
//		System.out.println(clinicaVeterinara1.toString());
//		System.out.println(clinicaVeterinara2.toString());
		
		

		ClinicaVeterinaraLazy clinicaVeterinara1=ClinicaVeterinaraLazy.getInstance("ClinVet", "str. Traian", 10, 23.4f);
		ClinicaVeterinaraLazy clinicaVeterinara2=ClinicaVeterinaraLazy.getInstance("ClinVet2", "str. Libertatii", 15, 13.4f);
		
		
		
		System.out.println(clinicaVeterinara1.toString());
		System.out.println(clinicaVeterinara2.toString());
		
		clinicaVeterinara1.setNume("Clinica 2");
		clinicaVeterinara2.setNumarMedici(100);
		
		System.out.println(clinicaVeterinara1.toString());
		System.out.println(clinicaVeterinara2.toString());
		
		

	}

}
