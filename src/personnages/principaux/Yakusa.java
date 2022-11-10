package personnages.principaux;

import personnages.Humain;

public class Yakusa extends Humain {

	private String clan;
	private int reputation;

	public Yakusa(String nom, int argent, String boisson, int reputation) {
		super(nom, argent, boisson);
		// TODO Auto-generated constructor stub
		this.clan = "yakuza";
		this.reputation = 0;
	}

	public void extorquer(Commercant commercant) {
		this.gagnerArgent(commercant.getArgent());
		commercant.seFaireExtorquer();
		this.reputation++;
		this.parler("Je viens de voler l'argent d'un commercant");
	}

	public void perdre() {

		this.perdreArgent(getArgent());
		this.reputation--;
		this.parler("J'ai perdu un duel face à un Ronin");

	}

	public void gagner() {

		this.reputation++;
		this.parler("J'ai gagner un duel face à un Ronin");

	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

}
