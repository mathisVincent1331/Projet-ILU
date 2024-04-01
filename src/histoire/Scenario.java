package histoire;

import bondary.BondaryConnecterClient;
import bondary.BondaryCreerClient;
import bondary.BondaryOrienterUtilisateur;
import controler.ControlConnecterClient;
import controler.ControlCreerClient;
import entity.CarnetClientel;

public class Scenario {
	
	public static void main(String[] args) {
		CarnetClientel carnet = new CarnetClientel();
		ControlConnecterClient controlConnecterClient = new ControlConnecterClient(carnet);
		ControlCreerClient controlCreerClient = new ControlCreerClient(carnet);
		
		BondaryConnecterClient bondaryConnecterClient = new BondaryConnecterClient(controlConnecterClient);
		BondaryCreerClient bondaryCreerClient = new BondaryCreerClient(controlCreerClient);
		BondaryOrienterUtilisateur bondaryOrienterUtilisateur = new BondaryOrienterUtilisateur(bondaryConnecterClient, bondaryCreerClient);
		
		bondaryOrienterUtilisateur.menu();
	}
}
