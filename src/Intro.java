import eko.*;

public class Intro extends ObjetJeu{
    private String LIGNE_HORIZON = "\u2501";
    private String ICONE_ECRAN = "\uE1FB";

    public Intro(String nom, int x, int y) {
        super(nom, x, y, null);
    }

    @Override
    public void mettreAJour(long deltaTemps) {

    }

    @Override
    public void dessiner() {
        EKO.initialiser("Glitch Runner : Trap Protocol", 31, 21);
        EKOConsole.icone( "src/ImagesUtiles/GlitchRunner_icone.png");
        EKOConsole.couleurFond(EKOCouleur.GRIS_FONCE);
        EKOConsole.afficher(9,5, "Glitch Runner");
        EKOConsole.afficher(9,6, "Trap protocol", EKOCouleur.VERT);
        EKOConsole.afficher(15,10, "\u2501", EKOCouleur.VERT);
        EKOConsole.afficher(15,10, "\uE210");
        EKOConsole.afficher(16,10, LIGNE_HORIZON, EKOCouleur.VERT);
        EKOConsole.afficher(17,10, LIGNE_HORIZON, EKOCouleur.VERT);
        EKOConsole.afficher(18,10, ICONE_ECRAN, EKOCouleur.JAUNE);
    }
}