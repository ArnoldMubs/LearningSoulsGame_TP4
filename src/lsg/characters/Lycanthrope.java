package lsg.characters;

import lsg.weapons.Claw;

public class Lycanthrope extends Monster{
    public Lycanthrope(){
        super("Lycanthrope");
        super.setSkinThickness(30);
        super.setWeapon(new Claw());
    }
}
