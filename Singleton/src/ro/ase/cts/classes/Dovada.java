package ro.ase.cts.classes;

public class Dovada {
	
	private int id;
	private String tip;
	private String posesor;
	private float pret;
	
	
	private static Dovada instanta=null;
	
	
	public static synchronized Dovada getInstance(int id, String tip, String posesor, float pret) {
		if(instanta == null) {
			instanta = new Dovada(id, tip, posesor, pret);
		}
		return instanta;
	}
	
	

	private Dovada(int id, String tip, String posesor, float pret) {
		super();
		this.id = id;
		this.tip = tip;
		this.posesor = posesor;
		this.pret = pret;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTip() {
		return tip;
	}


	public void setTip(String tip) {
		this.tip = tip;
	}


	public String getPosesor() {
		return posesor;
	}


	public void setPosesor(String posesor) {
		this.posesor = posesor;
	}


	public float getPret() {
		return pret;
	}


	public void setPret(float pret) {
		this.pret = pret;
	}


	@Override
	public String toString() {
		return "Dovada [id=" + id + ", tip=" + tip + ", posesor=" + posesor + ", pret=" + pret + "]";
	}
	
	
	

}
