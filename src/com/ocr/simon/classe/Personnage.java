package com.ocr.simon.classe;

/**
 * The type Personnage.
 */
public abstract class Personnage {

    private int niveau;
    int vitalite;
    private int force;
    private int intelligence;
    int agilite;

    private String nom;

    /**
     * @param niveau - le niveau du personnage
     * @param force - la force du personnage
     * @param intelligence - l'intelligence du personnage
     * @param agilite - l'agilité du personnage
     * @param nom - le nom du personnage
     */
    Personnage(int niveau, int force, int intelligence, int agilite, String nom) {
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
     * @param victime - il
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
    int getNiveau() {
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
    int getForce() {
        return force;
    }


    /**
     * Gets intelligence.
     *
     * @return l'intelligence
     */
    int getIntelligence() {
        return intelligence;
    }

    /**
     * Gets agilite.
     *
     * @return l'agilité
     */
    int getAgilite() {
        return agilite;
    }


    /**
     * Sets vitalite.
     *
     * @param vitalite  - la vitalité du personnage
     */
    void setVitalite(int vitalite) {
        this.vitalite = vitalite;
    }
}
