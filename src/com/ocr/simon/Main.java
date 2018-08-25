package com.ocr.simon;

import com.ocr.simon.classe.Guerrier;
import com.ocr.simon.classe.Mage;
import com.ocr.simon.classe.Personnage;
import com.ocr.simon.classe.Rodeur;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Bienvenue à MagiWorld ! Un monde sanginaire où guerrier, rôdeur et magicien" +
                "s'affronte pour dominer le monde ! \n ");

        Game game = new Game();
        System.out.println("Création du personnage du Joueur 1");
        Personnage joueur1 = game.creation();
        System.out.println("Création du personnage du Joueur 2");
        Personnage joueur2 = game.creation();




    }
}

