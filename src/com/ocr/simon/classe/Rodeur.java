package com.ocr.simon.classe;

public class Rodeur extends Personnage {


    public Rodeur(int niveau, int force, int intelligence, int agilite, String nom) {
        super(niveau, force, intelligence, agilite, nom);

        System.out.println(".... !!! je suis un rodeur de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité");
    }

    public void attaqueBasique(Personnage personnage){
        personnage.setVitalite(personnage.vitalite - this.getAgilite());

        System.out.println(this.getNom() + " inflige " + this.getAgilite() + " points de dommage à " + personnage.getNom() +
        "\n " + personnage.getNom() + " perd " + this.getAgilite() + " points de vitalité");
    }


    public void attaqueSpeciale(Personnage personnage) {

    }

}
