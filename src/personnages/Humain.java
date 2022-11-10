package personnages;

public class Humain {

	private String nom;
	private	int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		super();
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}
	
	public void gagnerArgent(int n) {
		this.argent=+n;
	}
	
	public void perdreArgent(int n) {
		this.argent=-n;
	}
	
	protected void parler(String texte) {
		String s = "";
		s += "(" + this.nom + ") - ";
		s += texte;
		System.out.println(s);
	}
	
	public void direBonjour() {
		
	}
	
}
