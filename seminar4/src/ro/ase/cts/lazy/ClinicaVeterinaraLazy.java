package ro.ase.cts.lazy;

import ro.ase.cts.eager.ClinicaVeterinara;

public class ClinicaVeterinaraLazy {
	
	private String nume;
	private String adresa;
	private int numarMedici;
	private float buget;
	
	
	private static ClinicaVeterinaraLazy clinica=null;
	
	
	private ClinicaVeterinaraLazy(String nume, String adresa, int numarMedici, float buget) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.numarMedici = numarMedici;
		this.buget = buget;
	}
	
	
	public static ClinicaVeterinaraLazy getInstance(String nume, String adresa, int numarMedici, float buget)
	{
		if(clinica==null)
		{
			clinica=new ClinicaVeterinaraLazy(nume, adresa, numarMedici, buget);
		}
		
		return clinica;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public String getAdresa() {
		return adresa;
	}


	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	public int getNumarMedici() {
		return numarMedici;
	}


	public void setNumarMedici(int numarMedici) {
		this.numarMedici = numarMedici;
	}


	public float getBuget() {
		return buget;
	}


	public void setBuget(float buget) {
		this.buget = buget;
	}


	@Override
	public String toString() {
		return "ClinicaVeterinaraLazy [nume=" + nume + ", adresa=" + adresa + ", numarMedici=" + numarMedici
				+ ", buget=" + buget + "]";
	}
	
	

}
