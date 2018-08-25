package com.ocr.simon.classe;

public class Guerrier extends Personnage{
    private String nom;

    public Guerrier(int niveau, int force, int intelligence, int agilite) {
        super(niveau, force, intelligence, agilite);
        System.out.println("Groaw !!! je suis un Guerrier de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité");

    }

    public void AttaqueBasique(Personnage personnage){
        personnage.setVitalite(personnage.vitalite - this.getForce());
    }


    public void AttaqueSpeciale(Personnage personnage) {

    }
}
