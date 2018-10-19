package com.ocr.simon;

import com.ocr.simon.classe.Guerrier;
import com.ocr.simon.classe.Mage;
import com.ocr.simon.classe.Personnage;
import com.ocr.simon.classe.Rodeur;

import java.util.Scanner;

class Initialisation {

    private final static String questionTypeClasse = "Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage)";
    private final static String questionCaracteristique = " du personnage ?";

    //Caractéristiques mis à -1 pour éviter que les joueurs choisissent des caractériques < 0
    private int classe, niveau, force, intell, agi = -1;


    /**Série de questions pour les paramètres du personnage
     * Les questions sont reposées indéfiniment si int < min ou int > max
     */
    void demandeCaracJoueur(){
        int classeMaximum = 3;
        int classeMinimum = 1;
        int niveauMaximum = 1000;
        int niveauMinimum = 1;
        int caracMinimum = 0;

        classe = demandeNombre(classeMinimum, classeMaximum, questionTypeClasse);
        niveau = demandeNombre(niveauMinimum, niveauMaximum, "Niveau" + questionCaracteristique);
        force = demandeNombre(caracMinimum, niveau, "Force" + questionCaracteristique);
        intell = demandeNombre(caracMinimum, niveau - force, "Intelligence" + questionCaracteristique);
        agi = demandeNombre(caracMinimum, niveau - force - intell, "Agilité" + questionCaracteristique);
    }



    /**
     * Méthode appelée pour demander un nombre
     * compris entre un min et un max et répète
     * la demande jusqu'à avoir un nombre entre
     * ce min et ce max
     *
     * @param min Valeur minimum que le joueur peut choisir
     * @param max Valeur minimum que le joueur peut choisir
     * @param question Question posée au joueur
     * @return choix du joueur
     */
    private int demandeNombre(int min, int max, String question){
        int choix = -1;
        Scanner scanner = new Scanner(System.in);
        while(choix < min || choix > max) {
            System.out.println(question);
            choix = scanner.nextInt(); }
        return choix;
    }




    /**
     * Méthode appelée pour la création de chaque personnage.
     *
     * @param nom - du joueur
     * @return personnage
     */
    Personnage creation(String nom){
        //On instancie un personnage null pour ensuite ajouter ses caractéristiques

        //On applique les caractéristiques au Personnage intancié plus haut
        switch (classe) {
            case 1:
                return new Guerrier(niveau, force, intell, agi, nom);
            case 2:
                return new Rodeur(niveau, force, intell, agi, nom);
            case 3:
                return new Mage(niveau, force, intell, agi, nom);
            default:
                System.out.println("Mauvais choix, veuillez réessayer");
                return null;
        }

    }




    /**
     * Demande simplement un nom au joueur pour
     * la création de son personnage
     *
     * @param numeroJoueur - entre le joueur 1 et 2
     * @return nomDuJoueur défini au clavier par celui-ci
     */
    String demanderNom(String numeroJoueur) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Création du personnage du " + numeroJoueur +
                "\nQuel est votre nom ?");
        return scanner.nextLine();
    }
}
