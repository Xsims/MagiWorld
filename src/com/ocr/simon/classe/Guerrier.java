package com.ocr.simon.classe;

public class Guerrier extends Personnage{

    public Guerrier(int niveau, int force, int intelligence, int agilite, String nom) {
        super(niveau, force, intelligence, agilite, nom);
        System.out.println("Groaw !!! je suis un Guerrier de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité \n");

    }

    public void attaqueBasique(Personnage victime){
        victime.setVitalite(victime.vitalite - this.getForce());
        System.out.println(this.getNom() + " utilise Coup d'Épée et inflige " + this.getForce() + " de dommages. " +
                "\n" + victime.getNom() + " perd " + this.getForce() + " points de vie");
    }


    public void attaqueSpeciale(Personnage victime) {
        victime.setVitalite(victime.vitalite - (this.getForce()*2));
        this.setVitalite(this.vitalite - (this.getForce()/2));
        System.out.println(this.getNom() + " utilise Coup de rage et inflige " + (this.getForce()*2) + " dommages." +
                "\n" + victime.getNom() + " perd " + (this.getForce()*2) + " points de vie" +
                "\n" + this.getNom() + " perd " + (this.getForce()/2) + " points de vie");

    }
}
