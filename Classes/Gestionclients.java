public class Gestionclients {
   private Client[] clients;
   private static int nbrclients = 0;
   private String[][] historiqueInteractions;
   private String[][] demandes;
   private String[][] preferences;
   public Gestionclients(int capacityclients, int capacityinteraction,int capacitydemandes, int capacitypreferences){
    this.clients = new Client[capacityclients];
    this.historiqueInteractions = new String[capacityclients][capacityinteraction];
    this.demandes = new String[capacityclients][capacitydemandes];
    this.preferences = new String[capacityclients][capacitypreferences];
   }
   public void ajouterclient(String nom, String prenom, String type, String email, String telephone){
    if(Gestionclients.nbrclients < clients.length){
        Client nouveauclient = new Client(nom, prenom, type, email, telephone);
        clients[Gestionclients.nbrclients] = nouveauclient;
        Gestionclients.nbrclients++;
    }
    else{
        System.out.println("La capacité est pleine");
    }
   }
   public void modifierclient(String ancienNom, String nouveauNom, String nouveauPrenom, String nouveauType, String nouvelEmail, String nouveauTelephone){
    for(int i=0; i<Gestionclients.nbrclients; i++){
        if(clients[i].getNom().equals(ancienNom)){
            clients[i].setNom(nouveauNom);
            clients[i].setPrenom(nouveauPrenom);
            clients[i].setType(nouveauType);
            clients[i].setEmail(nouvelEmail);
            clients[i].setTelephone(nouveauTelephone);
            System.out.println("Le client " + ancienNom + " a bien été modifié");
            return;
        }
    }
    System.out.println("Le client avec le nom spécifié n'a pas été trouvé.");
   }
   public void supprimerclient(String nom){
    for(int i=0; i<Gestionclients.nbrclients; i++){
        if(clients[i].getNom().equals(nom)){
            for(int j = i ; j<Gestionclients.nbrclients; j++){
                clients[j] = clients[j+1];
        }
        Gestionclients.nbrclients--;
        System.out.println("Le client " + nom + " a bien été supprimé");
            return;
        }
        System.out.println("Le client avec le nom spécifié n'a pas été trouvé.");
    }
    System.out.println("Le client avec le nom spécifié n'a pas été trouvé.");
   }
   public void afficherclients(){
    for(int i = 0; i < Gestionclients.nbrclients; i++){
        System.out.println("client " +(i+1));
        clients[i].afficherclient();
    }
    
    }
    public void ajouterInteraction(int indexClient, String interaction) {
        if (indexClient >= 0 && indexClient < Gestionclients.nbrclients) {
            for (int i = 0; i < historiqueInteractions[indexClient].length; i++) {
                if (historiqueInteractions[indexClient][i] == null) {
                    historiqueInteractions[indexClient][i] = interaction;
                    return;
                }
            }
            System.out.println("L'historique des interactions est plein pour ce client.");
        } else {
            System.out.println("Index de client invalide.");
        }
    }
    public void ajouterDemande(int indexClient, String demande) {
        if (indexClient >= 0 && indexClient < Gestionclients.nbrclients) {
            for (int i = 0; i < demandes[indexClient].length; i++) {
                if (demandes[indexClient][i] == null) {
                    demandes[indexClient][i] = demande;
                    return;
                }
            }
            System.out.println("Le tableau des demandes est plein pour ce client.");
        } else {
            System.out.println("Index de client invalide.");
        }
    }
    
    public void ajouterPreference(int indexClient, String preference) {
        if (indexClient >= 0 && indexClient < Gestionclients.nbrclients) {
            for (int i = 0; i < preferences[indexClient].length; i++) {
                if (preferences[indexClient][i] == null) {
                    preferences[indexClient][i] = preference;
                    return;
                }
            }
            System.out.println("Le tableau des préférences est plein pour ce client.");
        } else {
            System.out.println("Index de client invalide.");
        }
    }
    public void afficherInteractionsClient(int indexClient) {
        if (indexClient >= 0 && indexClient < Gestionclients.nbrclients) {
            System.out.println("Historique des interactions pour le client " + clients[indexClient].getNom() + " " + clients[indexClient].getPrenom() + ":");
            for (String interaction : historiqueInteractions[indexClient]) {
                if (interaction != null) {
                    System.out.println("- " + interaction);
                }
            }
        } else {
            System.out.println("Index de client invalide.");
        }
    }
    
    public void afficherDemandesClient(int indexClient) {
        if (indexClient >= 0 && indexClient < Gestionclients.nbrclients) {
            System.out.println("Demandes pour le client " + clients[indexClient].getNom() + " " + clients[indexClient].getPrenom() + ":");
            for (String demande : demandes[indexClient]) {
                if (demande != null) {
                    System.out.println("- " + demande);
                }
            }
        } else {
            System.out.println("Index de client invalide.");
        }
    }
    
    public void afficherPreferencesClient(int indexClient) {
        if (indexClient >= 0 && indexClient < Gestionclients.nbrclients) {
            System.out.println("Préférences pour le client " + clients[indexClient].getNom() + " " + clients[indexClient].getPrenom() + ":");
            for (String preference : preferences[indexClient]) {
                if (preference != null) {
                    System.out.println("- " + preference);
                }
            }
        } else {
            System.out.println("Index de client invalide.");
        }
    }
    public void afficherToutesInteractionsClients() {
        System.out.println("Historique des interactions pour tous les clients :");
        for (int i = 0; i < Gestionclients.nbrclients; i++) {
            afficherInteractionsClient(i);
        }
    }
    
    public void afficherToutesDemandesClients() {
        System.out.println("Demandes pour tous les clients :");
        for (int i = 0; i < Gestionclients.nbrclients; i++) {
            afficherDemandesClient(i);
        }
    }
    
    public void afficherToutesPreferencesClients() {
        System.out.println("Préférences pour tous les clients :");
        for (int i = 0; i < Gestionclients.nbrclients; i++) {
            afficherPreferencesClient(i);
        }
    }

}
