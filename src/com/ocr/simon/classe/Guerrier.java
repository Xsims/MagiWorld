package com.ocr.simon.classe;

public class Guerrier extends Personnage{

    public Guerrier(int niveau, int force, int intelligence, int agilite, String nom) {
        super(niveau, force, intelligence, agilite, nom);
        System.out.println("Groaw !!! je suis un Guerrier de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité");

    }

    public void attaqueBasique(Personnage personnage){
        personnage.setVitalite(personnage.vitalite - this.getForce());
        System.out.println(this.getNom() + " inflige " + this.getForce() + " points de dommage à " + personnage.getNom() +
                "\n" + personnage.getNom() + " perd " + this.getForce() + " points de vitalité");
    }


    public void attaqueSpeciale(Personnage personnage) {

    }
}
