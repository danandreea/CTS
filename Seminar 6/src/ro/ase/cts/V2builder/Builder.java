package ro.ase.cts.V2builder;

public class Builder implements IBuillder {

	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	


	public Builder() {
		super();
		this.mancareInclusa = false;
		this.scaunErgonomic = false;
		this.bauturaRacoritoare = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "";
		this.codRezervare = 1;
	}

	public Builder(int codRezervare) {
		super();
		this.mancareInclusa = false;
		this.scaunErgonomic = false;
		this.bauturaRacoritoare = false;
		this.muzicaAmbientala = false;
		this.genMuzica = "";
		this.codRezervare = codRezervare;
	}
	



	public Builder setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}





	public Builder setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}





	public Builder setBauturaRacoritoare(boolean bauturaRacoritoare) {
		this.bauturaRacoritoare = bauturaRacoritoare;
		return this;
	}





	public Builder setMuzicaAmbientala(boolean muzicaAmbientala) {
		this.muzicaAmbientala = muzicaAmbientala;
		return this;
	}





	public Builder setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}





	public Builder setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}



	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(mancareInclusa, scaunErgonomic,bauturaRacoritoare,muzicaAmbientala,genMuzica,codRezervare);
	}

}
