package ro.ase.cts.Observer.classes;

public interface Subiect {

	
	void aboneazaClient(Observer observer);
	void dezaboneazaClient(Observer observer);
	void trimiteMesaj(String mesaj);
}
