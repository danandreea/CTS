package ro.ase.cts.Composite.classes;

public interface IOptiuniMeniu {
	void adaugaNod(IOptiuniMeniu optiune) throws Exception;
	void stergeNod(IOptiuniMeniu optiune);
	IOptiuniMeniu getNod(int index);
	void descriere();
	

}
