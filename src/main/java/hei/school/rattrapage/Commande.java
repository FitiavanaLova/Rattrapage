package hei.school.rattrapage;
import hei.school.rattrapage.Vetement;

import java.util.Date;

public class Commande {
    private String nom;
    private Date date;
    private String description;
    private String renseignement;
    private int quantite;

    public Commande(String nom, Date date, String description, String renseignement, int quantite) {
        this.nom = nom;
        this.date = date;
        this.description = description;
        this.renseignement = renseignement;
        this.quantite = quantite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRenseignement() {
        return renseignement;
    }

    public void setRengeignement(String rengeignement) {
        this.renseignement = rengeignement;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public String totalPrix() {
        int total = getPrix()* getQuantite();
        return total;
    }
}
