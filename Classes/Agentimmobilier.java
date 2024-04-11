public class Agentimmobilier {
    private String name;
    private Bienimmobilier[] biensimmobilier;
    private int bienagent; 
    public Agentimmobilier(String name, int capacity) {
        this.name = name;
        this.bienagent = 0;
        this.biensimmobilier = new Bienimmobilier[capacity];
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Bienimmobilier[] getBiensimmobilier() {
        return biensimmobilier;
    }
    public void ajouterbien(String type, double taille, double prix, String localisation, String description){
        if(bienagent < biensimmobilier.length){
            // Création d'un nouveau bien immobilier
            Bienimmobilier nouveauBien = new Bienimmobilier(type, taille, prix, localisation, description);
            // Ajout du bien immobilier au tableau
            biensimmobilier[bienagent] = nouveauBien;
            bienagent++;
        }
        else{
            System.out.println("La capacité est pleine");
        }
    }
    public void afficherBienAgent() {
        System.out.println("Nom de l'agent : " + this.name);
        System.out.println("Biens immobiliers geres par l'agent :");
        for (int i = 0; i < bienagent; i++) {
            System.out.println("- Bien " + (i+1));
            if (biensimmobilier[i] != null) {
                biensimmobilier[i].afficherbien();
            }
        }
    }
}