package metier;
/**
 * Classe personne qui sert à définir
 * une personne
 * @author Stagiaire
 *@version 1.0
 */
public class Personne {
	
	private String nom;				//attributs
	private String prenom;
	private int age;
	
	/**
	 * Première méthode constructeur personne
	 * @param nom : nom de la personne
	 * @param prenom: prenom de la personne
	 * @param age: age de la personne
	 */
		
	public Personne(String nom, String prenom, int age) { // création constructeur Source-> Generate constructor fields
		super();											//Constructeur n°2 avec 3 variables
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}	
	
	/**
	 * Deuxième méthode constructeur personne
	 * @param nom : nom de la personne
	 * @param prenom : prenom de la personne
	 */
	
	public Personne(String nom, String prenom) { //Constructeur n°3 avec 2 variables
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Troisième méthode constructeur personne sans argument
	 * 
	 * */
		
	//Constructeur sans argument. Existe par defaut, sauf si constructeur avec argument crée
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
	public void setNom(String nom) { //nom (argument) utilisé dans la méthode setNom
		this.nom = nom;
	}
	
	/**
	 * Getter de l'attribut Prénom
	 * @return prénom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * Setter de l'attribut Prénom
	 * @param prenom : prénom de la personne
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
 * Méthode d'affichage de constructeur Personne
 */

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	

}
