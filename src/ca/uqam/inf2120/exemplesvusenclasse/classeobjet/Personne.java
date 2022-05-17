package ca.uqam.inf2120.exemplesvusenclasse.classeobjet;

/**
 *  Titre : Retour sur le concept de classe
 * 	Description: Classe Personne repr�sente une personne avec les attributs
 * 	suivants : le nom, le pr�nom et l'�ge.
 * 	UQAM - INF2120
 * @author Ismael Doukoure
 * @version Janvier 2014
 */

public  class  Personne {

	// D�claration des constantes
	// Chaque constante de classe est partag�e entre toutes les instances
	// Chaque constante est invariable (final pas modifiable)
	final static String DESCRPTION_PRENOM = "\n Pr�nom  : ";
	final static String DESCRPTION_NOM = "\n Nom     : ";
	final static String DESCRPTION_AGE = "\n �ge     : ";
	final static String DESCRPTION_NB_PERSONNES_CREES = "\n Nombre de personnes cr��es : ";
	
	private static int nbPersonnesCreees = 0;
	
	// les variables d'instance sont g�n�r�es pour chaque
	// chaque objet de la classe
	private String nom; // Nom de la personne
	private String prenom; // Pr�nom de la personne
	private int age;
	private Voiture voiture;

	/**
	 * Constructeur sans argument. Permet d'initialiser les attributs aux
	 * valeurs par d�faut
	 */
	public Personne() {
		nbPersonnesCreees++;

	}

	
	/**
	 * Permet d'initialiser les attributs pr�nom, et nom
	 * 
	 * @param prenom Pr�nom de la personne
	 * @param nom Nom de la personne
	 */
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		nbPersonnesCreees++;
	}
	
	/**
    * Permet d'initialiser les attributs pr�nom, et nom
    * 
    * @param prenom Pr�nom de la personne
    * @param nom Nom de la personne
    */
   public Personne(String nom, String prenom, int age, Voiture v) {
      this.nom = nom;
      this.prenom = prenom;
      this.age = age;
      nbPersonnesCreees++;
      voiture = v;
   }

	/**
	 * Permet d'initialiser ou modifier le nom
	 * 
	 * @param nom
	 *            Nom de la personne
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Permet d'initialiser ou modifier le pr�mon
	 * 
	 * @param prenom Pr�nom de la personne
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Permet d'initialiser ou modifier l'�ge
	 * 
	 * @param age �ge de la personne
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Obtenir le pr�nom de la personne.
	 * 
	 * @return Le pr�nom de la personne
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Obtenir le nom de la personne.
	 * 
	 * @return Le nom de la personne
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Obtenir l'�ge de la personne.
	 * 
	 * @return L'�ge de la personne
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Obtenir les attributs de l'instance courante(pr�nom, nom, age)
	 * 
	 * @return le pr�nom et le nom
	 */
	public String toString() {
		return (DESCRPTION_PRENOM + getPrenom() + DESCRPTION_NOM + getNom()
				+ DESCRPTION_AGE + getAge() + DESCRPTION_NB_PERSONNES_CREES + nbPersonnesCreees ) 
		      + "\n " + (voiture == null ? "" : voiture.toString());
	}
	
	/**
	 * Afficher les informations de l'instance courante(pr�nom, nom, age) et la variable
	 * de classe n
	 * 
	 */
	public void afficher() {
		System.out.print(this);
	}

} // fin de la classe Personne

