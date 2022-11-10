package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {

	private int honneur;

	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
		// TODO Auto-generated constructor stub
		this.honneur = 1;
	}

	public void donnerArgentCommercant(Commercant commercant, int argent) {
		// retirer argent du Ronin
		this.perdreArgent(argent);
		// ajouter l'argent au commercant
		commercant.gagnerArgent(argent);
	}

	public void provoquerUnDuelYakusa(Yakusa yakusa) {

		// si l'honneur de Ronin*2 est supérieur à la réputation du Yakusa
		if (this.honneur * 2 > yakusa.getReputation()) {
			
			// prendre l'argent du yakusa
			this.gagnerArgent(yakusa.getArgent());
			yakusa.perdre();
			this.honneur++;
			this.parler("J'ai gagné au duel face à un Yakuza");
		} else {
			this.honneur--;
			this.parler("J'ai perdu au duel face à un Yakuza, la vie est terrible");
			yakusa.gagner();
		}
	}

	public int getHonneur() {
		return honneur;
	}

	public void setHonneur(int honneur) {
		this.honneur = honneur;
	}

}
