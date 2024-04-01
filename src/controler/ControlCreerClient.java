package controler;

import entity.CarnetClientel;

public class ControlCreerClient {
	private CarnetClientel clientel;
	
	public ControlCreerClient(CarnetClientel clientel) {
		this.clientel = clientel;
	}
	
	public boolean creerCompteClient(String nom, String prenom, String mail, String mdp) {
		int numClient = clientel.ajouterClient(prenom, nom, mail, mdp);
		if (numClient == -1) {
			System.out.println("Votre mail est déjà associé à un compte client\n");
		}
		return numClient == 0 ;
	}
}
