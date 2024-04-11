import java.util.Date;
public class Echeance {
    private double montant; // Montant de l'échéance
    private Date date; // Date de l'échéance

    // Constructeur
    public Echeance(double montant, Date date) {
        this.montant = montant;
        this.date = date;
    }

    // Getters et setters pour les attributs
    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
