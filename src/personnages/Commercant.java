package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	
	public void seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
	}
	
	public void recevoir(int don) {
		setArgent(getArgent() + gagnerArgent(don));
		parler(don + " sous ! Je te remercie généreux donateur!");
	}
}
