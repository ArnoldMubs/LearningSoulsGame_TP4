package lsg.consumables;

import lsg.consumables.drinks.Coffee;
import lsg.consumables.drinks.Whisky;
import lsg.consumables.drinks.Wine;
import lsg.consumables.food.Americain;
import lsg.consumables.food.Hamburger;

public class MenuBestOfV1 {
    private Consumable[] menu = {new Hamburger(),new Wine(),new Americain(), new Coffee(), new Whisky()};
    private int SIZE_TAB = 5;

    @Override
    public String toString() {
        String m =  "MenuBestOfV1 :\n";
        for (int i=1; i<=SIZE_TAB;i++){
            m+=i+" : "+menu[i-1].toString()+"\n";
        }
        return m;
    }

    public static void main(String args[]){
        MenuBestOfV1 men = new MenuBestOfV1();
        System.out.println(men.toString());
    }

}
