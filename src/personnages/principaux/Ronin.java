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
		boolean gagner = false;
		if(gagner) {
			
		}else {
			
		}
	}

	public int getHonneur() {
		return honneur;
	}

	public void setHonneur(int honneur) {
		this.honneur = honneur;
	}

}
