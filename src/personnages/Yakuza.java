package personnages;

public class Yakuza extends Humain {
	
	private int reputation = 0;
	private String clan;
	
	public Yakuza(String nom, String boissonFav, int argent, int reputation, String clan) {
		super(nom, boissonFav, argent);
		this.reputation = reputation;
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}

	public String getClan() {
		return clan;
	}


	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		setArgent(gagnerArgent(victime.getArgent()));
		victime.seFaireExtorquer();
		reputation += 1;
		parler("J’ai piqué les " + victime.getArgent() + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + clan);
		setArgent(perdreArgent(getArgent()));
		return reputation -= 1;
	}
	
	public int gagner(int gain) {
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
		setArgent(gagnerArgent(gain));
		return reputation += 1;
	}
}
