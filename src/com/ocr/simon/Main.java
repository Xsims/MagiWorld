package com.ocr.simon;

import com.ocr.simon.classe.Guerrier;
import com.ocr.simon.classe.Mage;
import com.ocr.simon.classe.Personnage;
import com.ocr.simon.classe.Rodeur;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String j1 = "Joueur 1";
        String j2 = "Joueur 2";

        System.out.println("Bienvenue à MagiWorld ! Un monde sanginaire où guerrier, rôdeur et magicien" +
                "s'affronte pour dominer le monde ! \n ");

        Game game = new Game();
        System.out.println("Création du personnage du Joueur 1");
        Personnage joueur1 = game.creation(j1);
        System.out.println("Création du personnage du Joueur 2");
        Personnage joueur2 = game.creation(j2);

        while(joueur1.getVitalite() > 0 || joueur2.getVitalite() > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(joueur1.getNom() + " (" + joueur1.getVitalite()+ " vitalité) veuillez choisir votre action ( 1: Attaque Basique" +
                    " 2: Attaque Speciale");

            int typeAttaque = scanner.nextInt();

            switch (typeAttaque) {
                case 1:
                    joueur1.attaqueBasique(joueur2);
                    break;
                case 2:
                    joueur1.attaqueSpeciale(joueur2);
                    break;
                default:
            }
            System.out.println(joueur2.getNom() + " (" + joueur2.getVitalite()+ " vitalité) veuillez choisir votre action ( 1: Attaque Basique" +
                    " 2: Attaque Speciale");

            typeAttaque = scanner.nextInt();

            switch (typeAttaque) {
                case 1:
                    joueur2.attaqueBasique(joueur1);
                    break;
                case 2:
                    joueur2.attaqueSpeciale(joueur1);
                    break;
                default:
            }

        }

        System.out.println("Le combat est terminé");


    }
}

