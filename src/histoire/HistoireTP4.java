package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain ("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant marco = new Commercant("Marco","thé",0);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza noir = new Yakuza("Yaku Le Noir","sake",30,0,"Warsong");
		noir.extorquer(marco);
		Ronin roro = new Ronin("Roro","shochu",60,1);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(noir);
	}
}
