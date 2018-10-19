package com.ocr.simon;

import com.ocr.simon.classe.Guerrier;
import com.ocr.simon.classe.Mage;
import com.ocr.simon.classe.Personnage;
import com.ocr.simon.classe.Rodeur;

import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * The type Game.
 */
public class Game {


    int matchTermine = 1;

    public Game() {
        System.out.println("Bienvenue à MagiWorld ! Un monde sanginaire où guerrier, rôdeur et magicien" +
                "s'affronte pour dominer le monde ! \n ");

        String nomJoueur1 = "Joueur 1";
        String nomJoueur2 = "Joueur 2";

        Personnage joueur1 = this.configure(nomJoueur1);
        Personnage joueur2 = this.configure(nomJoueur2);

        String winner = this.combatAMort(joueur1, joueur2);

        System.out.println("Et le gagnant est... " + winner +  " !!! \n ");

    }

    public Personnage configure(String joueur){
        Initialisation initialisation = new Initialisation();
        joueur = initialisation.demanderNom(joueur);
        initialisation.demandeCaracJoueur();
        return initialisation.creation(joueur);
        }

    public String combatAMort(Personnage joueur1, Personnage joueur2) {
        String winner = "";
        Combat attaque = new Combat();

        while (matchTermine == 1) {

            if (joueur1.getVitalite() < 1) {
                System.out.println(joueur1.getNom() + " est mort \n");
                winner = joueur2.getNom();
                matchTermine = 0;
            } else if (matchTermine == 0) {
                System.out.println("Le combat est terminé\n");
            } else {
                attaque.combat(joueur1, joueur2);
            }

            if (joueur2.getVitalite() < 1) {
                System.out.println(joueur2.getNom() + " est mort \n");
                winner = joueur1.getNom();
                matchTermine = 0;
                System.out.println("Le combat est terminé\n");
            } else if (matchTermine == 0) {
                System.out.println("Le combat est terminé\n");
            } else {
                attaque.combat(joueur2, joueur1);
            }

        }
        return winner;
    }



}
