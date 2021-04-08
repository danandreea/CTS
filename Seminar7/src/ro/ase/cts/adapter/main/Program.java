package ro.ase.cts.adapter.main;

import ro.ase.cts.adapter.classes.AdapterCreditCls;
import ro.ase.cts.adapter.classes.AdapterCreditObj;
import ro.ase.cts.adapter.classes.InterfataCredit;
import ro.ase.cts.adapter.classes.Leasing;

public class Program {
	
	private static void oferaInfoCredit(InterfataCredit credit, String numeClient, float suma)
	{
		credit.acordaCredit(numeClient, suma);
	}

	public static void main(String[] args) {
		
		Leasing leasing=new Leasing();
		AdapterCreditObj adapter=new AdapterCreditObj(leasing);
		
		oferaInfoCredit(adapter, "Ionel", 230.56f);
		
		
		
		AdapterCreditCls adapterCredit=new AdapterCreditCls();
		oferaInfoCredit(adapterCredit, "Gigel", 322.43f);
	}

}
