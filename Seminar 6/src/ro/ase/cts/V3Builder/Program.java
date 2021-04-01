package ro.ase.cts.V3Builder;



public class Program {

	public static void main(String[] args) {
	
		
		Rezervare rezervare=Rezervare.builder().setBauturaRacoritoare(true).build();
		System.out.println(rezervare.toString());
	}

}
