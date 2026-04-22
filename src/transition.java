import eko.*;

public class transition  {
public static EKOSon SONORE= EKOAudio.charger("Fichier\\623406__nlux__yp-plague-databurst-010.wav");
    public static void main(String[] args) {
        transition();
    }

    public static void transition(){
        EKO.initialiser("Glitch Runner : Trap Protocol", 31, 21);
        EKOConsole.icone( "src/ImagesUtiles/GlitchRunner_icone.png");
        EKOConsole.couleurFond(EKOCouleur.GRIS_FONCE);
        EKOConsole.afficher(6,9, "Intrusion détectée !", EKOCouleur.ROUGE);
        EKOAudio.jouer(SONORE);

    }
}


