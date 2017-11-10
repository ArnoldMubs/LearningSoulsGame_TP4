package lsg.consumables;

import lsg.consumables.drinks.Coffee;
import lsg.consumables.drinks.Whisky;
import lsg.consumables.drinks.Wine;
import lsg.consumables.food.Americain;
import lsg.consumables.food.Hamburger;
import java.util.HashSet;

public class MenuBestOfV3 extends HashSet<Consumable> {
    private int SIZE_TAB = 5;

    public MenuBestOfV3() {
        this.add(new Hamburger());
        this.add(new Wine());
        this.add(new Americain());
        this.add(new Coffee());
        this.add(new Whisky());
    }

    @Override
    public String toString() {
        String m =  "MenuBestOfV3 :\n";
        int i = 1;
        for (Consumable c : this){
            m += i+" : "+c.toString()+"\n";
            i++;
        }
        return m;
    }

    public static void main(String args[]){
        MenuBestOfV3 men = new MenuBestOfV3();
        System.out.println(men.toString());
    }
}
