package com.ocr.simon.classe;

public class Mage extends Personnage {

    public Mage(int niveau, int force, int intelligence, int agilite, String nom) {
        super(niveau, force, intelligence, agilite, nom);
        System.out.println("Abracadabra !!! je suis un Mage de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité");

    }

    public void attaqueBasique(Personnage personnage){
        personnage.setVitalite(personnage.vitalite - this.getIntelligence());
        System.out.println(this.getNom() + " inflige " + this.getIntelligence() + " points de dommage à " + personnage.getNom() +
                "\n" + personnage.getNom() + " perd " + this.getIntelligence() + " points de vitalité");
    }


    public void attaqueSpeciale(Personnage personnage) {

    }
}
