import java.util.Date;
public class Gestiondestransactions {
    private String type;
    private Bienimmobilier bien; 
    private Client client; 
    private double montant; 
    private Date date; 
    private String contrat; 
    private Echeance[] echeances; 
    private int nombreEcheances;

    public Gestiondestransactions(String type, Bienimmobilier bien, Client client,String contrat, double montant, Date date, int capacityecheances) {
        this.type = type;
        this.bien = bien;
        this.client = client;
        this.montant = montant;
        this.date = date;
        this.contrat = contrat;
        this.nombreEcheances = 0;
        this.echeances = new Echeance[capacityecheances];
    }


    public void setBien(Bienimmobilier bien) {
        this.bien = bien;
    }
  public void setClient(Client client) {
      this.client = client;
  }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public void setNombreEcheances(int nombreEcheances) {
        this.nombreEcheances = nombreEcheances;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setContrat(String contrat) {
        this.contrat = contrat;
    }
    public Bienimmobilier getBien() {
        return bien;
    }
    public Client getClient() {
        return client;
    }
    public Date getDate() {
        return date;
    }
    public double getMontant() {
        return montant;
    }
    public int getNombreEcheances() {
        return nombreEcheances;
    }
    public String getType() {
        return type;
    }
public String getContrat() {
    return contrat;
}
public void ajouterecheance(double montant, Date dateEcheance){
    if (nombreEcheances < echeances.length){
        Echeance nouvellEcheance = new Echeance(montant, dateEcheance);
        echeances[nombreEcheances] = nouvellEcheance;
        nombreEcheances++;
    }
    else {
        System.out.println("La taille de l'array est pleine");
    }
}
public void genererContrat() {
    System.out.println("Contrat de Transaction\n");
    System.out.println("Type de transaction : " + type);
    System.out.println("Bien immobilier : " + bien.getDescription());
    System.out.println("Client : " + client.getNom());
    System.out.println("Montant : " + montant);
    System.out.println("Date : " + date.toString());
    System.out.println("Contrat : " + contrat);
    if(nombreEcheances > 0){
        for(int i=0; i<nombreEcheances;i++){
            System.out.println("Echeance : " + echeances[i].getMontant());
            System.out.println("Date : " + echeances[i].getDate());
        }
    }
}
}
