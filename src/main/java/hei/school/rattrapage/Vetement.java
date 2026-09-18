package hei.school.rattrapage;

public class Vetement {
    private String nom;
    private Taille taille;
    private double prix;
    private Matiere matiere;

    public Vetement(String nom, Taille taille, double prix, Matiere matiere) {
        this.nom = nom;
        this.taille = taille;
        this.prix = prix;
        this.matiere = matiere;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
    public String getDescription() {
        return "Nom : " + getNom()
                + " | montant = " + getPrix()
                + " | matiere = " + getMatiere()
                + " | taille  = " +  getTaille();

    }

}
