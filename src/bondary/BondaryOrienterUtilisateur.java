package bondary;

import java.util.Scanner;

public class BondaryOrienterUtilisateur {
	private BondaryConnecterClient bondaryConnecterClient;
	private BondaryCreerClient bondaryCreerClient;
	private Scanner scan = new Scanner(System.in);
	
	public BondaryOrienterUtilisateur(BondaryConnecterClient bondaryConnecterClient, 
			BondaryCreerClient bondaryCreerClient) {
		this.bondaryConnecterClient = bondaryConnecterClient;
		this.bondaryCreerClient = bondaryCreerClient;
	}
	
	public void menu() {
		int choixUtilisateur;
		do {
			StringBuilder question = new StringBuilder();
			question.append("Qui êtes-vous ?\n");
			question.append("1 - un Client\n");
			question.append("2 - un Employé\n");
			question.append("3 - quitter l'application");
			choixUtilisateur = Clavier.entrerEntier(question.toString());
			
			if (choixUtilisateur > 0 && choixUtilisateur < 3) {
				System.out.println("Quel est votre nom :");
				String nom = scan.next();
				switch (choixUtilisateur) {
				case 1:
					menuConnexionClient();
					break;
				case 2:
					menuEmploye();
					break;
				case 3:
					System.out.println("Sortie de l'application");
					System.out.println("Au revoir "+ nom);
					break;
				default:
					System.out.println(
							"Vous devez entrer un chiffre entre 1 et 3");
					break;
				}
			}
			
		} while (choixUtilisateur != 3);
	}
	
	public void menuConnexionClient() {
		int choixUtilisateur;
		do {
			StringBuilder question = new StringBuilder();
			question.append("1 - je souhaite créer un compte client.\n");
			question.append("2 - je souhaite me connecter à mon compte.\n");
			question.append("3 - quitter l'application.");
			choixUtilisateur = Clavier.entrerEntier(question.toString());
			switch (choixUtilisateur) {
			case 1:
				if (bondaryCreerClient.creerCompteClient()) {
					menuClient();
				}
				break;
			case 2:
				if (bondaryConnecterClient.connecterClient()) {
					menuClient();
				}
				break;
			case 3:
				System.out.println("Au revoir  très cher client ");
				break;
			default:
				System.out.println("Vous devez entrer un chiffre entre 1 et 3");
				break;
			}
			System.out.println();
		} while (choixUtilisateur != 3);
	}
	
	public void menuClient() {
		int choixUtilisateur;
		do {
			StringBuilder question = new StringBuilder();
			question.append("1 - je souhaite passer une commande.\n");
			question.append("2 - Me déconnecter.");
			choixUtilisateur = Clavier.entrerEntier(question.toString());
			switch (choixUtilisateur) {
			case 1:
				//bondaryCreerClient.creerCompteClient();
				break;
			case 2:
				System.out.println("Au revoir");
				break;
			default:
				System.out.println("Vous devez entrer un chiffre entre 1 et 2");
				break;
			}
			System.out.println();
		} while (choixUtilisateur != 2);
	}
	
	public void menuEmploye() {
		int choixUtilisateur;
		do {
			StringBuilder question = new StringBuilder();
			question.append("1 - je souhaite me connecter à mon compte employé.\n");
			question.append("2 - quitter l'application.");
			choixUtilisateur = Clavier.entrerEntier(question.toString());
			switch (choixUtilisateur) {
			case 1:
				//bondaryCreerClient.creerCompteClient();
				break;
			case 2:
				//bondaryConnecterClient.connecterClient();
				break;
			case 3:
				System.out.println("Au revoir Employé ");
				break;
			default:
				System.out.println("Vous devez entrer un chiffre entre 1 et 2");
				break;
			}
			System.out.println();
		} while (choixUtilisateur != 2);
	}
}
