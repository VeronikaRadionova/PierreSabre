package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int argent;
	
	
	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.setArgent(argent);
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	
	public void parler(String texte) {
	    System.out.println("(" + nom + ") - " + texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav + ".");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (getArgent() >= prix) {
			parler("J'ai " + getArgent() + " sous en poche. Je vais pouvoir m'o ffrir " + bien + " à " + prix + " sous.");
			setArgent(perdreArgent(prix));
		} else {
			parler("Je n'ai plus que " + getArgent() + " sous en poche. Je ne peux même pas m'o ffrir" + bien + " à " + prix + " sous.");
		}
	}
	
	public int gagnerArgent(int gain) {
		return getArgent() + gain;
	}
	
	public int perdreArgent(int perte) {
		return getArgent() - perte;
	}


	public void setArgent(int argent) {
		this.argent = argent;
	}
	
}
