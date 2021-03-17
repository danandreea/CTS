package ro.ase.cts.classes;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static float sumaFinantare=20;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAnStudii() {
		return anStudii;
	}
	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	@Override
	public String toString() {
		return "Student: " + super.toString() + "Facultate=" + facultate + ", An Studii=" + anStudii ;
	}
	
	
	public int finantare() {
		int suma=20;
		System.out.println("Studentul "+getNume()+" "+getPrenume()+" primeste"+suma+" Euro/zi in proiect.");
		return suma;
	}
	
	@Override
	public float getSumaFinantata() {
		return sumaFinantare;
	}

	public static float getSumaFinantare() {
		return sumaFinantare;
	}

	public static void setSumaFinantare(float sumaFinantare) {
		Student.sumaFinantare = sumaFinantare;
	}
	
}
