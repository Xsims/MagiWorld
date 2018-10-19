package com.ocr.simon.classe;


/**
 * The type Rodeur.
 */
public class Rodeur extends Personnage {


    /**
     * Instantiates a new Rodeur.
     *
     * @param niveau       the niveau
     * @param force        the force
     * @param intelligence the intelligence
     * @param agilite      the agilite
     * @param nom          the nom
     */
    public Rodeur(int niveau, int force, int intelligence, int agilite, String nom) {
        super(niveau, force, intelligence, agilite, nom);

        System.out.println("Ninja !!! je suis un rodeur de niveau " + niveau +
                " avec " + this.getVitalite() + " de vitalité \n");
    }

    /**
     *
     * @param victime
     */
    public void attaqueBasique(Personnage victime){
        victime.setVitalite(victime.vitalite - this.getAgilite());
        System.out.println(this.getNom() + " utilise Tir à l'Arc et inflige " + this.getAgilite() + " dommages." +
                "\n" + victime.getNom() + " perd " + this.getAgilite() + " points de vie");
    }

    /**
     *
     * @param victime
     */
    public void attaqueSpeciale(Personnage victime) {
        int bonus = this.getAgilite()/2;
        this.setAgilite(this.getAgilite() + bonus);
        System.out.println(this.getNom() + " gagne " + bonus +" agilité ");

    }


    /**
     * Set agilite.
     *
     * @param agilite the agilite
     */
    public  void setAgilite(int agilite){
        super.agilite = agilite;
    }

}
