package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, argent, "the");
		// TODO Auto-generated constructor stub
				
	}

	int seFaireExtorquer() {
		
		this.perdreArgent(getArgent());
		this.parler("Le monde est vraiment trop injuste");
		
		return 0;
	}
	
	int recevoir (int argent) {
		this.gagnerArgent(argent);
		this.parler("Merci beau gosse");

		return 0;
	}

}
