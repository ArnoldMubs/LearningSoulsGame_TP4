package lsg.characters;

import lsg.armor.ArmorItem;
import lsg.armor.BlackWitchVeil;
import lsg.armor.RingedKnightArmor;
import lsg.buffs.rings.Ring;
import lsg.buffs.rings.RingOfDeath;

/**
 * La Classe lsg.characters.Hero est destinée à fournir les mécanismes a un hero
 */
public class Hero extends Character {
    private Ring[] rings;
    private static int MAX_ARMOR_PIECES = 3;
    private static int MAX_RINGS = 2;

    private ArmorItem[] armor;
    public Hero (String name) {
        super(name);
        this.armor = new ArmorItem[MAX_ARMOR_PIECES];
        this.rings = new Ring[MAX_RINGS];
        super.setLife(100);
        super.setStamina(50);
        super.setMaxLife(100);
        super.setMaxStamina(50);
        super.setWeapon(null);
        super.setConsumable(null);
    }

    public Hero () {
        this("Gregooninator");
    }

    public void setRing(Ring ring,int slot) {
        if (slot > 0 && slot < 3) {
            this.rings[slot - 1] = ring;
            ring.setHero(this);
        }

    }

    @Override
    protected float computeBuff() {
        float somme=0;
        for(int i = 0; i< this.rings.length;i++){
            if (this.rings[i] != null) {
                somme = somme + this.rings[i].computeBuffValue();
            }
        }
        return somme;
    }

    public Ring[] getRings() {
        Ring[] ring;
        int taille = 0;
        for (int i = 0; i < this.rings.length; i++) {
            if (this.rings[i] != null) {
                taille++;
            }
        }
        ring = new Ring[taille];
        for (int i = 0; i < this.rings.length; i++) {
            if (this.rings[i] != null) {
                ring[i] = this.rings[i];
            }
        }
        return ring;
    }

    public String ringToString(){
        String ring = "RINGS ";
        int res;
        for(int i = 0; i< this.rings.length;i++){
            res = i+1;
            if (this.rings[i] != null) {
                ring = ring + String.format(" %2d:%-30s",res,this.rings[i]);
            }else {
                ring = ring + String.format(" %2d:%-30s",res,"empty");
            }
        }
        return ring+"TOTAL:"+this.computeBuff();
    }

    public float getTotalArmor() {
        float somme=0;
        for(int i = 0; i< this.armor.length;i++){
            if (this.armor[i] != null) {
                somme = somme + this.armor[i].getArmorValue();
            }

        }
        return somme;
    }

    @Override
    protected float computeProtection() {
        return this.getTotalArmor();
    }


    public void setArmorItem(ArmorItem pieceArmure,int slot) {
        if (slot > 0 && slot < 4) {
            this.armor[slot-1] = pieceArmure;
        }
    }

    public String armorToString(){
        String armors = "ARMOR ";
        int res;
        for(int i = 0; i< this.armor.length;i++){
            res = i+1;
            if (this.armor[i] != null) {
                armors = armors + String.format(" %2d:%-30s",res,this.armor[i]);
            }else {
                armors = armors + String.format(" %2d:%-30s",res,"empty");
            }
        }
        return armors+"TOTAL:"+getTotalArmor();
    }

    public ArmorItem[] getArmorItems() {
        ArmorItem[] ArmorItems;
        int taille = 0;
        for (int i = 0; i < this.armor.length; i++) {
            if (this.armor[i] != null) {
                taille++;
            }
        }
        ArmorItems = new ArmorItem[taille];
        for (int j = 0,i=0; j < this.armor.length; j++) {
            if (this.armor[j] != null) {
                ArmorItems[i] = this.armor[j];
                i++;
            }
        }
        return ArmorItems;
    }


        public static void main(String[] args){
            Hero hero = new Hero();
            ArmorItem black = new BlackWitchVeil();
            ArmorItem ring = new RingedKnightArmor();
            hero.setArmorItem(black,1);
            hero.setArmorItem(ring,3);
            hero.getArmorItems();
            hero.setRing(new RingOfDeath(),1);
            System.out.print(hero.armorToString());
            //System.out.print(hero.ringToString());

        }


}
