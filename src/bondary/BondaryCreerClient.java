package bondary;

import java.util.Scanner;

import controler.ControlCreerClient;

public class BondaryCreerClient {
	private ControlCreerClient controlCreerClient;
	private Scanner scan = new Scanner(System.in);
	
	public BondaryCreerClient(ControlCreerClient controlCreerClient) {
		this.controlCreerClient = controlCreerClient;
	}
	
	public boolean creerCompteClient() {
		System.out.println("Votre nom :");
		String nom = scan.next();
		
		System.out.println("Votre prénom :");
		String prenom = scan.next();
		
		System.out.println("Votre adresse mail :");
		String mail = scan.next();
		
		String mdp;
		String mdpConfirm;
		do{
			System.out.println("Votre mot de passe :");
			mdp = scan.next();
			
			System.out.println("Votre mot de passe :");
			mdpConfirm = scan.next();
		} while (!(mdp.equals(mdpConfirm)));
		
		if (!controlCreerClient.creerCompteClient(nom, prenom, mail, mdp)) {
			System.out.println("Votre création de compte à échoué.\n");
			return false;
		} else {
			System.out.println("Votre compte à bien été crée " + prenom);
			return true;
		}
	}
}
