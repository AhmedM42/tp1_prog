import eko.*;

public class Intro {

    public static void main(String[] args) {
        intro();
    }

    public static void intro(){
        EKO.initialiser("Glitch Runner : Trap Protocol", 31, 21);
        EKOConsole.icone( "src/ImagesUtiles/GlitchRunner_icone.png");
        EKOConsole.couleurFond(EKOCouleur.GRIS_FONCE);
        EKOConsole.afficher(9,5, "Glitch Runner");
        EKOConsole.afficher(9,6, "Trap protocol", EKOCouleur.VERT);
        EKOConsole.afficher(15,10, "\u2501", EKOCouleur.VERT);
        EKOConsole.afficher(15,10, "\uE210");
        EKOConsole.afficher(16,10, "\u2501", EKOCouleur.VERT);
        EKOConsole.afficher(17,10, "\u2501", EKOCouleur.VERT);
        EKOConsole.afficher(18,10, "\uE1FB", EKOCouleur.JAUNE);

    }
}