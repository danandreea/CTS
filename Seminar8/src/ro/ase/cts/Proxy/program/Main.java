package ro.ase.cts.Proxy.program;

import ro.ase.cts.Proxy.classes.IRezervare;
import ro.ase.cts.Proxy.classes.ProxyRezervare;
import ro.ase.cts.Proxy.classes.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		IRezervare rezervarePentruDouaPersoane=new Rezervare(3,2);
		rezervarePentruDouaPersoane.anuntaRezervare();
		
		ProxyRezervare proxy=new ProxyRezervare((Rezervare)rezervarePentruDouaPersoane);
		proxy.anuntaRezervare();
		
		((Rezervare)rezervarePentruDouaPersoane).setNrPersoane(4);
		proxy.anuntaRezervare();
	}

}
