package entity;

public class Client {
	private String prenom;
	private String nom;
	private String mailClient;
	private String mdpClient;
	
	public Client(String nom, String prenom, String mail, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.mailClient = mail;
		this.mdpClient = mdp;
	}

	public String getMailClient() {
		return mailClient;
	}

	public String getMdpClient() {
		return mdpClient;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public boolean connecterClient(String mdp) {
		return mdp.equals(this.mdpClient);
	}
}
