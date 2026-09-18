package hei.school.rattrapage;

public class BasVetement extends Vetement{
    private int tourTaille;

    public BasVetement(String nom, Taille taille, double prix, Matiere matiere, int tourTaille) {
        super(nom, taille, prix, matiere);
        this.tourTaille = tourTaille;
    }

    public int getTourTaille() {
        return tourTaille;
    }

    public void setTourTaille(int tourTaille) {
        this.tourTaille = tourTaille;
    }
    public String getDescription() {
        return "Nom : " + getNom()
                + " | montant = " + getPrix()
                + " | matiere = " + getMatiere()
                + " | taille  = " +  getTaille()
                + " | tourTaille = " + getTourTaille();

    }
}
