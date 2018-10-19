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

    public final static String questionTypeClasse = "Veuillez choisir la classe de votre personnage (1: Guerrier, 2: Rôdeur, 3: Mage)";
    public final static String questionCaracteristique = " du personnage ?";

    //Caractéristiques mis à -1 pour éviter que les joueurs choisissent des caractériques < 0
    int classe = -1;
    int niveau = -1;
    int force = -1;
    int intell = -1;
    int agi = -1;

    int classeMinimum = 1;
    int classeMaximum = 3;


    int niveauMinimum = 1;
    int niveauMaximum = 1000;

    int caracMinimum = 0;

    /**
     * Constructeur null
     */
    public Game() {
    }

    /**Série de questions pour les paramètres du personnage
     * Les questions sont reposées indéfiniment si int < min ou int > max
     */
    public void demandeCaracJoueur(){
        classe = demandeNombre(classeMinimum, classeMaximum, questionTypeClasse);
        niveau = demandeNombre(niveauMinimum, niveauMaximum, "Niveau" + questionCaracteristique);
        force = demandeNombre(caracMinimum, niveau, "Force" + questionCaracteristique);
        intell = demandeNombre(caracMinimum, niveau - force, "Intelligence" + questionCaracteristique);
        agi = demandeNombre(caracMinimum, niveau - force - intell, "Agilité" + questionCaracteristique);
    }

    /**
     * Méthode appelée pour la création de chaque personnage.
     *
     * @param nom the nom
     * @return personnage
     */
    public Personnage creation(String nom){
        //On instancie un personnage null pour ensuite ajouter ses caractéristiques
        Personnage perso = null;

        //On applique les caractéristiques au Personnage intancié plus haut
        switch (classe) {
            case 1:
                Personnage guerrier = new Guerrier(niveau, force, intell, agi, nom);
                perso = guerrier;
                break;
            case 2:
                Personnage rodeur = new Rodeur(niveau, force, intell, agi, nom);
                perso = rodeur;
                break;
            case 3:
                Personnage mage = new Mage(niveau, force, intell, agi, nom);
                perso = mage;
                break;
            default:
                System.out.println("Mauvais choix, veuillez réessayer");
        }
        return perso;
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
    public int demandeNombre(int min, int max, String question){
        int choix = -1;
        Scanner scanner = new Scanner(System.in);
        while(choix < min || choix > max) {
            System.out.println(question);
            choix = scanner.nextInt(); }
        return choix;
    }

    /**
     * Méthode appelée à chaque tour pour attaquer
     *
     * @param joueurAttaquant le joueur attaquant
     * @param joueurAttaque   le joueur attaque
     */
    public void combat(Personnage joueurAttaquant, Personnage joueurAttaque){

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
