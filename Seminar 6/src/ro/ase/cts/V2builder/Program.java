package ro.ase.cts.V2builder;

public class Program {

	public static void main(String[] args) {
		
		
		Builder builder1=new Builder();
		builder1.setBauturaRacoritoare(true);
		Rezervare rezervare1=builder1.build();
		
	
		System.out.println(rezervare1.toString());
		
		Builder builder2=new Builder(2);
		builder2.setMancareInclusa(true);
		Rezervare rezervare2=builder2.build();
		
	
		System.out.println(rezervare2.toString());
		
		
	}

}
