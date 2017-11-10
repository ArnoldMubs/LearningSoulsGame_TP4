package lsg.characters;

import lsg.buffs.talismans.MoonStone;
import lsg.buffs.talismans.Talisman;

/**
 * La classe lsg.characters.Monster est destinée à fournir les mécanismes de base communs à tous les (types de) monstres
 */
public class Monster extends Character {
    private float skinThickness = 20;
    private Talisman talisman;
    private static int INSTANCES_COUNT = 0;

    public Monster(String name) {
        super(name);
        super.setLife(10);
        super.setStamina(10);
        super.setMaxLife(10);
        super.setMaxStamina(10);
        this.INSTANCES_COUNT++;
        this.talisman = null;
    }

    public Monster() {
        this("Monster_"+INSTANCES_COUNT);
    }

    @Override
    protected float computeProtection() {
        return this.skinThickness;
    }

    @Override
    protected float computeBuff() {
        return 0;
    }



    public float getSkinThickness() {
        return skinThickness;
    }

    protected void setSkinThickness(float skinThickness) {
        this.skinThickness = skinThickness;
    }

    public void setTalisman(Talisman talisman) {
        this.talisman = talisman;
    }

    public Talisman getTalisman() {
        return this.talisman;
    }
}
