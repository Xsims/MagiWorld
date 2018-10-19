package com.ocr.simon;

import com.ocr.simon.classe.Personnage;

import java.util.Scanner;

class Combat {

    /**
     * Méthode appelée à chaque tour pour attaquer
     *
     * @param joueurAttaquant - Attaquant
     * @param joueurAttaque - Defenseur
     */
    void combat(Personnage joueurAttaquant, Personnage joueurAttaque){

        //Demande le type d'attaque
        Scanner scanner = new Scanner(System.in);
        System.out.println(joueurAttaquant.getNom() + " (" + joueurAttaquant.getVitalite()+ " vitalité) veuillez choisir votre action ( 1: Attaque Basique" +
                " 2: Attaque Speciale");

        int typeAttaque = scanner.nextInt();

        switch (typeAttaque) {
            case 1:
                joueurAttaquant.attaqueBasique(joueurAttaque);
                break;
            case 2:
                joueurAttaquant.attaqueSpeciale(joueurAttaque);
                break;
            default:
        }

    }
}
