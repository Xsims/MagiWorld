package com.ocr.simon.classe;

/**
 * The type Mage.
 */
public class Mage extends Personnage {

    /**
     * Instantiates a new Mage.
     *
     * @param niveau       the niveau
     * @param force        the force
     * @param intelligence the intelligence
     * @param agilite      the agilite
     * @param nom          the nom
     */
    public Mage(int niveau, int force, int intelligence, int agilite, String nom) {
        super(niveau, force, intelligence, agilite, nom);
        System.out.println("Abracadabra !!! je suis un Mage de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité \n");

    }

    /**
     *Attaque basique : dégats égaux à l'intelligence du personnage si c'est un mage
     *
     * @param victime qui va se prendre les dommages de l'attaque
     */
    public void attaqueBasique(Personnage victime){
        victime.setVitalite(victime.vitalite - this.getIntelligence());
        System.out.println(this.getNom() + " utilise Boule de Feu et inflige " + this.getIntelligence() + " dommages." +
                "\n" + victime.getNom() + " perd " + this.getIntelligence() + " points de vie");
    }


    /**
     *Mage : soigne jusqu'à 2xintelligence
     *
     * @param victime qui va se prendre les dommages de l'attaque
     */
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
