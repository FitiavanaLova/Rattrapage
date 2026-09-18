package hei.school.rattrapage;

public class HautVetement extends Vetement{
    private Manche manche;

    public HautVetement(String nom, Taille taille, double prix, Matiere matiere,Manche manche) {
        super(nom,taille, prix,matiere);
        this.manche = manche;
    }

    public Manche getManche() {
        return manche;
    }

    public void setManche(Manche manche) {
        this.manche = manche;
    }
    public String getDescription() {
        return "Nom : " + getNom()
                + " | montant = " + getPrix()
                + " | matiere = " + getMatiere()
                + " | taille  = " +  getTaille()
                + " |manche = " + getManche();

    }
}
