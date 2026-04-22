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
    }
}
