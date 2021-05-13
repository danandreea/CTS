package ro.ase.cts.Template.main;

import ro.ase.cts.Template.classes.Spectator;
import ro.ase.cts.Template.classes.SpectatorPeluza;

public class Program {
	public static void main(String[] args) {
		Spectator spectator=new Spectator();
		
		spectator.intrareSpectatorPeStadion();
		
		SpectatorPeluza spectatorPeluza=new SpectatorPeluza();
		spectatorPeluza.intrareSpectatorPeStadion();
	}
}
