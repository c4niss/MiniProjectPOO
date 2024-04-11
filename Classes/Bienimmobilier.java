public class Bienimmobilier {
    
    private String type ;
    private double taille;
    private double prix;
    private String localisation;
    private String description;

    public Bienimmobilier(String type, double taille, double prix, String localisation, String description) {
        this.type = type;
        this.taille = (taille < 0) ? 0 : taille;
        this.prix = (prix < 0) ? 0 : prix;
        this.localisation = localisation;
        this.description = description;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setTaille(double taille) {
        this.taille = taille;
    }
    public double getTaille() {
        return taille;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public double getPrix() {
        return prix;
    }
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    public String getLocalisation() {
        return localisation;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public boolean chercherbien(double prixmin, double prixmax, String localisationrecherche, String typerecherche){
        if(prixmin <= prix && prixmax >= prix){
            if(this.localisation.equalsIgnoreCase(localisationrecherche)){
                if(this.type.equalsIgnoreCase(typerecherche)){
                    return true;
                }
            }
        }
        return false;
    }
    public void modifierbien(String type, double taille, double prix, String localisation, String description){
        if (type != null && !type.isEmpty()){
            this.setType(type);
        }
        if (taille > 0){
            this.setTaille(taille);
        }
        if (prix > 0){
            this.setPrix(prix);
        }
        if (localisation!= null &&!localisation.isEmpty()){
            this.setLocalisation(localisation);
        }
        if (description!= null &&!description.isEmpty()){
            this.setDescription(description);
        }
    }
    public void afficherbien(){
        System.out.println("Type : " + type);
        System.out.println("Taille : " + taille);
        System.out.println("Prix : " + prix);
        System.out.println("Localisation : " + localisation);
        System.out.println("Description : " + description + "\n");
    }
}
