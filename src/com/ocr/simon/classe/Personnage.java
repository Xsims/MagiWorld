package com.ocr.simon.classe;

/**
 * The type Personnage.
 */
public class Personnage {

    int niveau = 0;
    int vitalite = 0;
    int force = 0;
    int intelligence = 0;
    int agilite = 0;

    String nom;

    public Personnage(){

    }

    /**
     * @param niveau
     * @param force
     * @param intelligence
     * @param agilite
     * @param nom
     */
    public Personnage(int niveau, int force, int intelligence, int agilite, String nom) {
        this.niveau = niveau;
        this.vitalite = niveau*5;
        this.force = force;
        this.intelligence = intelligence;
        this.agilite = agilite;
        this.nom = nom;
    }

    /**
     *
     * @param victime
     */
    public void attaqueBasique(Personnage victime){
    }

    /**
     *
     * @param victime
     */
    public void attaqueSpeciale(Personnage victime) {

    }

    /**
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return niveau
     */
    public int getNiveau() {
        return niveau;
    }

    /**
     *
     * @return vitalite
     */
    public int getVitalite() {
        return vitalite;
    }

    /**
     * Gets force.
     *
     * @return the force
     */
    public int getForce() {
        return force;
    }


    /**
     * Gets intelligence.
     *
     * @return the intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Gets agilite.
     *
     * @return the agilite
     */
    public int getAgilite() {
        return agilite;
    }

    /**
     * Sets niveau.
     *
     * @param niveau the niveau
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    /**
     * Sets vitalite.
     *
     * @param vitalite the vitalite
     */
    public void setVitalite(int vitalite) {
        this.vitalite = vitalite;
    }
}
