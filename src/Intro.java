import eko.*;

public class Intro {

    public static void main(String[] args) {
        intro();
    }

    public static void intro(){
        EKO.initialiser("Glitch Runner", 31, 21);
        EKOConsole.couleurFond(EKOCouleur.NOIR);
        EKOConsole.couleurTexte(EKOCouleur.VERT);
        EKOConsole.rendre(); // rafraîchit l’écran
    }
}