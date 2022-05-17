package ca.uqam.inf2120.exemplesvusenclasse.classeobjet.tests;

import ca.uqam.inf2120.exemplesvusenclasse.classeobjet.Personne;
import ca.uqam.inf2120.exemplesvusenclasse.classeobjet.Voiture;


/**
 * Test de la classe Personne
 * Date : Janvier 2014
 * @author Ismael Doukoure
 * @version 1.0
 *
 */
public class ProgrammePrincipal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	   Voiture voiture = new Voiture("Mazda Tribute", "Rouge Feu  Métallisé", 2005, 4);
	   
		// Créer et afficher l'objet personneUn
		Personne personneUn = new Personne("Heraux", "Daniel", 101, voiture);
		System.out.println( personneUn); //.afficher();
		
		// Créer et afficher l'objet personneDeux
		Personne personneDeux = new Personne("Diané", "Mamady", 89);
		personneDeux.afficher();
		

	}

}
