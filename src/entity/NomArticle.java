package entity;

public enum NomArticle {
	BRIDE("Bride"), TUYAU("Tuyau"), ROBINET("Robinet");
	

	private NomArticle(String nom) {
		this.nom = nom;
	}
	
	private String nom;
	
	public String getNom() {
		return nom;
	}
}
