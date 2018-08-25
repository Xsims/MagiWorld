package com.ocr.simon.classe;

public class Rodeur extends Personnage {
    private String nom;

    public Rodeur(int niveau, int force, int intelligence, int agilite) {
        super(niveau, force, intelligence, agilite);
        System.out.println(".... !!! je suis un rodeur de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité");
    }

    public void AttaqueBasique(Personnage personnage){
        personnage.setVitalite(personnage.vitalite - this.getAgilite());
        System.out.println();
    }


    public void AttaqueSpeciale(Personnage personnage) {

    }



}
