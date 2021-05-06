package ro.ase.cts.classes;

public class ContBancar {

	private String detinator;
	private float sumaCont;
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.sumaCont=0;
	}
	
	public void retragere(float suma)
	{
			if(this.sumaCont>=suma) 
				{System.out.println("A fost retrasa suma de " + suma+ " lei.");
				this.sumaCont=this.sumaCont-suma;
				}
				else System.out.println("Fonduri insuficiente.");	
	}
	
	public void depunere(float suma)
	{
		this.sumaCont=this.sumaCont+suma;
		System.out.println("A fost depusa in cont suma de " + suma+ " lei.");
	}
	
	public void constituire(float suma)
	{
		this.sumaCont=suma;
		System.out.println("Contul a fost constituit.");
	}
	
	
	
}
