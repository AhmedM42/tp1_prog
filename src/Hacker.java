public class Hacker extends ObjetJeu implements Collisionnable {

    public Hacker(String nom, int x, int y) {
        super(nom, x, y, null);
    }

    @Override
    protected void mettreAJour(long deltaTemps) {

    }

    @Override
    protected void dessiner() {

    }

    @Override
    public void gererCollisionAvec(ObjetJeu autre) {
        // Logique de gestion de collision pour le Hacker
        System.out.println("Hacker " + getNom() + " a collisionné avec " + autre.getNom());
        // Par exemple, on pourrait réduire la santé du Hacker ou de l'autre objet
    }
}
