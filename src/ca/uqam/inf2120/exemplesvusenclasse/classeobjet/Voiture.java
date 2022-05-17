package ca.uqam.inf2120.exemplesvusenclasse.classeobjet;

/**
 * I N F 1 1 2 0
 *
 * Classe Voiture : Cette classe contient les informations communes aux Voitures
 * et les méthodes pour accéder ou pour modifier ces informations.
 * 
 * @author Moussa Abdenbi / Ismael Doukoure
 * @version 21 novembre 2016
 *
 * abdenbi.moussa@courrier.uqam.ca / ismael.doukoure@uqam.ca
 */

public class Voiture {

    // variable(s) de classe
    private String marque;
    private String couleur;
    private int anneeFabrication;
    private int nbPortes;

    /**
     * Constructeur sans argument. il permet d'initialiser les attributs aux
     * valeurs par défaut
     */
    public Voiture(){
    }
    
    /**
	 * Permet d'initialiser les attributs la marque, la couleur, l'année de fabrication,
	 * et le nombre de portes d'une voiture.
	 * 
     * @param marque la marque
	 * @param couleur la couleur 
	 * @param anneeFabrication l'année de fabrication 
	 * @param nbPortes le nombre de portes
	 */
    public Voiture(String marque, String couleur, int anneeFabrication, int nbPortes){
        this.marque = marque;
        this.couleur = couleur;
        this.anneeFabrication = anneeFabrication;
        this.nbPortes = nbPortes;
    }

    /**
	 * Retourne la marque
	 * 
	 * @return marque
	 */
    public String getMarque() {
        return marque;
    }

    /**
	 * Modifie la marque 
	 * 
	 * @param marque 
	 */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
	 * Retourne la couleur
	 * 
	 * @return couleur
	 */
    public String getCouleur() {
        return couleur;
    }

    /**
	 * Modifie la couleur 
	 * 
	 * @param couleur 
	 */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    /**
	 * Retourne l'année de fabrication
	 * 
	 * @return anneeFabrication
	 */
    public int getAnnee() {
        return anneeFabrication;
    }

    /**
	 * Modifie l'année de fabrication 
	 * 
	 * @param couleur 
	 */
    public void setAnnee(int anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
    }

    /**
	 * Retourne le nombre de portes
	 * 
	 * @return nbPortes
	 */
    public int getNbPortes() {
        return nbPortes;
    }

    /**
	 * Modifie le nombre de portes 
	 * 
	 * @param nbPortes
	 */
    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }

    /**
	 * Affiche toutes les informations (attributs) de l'objet 
	 * 
	 */
    public void afficherInformations() {
        System.out.println("Informations de la voiture : ");
        System.out.println("  Marque : " + marque);
        System.out.println("  Couleur : " + couleur);
        System.out.println("  Année de fabrication : " + anneeFabrication);
        System.out.println("  Nombre de portes : " + nbPortes);
    }

   @Override
   public String toString() {
      return "Voiture [marque=" + marque + ", couleur=" + couleur + ", anneeFabrication=" + anneeFabrication
            + ", nbPortes=" + nbPortes + "]";
   }
    
   

} // Voiture
