public class GestionAgenceImmobiliere {
    public static void main(String[] args) {

        // Création de quelques agents immobiliers avec une capacité de 10 biens
        Agentimmobilier agent1 = new Agentimmobilier("Jean", 10);
        Agentimmobilier agent2 = new Agentimmobilier("Marie", 10);

        // Attribution des biens aux agents
        agent1.ajouterbien("Maison", 200.0, 250000.0, "Paris", "Belle maison avec jardin");
        agent1.ajouterbien("Appartement", 80.0, 120000.0, "Lyon", "Appartement lumineux en centre-ville");
        agent2.ajouterbien("Maison", 200.0, 250000.0, "Paris", "Belle maison avec jardin");
        agent2.ajouterbien("Appartement", 80.0, 120000.0, "Lyon", "Appartement lumineux en centre-ville");

        // Affichage des biens de chaque agent
        agent1.afficherBienAgent();
        agent2.afficherBienAgent();
    }
}
