package classes.pack;

public class Zebra extends Animal{
	
	private int nrdungi;

	public int getNrdungi() {
		return nrdungi;
	}

	public void setNrdungi(int nrdungi) {
		this.nrdungi = nrdungi;
	}

	public Zebra(String name, float greutate, int nrdungi) {
		super(name, greutate);
		this.nrdungi = nrdungi;
	}

	public Zebra(String name, float greutate) {
		super(name, greutate);
		// TODO Auto-generated constructor stub
	}
	
	
	

}
