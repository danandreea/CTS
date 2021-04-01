package ro.ase.cts.V3Builder;


public class Rezervare {
	
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturaRacoritoare;
	private boolean muzicaAmbientala;
	private String genMuzica;
	private int codRezervare;
	
	
	private Rezervare(RezervareBuilder builder) {
		super();
		this.mancareInclusa = builder.mancareInclusa;
		this.scaunErgonomic = builder.scaunErgonomic;
		this.bauturaRacoritoare = builder.bauturaRacoritoare;
		this.muzicaAmbientala = builder.muzicaAmbientala;
		this.genMuzica = builder.genMuzica;
		this.codRezervare = builder.codRezervare;
	}


	public boolean isMancareInclusa() {
		return mancareInclusa;
	}



	public boolean isScaunErgonomic() {
		return scaunErgonomic;
	}



	public boolean isBauturaRacoritoare() {
		return bauturaRacoritoare;
	}



	public boolean isMuzicaAmbientala() {
		return muzicaAmbientala;
	}



	public String getGenMuzica() {
		return genMuzica;
	}



	public int getCodRezervare() {
		return codRezervare;
	}

	public static RezervareBuilder builder() {
		// TODO Auto-generated method stub
		return new RezervareBuilder();
	}

	public static class RezervareBuilder implements IBuillder
	{
		private boolean mancareInclusa;
		private boolean scaunErgonomic;
		private boolean bauturaRacoritoare;
		private boolean muzicaAmbientala;
		private String genMuzica;
		private int codRezervare;
		
		
		
		
		public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
			this.mancareInclusa = mancareInclusa;
			return this;
		}





		public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
			this.scaunErgonomic = scaunErgonomic;
			return this;
		}





		public RezervareBuilder setBauturaRacoritoare(boolean bauturaRacoritoare) {
			this.bauturaRacoritoare = bauturaRacoritoare;
			return this;
		}





		public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
			this.muzicaAmbientala = muzicaAmbientala;
			return this;
		}





		public RezervareBuilder setGenMuzica(String genMuzica) {
			this.genMuzica = genMuzica;
			return this;
		}



		public RezervareBuilder setCodRezervare(int codRezervare) {
			this.codRezervare = codRezervare;
			return this;
		}



		@Override
		public Rezervare build() {
			// TODO Auto-generated method stub
			return new Rezervare(this);
		}

	

	}

	@Override
	public String toString() {
		return "Rezervare [mancareInclusa=" + mancareInclusa + ", scaunErgonomic=" + scaunErgonomic
				+ ", bauturaRacoritoare=" + bauturaRacoritoare + ", muzicaAmbientala=" + muzicaAmbientala
				+ ", genMuzica=" + genMuzica + ", codRezervare=" + codRezervare + "]";
	}
	
	
	
	

}
