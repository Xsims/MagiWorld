package com.ocr.simon.classe;

public class Mage extends Personnage {
    private String nom;


    public Mage(int niveau, int force, int intelligence, int agilite) {
        super(niveau, force, intelligence, agilite);
        System.out.println("Abracadabra !!! je suis un Mage de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité");

    }

    public void AttaqueBasique(Personnage personnage){
        personnage.setVitalite(personnage.vitalite - this.getIntelligence());
    }


    public void AttaqueSpeciale(Personnage personnage) {

    }
}
