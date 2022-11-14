package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav, int argent, int honneur) {
		super(nom, boissonFav, argent);
		this.honneur = honneur;
	}
	
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		setArgent(perdreArgent(don));
		parler(beneficiaire.getNom() + ", prend ces " + don +  " sous.");
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			setArgent(gagnerArgent(adversaire.getArgent()));
			adversaire.perdre();
			honneur += 1;
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			setArgent(perdreArgent(getArgent()));
			honneur -= 1;
		}
	}
}
