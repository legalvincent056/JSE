package metier;
/**
 * Classe personne qui sert � d�finir
 * une personne
 * @author Stagiaire
 *@version 1.0
 */
public class Personne {
	
	private String nom;				//attributs
	private String prenom;
	private int age;
	
	/**
	 * Premi�re m�thode constructeur personne
	 * @param nom : nom de la personne
	 * @param prenom: prenom de la personne
	 * @param age: age de la personne
	 */
		
	public Personne(String nom, String prenom, int age) { // cr�ation constructeur Source-> Generate constructor fields
		super();											//Constructeur n�2 avec 3 variables
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}	
	
	/**
	 * Deuxi�me m�thode constructeur personne
	 * @param nom : nom de la personne
	 * @param prenom : prenom de la personne
	 */
	
	public Personne(String nom, String prenom) { //Constructeur n�3 avec 2 variables
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Troisi�me m�thode constructeur personne sans argument
	 * 
	 * */
		
	//Constructeur sans argument. Existe par defaut, sauf si constructeur avec argument cr�e
	public Personne() {
		super();
	}
	
	/**
	 * Getter de l'attribut Nom
	 * @return nom de la personne
	 */
	
	public String getNom() {
		return nom;
	}

	/**Setter de l'attribut Nom
	 * 
	 * @param nom: nom de la personne
	 */
	public void setNom(String nom) { //nom (argument) utilis� dans la m�thode setNom
		this.nom = nom;
	}
	
	/**
	 * Getter de l'attribut Pr�nom
	 * @return pr�nom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Setter de l'attribut Pr�nom
	 * @param prenom : pr�nom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * Getter de l'attribue Age
	 * @return: age de la personne
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Setter de l'attribue Age
	 * @param age : age de la personne
	 */
	public void setAge(int age) {
		this.age = age;
	}


/**
 * M�thode d'affichage de constructeur Personne
 */

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	

}
