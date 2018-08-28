package com.ocr.simon.classe;

public class Rodeur extends Personnage {


    public Rodeur(int niveau, int force, int intelligence, int agilite, String nom) {
        super(niveau, force, intelligence, agilite, nom);

        System.out.println("Ninja !!! je suis un rodeur de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité \n");
    }

    public void attaqueBasique(Personnage victime){
        victime.setVitalite(victime.vitalite - this.getAgilite());
        System.out.println(this.getNom() + " utilise Tir à l'Arc et inflige " + this.getAgilite() + " dommages." +
                "\n" + victime.getNom() + " perd " + this.getAgilite() + " points de vie");
    }


    public void attaqueSpeciale(Personnage victime) {
        int bonus = this.getAgilite()/2;
        this.setAgilité(this.getAgilite() + bonus);
        System.out.println(this.getNom() + " gagne " + bonus +" agilité ");

    }

    public  void setAgilité(int agilite){
        super.agilite = agilite;
    }

}
