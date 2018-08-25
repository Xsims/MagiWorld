package com.ocr.simon;

import com.ocr.simon.classe.Guerrier;
import com.ocr.simon.classe.Mage;
import com.ocr.simon.classe.Personnage;
import com.ocr.simon.classe.Rodeur;

import java.util.Scanner;

public class Game {


    public Game() {
    }



    public Personnage creation(String nom){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage)");
        int classe = scanner.nextInt();
        System.out.println("Niveau du personnage ?");
        int lvl = scanner.nextInt();
        System.out.println("Force du personnage ?");
        int force = scanner.nextInt();
        System.out.println("Intelligence du personnage ?");
        int intell = scanner.nextInt();
        System.out.println("Agilité du personnage ?");
        int agi = scanner.nextInt();
        Personnage perso = null;

        switch (classe) {
            case 1:
                Personnage guerrier = new Guerrier(lvl, force, intell, agi, nom);
                perso = guerrier;
                break;
            case 2:
                Personnage rodeur = new Rodeur(lvl, force, intell, agi, nom);
                perso = rodeur;
                break;
            case 3:
                Personnage mage = new Mage(lvl, force, intell, agi, nom);
                perso = mage;
                break;
            default:
                System.out.println("Mauvais choix, veuillez réessayer");
        }

        return perso;

    }

}
