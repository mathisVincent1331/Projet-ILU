package entity;


public class CarnetClientel {
	private Client[] carnetClient;
	private int nbClient = 0;

	public CarnetClientel() {
		this.carnetClient = new Client[30];
	}
	
	public int estClient(String mail) {
		int numClient = -1;
		boolean clientTrouve = false;
		int i=0;
		
		while ((i<nbClient) && !clientTrouve) {
			String mailToCompare = carnetClient[i].getMailClient();
			if (mail.equals(mailToCompare)) {
				numClient = i;
				clientTrouve = true;
			}
			i++;
		}
		
		return numClient;
	}
	
	public int ajouterClient(String nom, String prenom, String mail, String mdp) {
		Client clt = new Client(nom, prenom, mail, mdp);
		if (estClient(mail) != -1) {
			return -1;
		}
		carnetClient[nbClient] = clt;
		nbClient ++;
		return 0;
	}

	public boolean connecterClient(int numClient, String mdp) {
		return carnetClient[numClient].connecterClient(mdp);
	}

}
