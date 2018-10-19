package com.ocr.simon;

import com.ocr.simon.classe.*;

import javax.swing.tree.TreeNode;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String j1 = "Joueur 1";
        String j2 = "Joueur 2";
        int matchTermine = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue à MagiWorld ! Un monde sanginaire où guerrier, rôdeur et magicien" +
                "s'affronte pour dominer le monde ! \n ");

        Game game = new Game();
        System.out.println("Création du personnage du Joueur 1" +
                "\nQuel est votre nom ?");
        j1 = scanner.nextLine();
        game.demandeCaracJoueur();
        Personnage joueur1 = game.creation(j1);
        System.out.println("Création du personnage du Joueur 2" +
                "\nQuel est votre nom ?");
        j2 = scanner.nextLine();
        game.demandeCaracJoueur();
        Personnage joueur2 = game.creation(j2);

        while(matchTermine == 1) {

            if (joueur1.getVitalite() < 1) {
                System.out.println(joueur1.getNom() + " est mort ");
                matchTermine = 0;
            }
            else if(matchTermine == 0) {
                System.out.println("Le combat est terminé");
            }
            else {
                game.combat(joueur1, joueur2);
            }

            if (joueur2.getVitalite() < 1) {
                System.out.println(joueur2.getNom() + " est mort ");
                matchTermine = 0;
                System.out.println("Le combat est terminé");
            }
            else if(matchTermine == 0) {
                System.out.println("Le combat est terminé");
            }
            else {
                game.combat(joueur2, joueur1);
            }

        }

    }
}

