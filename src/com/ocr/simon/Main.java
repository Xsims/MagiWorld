package com.ocr.simon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int continuer = 1;

        // Relance le jeu jusqu'à que le joueur décide de quitter
        while(continuer == 1) {
            new Game();

            continuer = -1;
            Scanner scanner = new Scanner(System.in);
            while(continuer < 0 || continuer > 1) {
                System.out.println("Voulez vous continuer ? \n 1 = Oui, 0 = Non \n");
                continuer =  scanner.nextInt();
            }
        }

    }
}

