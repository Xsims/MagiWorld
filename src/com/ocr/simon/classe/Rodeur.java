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
     *Attaque basique : dégats égaux à l'agilité du personnage si c'est un rôdeur
     *
     * @param victime qui va se prendre les dommages de l'attaque
     */
    public void attaqueBasique(Personnage victime){
        victime.setVitalite(victime.vitalite - this.getAgilite());
        System.out.println(this.getNom() + " utilise Tir à l'Arc et inflige " + this.getAgilite() + " dommages." +
                "\n" + victime.getNom() + " perd " + this.getAgilite() + " points de vie");
    }

    /**
     *Rodeur : gagne son niveau divisé par 2 en agilité.
     *
     * @param victime
     */
    public void attaqueSpeciale(Personnage victime) {
        int bonus = this.getNiveau()/2;
        this.setAgilite(this.getAgilite() + bonus);
        System.out.println(this.getNom() + " gagne " + bonus +" agilité ");

    }


    /**
     * Set agilité.
     *
     * @param agilite l'agilité
     */
    public  void setAgilite(int agilite){
        super.agilite = agilite;
    }

}
