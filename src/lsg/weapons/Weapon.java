package lsg.weapons;

import lsg.consumables.repair.RepairKit;

public class Weapon {
    public static String DURABILITY_STAT_STRING = "durability";
    private String name;
    private int minDamage;
    private int maxDamage;
    private int stamCost;
    private int durability;

    public Weapon(String name, int minDamage, int maxDamage, int stamCost, int durability){
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.stamCost = stamCost;
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getStamCost() {
        return stamCost;
    }

    private void setStamCost(int stamCost) {
        this.stamCost = stamCost;
    }

    public int getDurability() {
        return this.durability;
    }

    private void setDurability(int durability) {
        this.durability = durability;
    }

    public void use(){
        this.durability -= 1;
    }

    public boolean isBroken() {
        return this.durability <= 0;
    }
    public void repairWith(RepairKit kit){
        int k = kit.use();
        this.durability += k;
    }

    @Override
    public String toString() {
        return name+" (min:" + minDamage +
                " max:" + maxDamage +
                " stam:" + stamCost +
                " "+DURABILITY_STAT_STRING.substring(0,3)+":" + durability +
                ')';
    }
}
