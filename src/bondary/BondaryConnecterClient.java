package bondary;

import java.util.Scanner;

import controler.ControlConnecterClient;

public class BondaryConnecterClient {
	private ControlConnecterClient controlConnecterClient;
	private Scanner scan = new Scanner(System.in);
	
	public BondaryConnecterClient(ControlConnecterClient controlConnecterClient) {
		this.controlConnecterClient = controlConnecterClient;
	}
	
	public boolean connecterClient() {
		System.out.println("Veuillez saisir votre mail : ");
		String mailClient = scan.next();
		
		System.out.println("Veuillez saisir votre mot de passe : ");
		String mdpClient = scan.next();
		
		int numClient = controlConnecterClient.connecterClient(mailClient, mdpClient);
		
		if (numClient != -1) {
			System.out.println("Vous êtes connecté !\n");
			return true;
		} else {
			System.out.println("Votre mail ou votre mot de passe est erroné...\n");
			return false;
		}
	}
}
