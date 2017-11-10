package lsg.consumables;

import lsg.consumables.drinks.Coffee;
import lsg.consumables.drinks.Whisky;
import lsg.consumables.drinks.Wine;
import lsg.consumables.food.Americain;
import lsg.consumables.food.Hamburger;

import java.util.HashSet;

public class MenuBestOfV2 {
    private HashSet<Consumable> menu = new HashSet<Consumable>();
    private int SIZE_TAB = 5;

    public MenuBestOfV2() {
        this.menu.add(new Hamburger());
        this.menu.add(new Wine());
        this.menu.add(new Americain());
        this.menu.add(new Coffee());
        this.menu.add(new Whisky());
    }

    @Override
    public String toString() {
        String m =  "MenuBestOfV2 :\n";
        int i = 1;
        for (Consumable c : menu){
            m += i+" : "+c.toString()+"\n";
            i++;
        }
        return m;
    }

    public static void main(String args[]){
        MenuBestOfV2 men2= new MenuBestOfV2();
        System.out.println(men2.toString());
    }

}
