package com.ocr.simon.classe;

/**
 * The type Personnage.
 */
public abstract class Personnage {

    int niveau = 0;
    int vitalite = 0;
    int force = 0;
    int intelligence = 0;
    int agilite = 0;

    String nom;

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
     *Attaque basique : dégats égaux à :
     *  - la force du personnage si c'est un guerrier
     *  - l'intelligence du personnage si c'est un mage
     *  - l'agilité du personnage si c'est un rôdeur
     *
     * @param victime qui va se prendre les dommages de l'attaque
     */
    public abstract void attaqueBasique(Personnage victime);

    /**
     *Guerrier : inflige 2xforce en dégâts, mais perd la moitié de sa force en vie
     *Mage : soigne jusqu'à 2xintelligence
     *Rodeur : gagne son niveau divisé par 2 en agilité.
     *
     * @param victime
     */
    public abstract void attaqueSpeciale(Personnage victime);

    /**
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @return le niveau du personnage
     */
    public int getNiveau() {
        return niveau;
    }

    /**
     *
     * @return la vitalité du personnage
     */
    public int getVitalite() {
        return vitalite;
    }

    /**
     * Gets force.
     *
     * @return la force
     */
    public int getForce() {
        return force;
    }


    /**
     * Gets intelligence.
     *
     * @return l'intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * Gets agilite.
     *
     * @return l'agilité
     */
    public int getAgilite() {
        return agilite;
    }

    /**
     * Sets niveau.
     *
     * @param niveau
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    /**
     * Sets vitalite.
     *
     * @param vitalite
     */
    public void setVitalite(int vitalite) {
        this.vitalite = vitalite;
    }
}
