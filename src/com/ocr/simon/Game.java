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

        int classe = -1;
        int lvl = -1;
        int force = -1;
        int intell = -1;
        int agi = -1;

        Personnage perso = null;

        Scanner scanner = new Scanner(System.in);
        while(classe < 1 || classe > 3) {
        System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage)");
        classe = scanner.nextInt(); }
        while(lvl < 1){
        System.out.println("Niveau du personnage ?");
        lvl = scanner.nextInt();}
        while(force < 0){
        System.out.println("Force du personnage ?");
        force = scanner.nextInt();}
        while(intell < 0){
        System.out.println("Intelligence du personnage ?");
        intell = scanner.nextInt();}
        while(agi < 0){
        System.out.println("Agilité du personnage ?");
        agi = scanner.nextInt();}

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

    public void combat(Personnage joueurAttaquant, Personnage joueurAttaque){

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
