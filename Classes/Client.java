public class Client {
    private String nom;
    private String prenom;
    private String type; // Acheteur, locataire, vendeur, bailleur, etc.
    private String email;
    private String telephone;
    // Ajoutez d'autres attributs selon les besoins

    public Client(String nom, String prenom, String type, String email, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.type = type;
        this.email = email;
        this.telephone = telephone;
    }

    // Ajoutez les getters et setters pour tous les attributs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public void afficherclient(){
        System.out.println(nom);
        System.out.println(prenom);
        System.out.println(type);
        System.out.println(email);
        System.out.println(telephone);
    }
}
