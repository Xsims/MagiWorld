package com.ocr.simon;


import com.ocr.simon.classe.Personnage;




class Game {



    // Le constructeur lance une partie à chaque instanciation
    Game() {
        System.out.println("Bienvenue à MagiWorld ! Un monde sanginaire où guerrier, rôdeur et magicien" +
                "s'affronte pour dominer le monde ! \n ");

        String nomJoueur1 = "Joueur 1";
        String nomJoueur2 = "Joueur 2";


        Personnage joueur1 = this.configure(nomJoueur1);
        Personnage joueur2 = this.configure(nomJoueur2);

        String winner = this.combatAMort(joueur1, joueur2);

        System.out.println("Et le gagnant est... " + winner +  " !!! \n ");

    }




    /**
     * Créé un objet Initialisation qui va
     * s'occuper de toute la configuration
     * de notre personnage
     *
     * @param joueur - nom du Joueur qui configure son personnage
     * @return Personnage
     */
    private Personnage configure(String joueur){
        Initialisation initialisation = new Initialisation();
        joueur = initialisation.demanderNom(joueur);
        initialisation.demandeCaracJoueur();
        return initialisation.creation(joueur);
        }




    /**
     * Lance un combat à mort entre 2 joueurs en tour par tour
     *
     * @param joueur1 - Personnage du joueur 1
     * @param joueur2 - Personnage du joueur 1
     * @return winner - Le nom du gagnant de cette bataille
     */
    private String combatAMort(Personnage joueur1, Personnage joueur2) {
        int matchTermine = 1;
        String winner = "";
        Combat attaque = new Combat();

        while (matchTermine == 1) {

            if (joueur1.getVitalite() < 1) {
                System.out.println(joueur1.getNom() + " est mort \n");
                winner = joueur2.getNom();
                matchTermine = 0;
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
