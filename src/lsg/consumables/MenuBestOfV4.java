package lsg.consumables;

import lsg.consumables.drinks.Coffee;
import lsg.consumables.drinks.Whisky;
import lsg.consumables.drinks.Wine;
import lsg.consumables.food.Americain;
import lsg.consumables.food.Hamburger;
import lsg.consumables.repair.RepairKit;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class MenuBestOfV4 extends LinkedHashSet<Consumable> {
    private int SIZE_TAB = 5;

    public MenuBestOfV4() {
        this.add(new Hamburger());
        this.add(new Wine());
        this.add(new Americain());
        this.add(new Coffee());
        this.add(new Whisky());
        this.add(new RepairKit());
    }

    @Override
    public String toString() {
        String m =  "MenuBestOfV4 :\n";
        Iterator it = this.iterator();
        int i = 1;
        while (it.hasNext()){
            m += i+" : "+it.next()+"\n";
            i++;
        }
        return m;
    }

    public static void main(String args[]){
        MenuBestOfV4 men = new MenuBestOfV4();
        System.out.println(men.toString());
    }

}
