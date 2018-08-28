package com.ocr.simon.classe;

public class Mage extends Personnage {

    public Mage(int niveau, int force, int intelligence, int agilite, String nom) {
        super(niveau, force, intelligence, agilite, nom);
        System.out.println("Abracadabra !!! je suis un Mage de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité \n");

    }

    public void attaqueBasique(Personnage victime){
        victime.setVitalite(victime.vitalite - this.getIntelligence());
        System.out.println(this.getNom() + " utilise Boule de Feu et inflige " + this.getIntelligence() + " dommages." +
                "\n" + victime.getNom() + " perd " + this.getIntelligence() + " points de vie");
    }



    public void attaqueSpeciale(Personnage victime) {
        int soin = 0;
        if(this.getVitalite() < (this.getNiveau()*5)) {
            for (int i = 0; i < (this.getIntelligence() * 2) || this.getVitalite() < (this.getNiveau() * 5); i++) {
                this.vitalite++;
                soin++;
            }
            System.out.println(this.getNom() + " utilise Soin et gagne " + soin + " points de vie");
        }
        else{
            System.out.println(this.getNom() + " a sa vie au maximum");
        }

    }
}
