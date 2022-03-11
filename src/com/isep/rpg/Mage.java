package com.isep.rpg;

public class Mage extends SpellCaster{
    int lP;
    int armor;
    int weaponDamage;
    public Mage(int lP, int weaponDammage, int armor){
        this.lP = lP;
        this.weaponDamage =weaponDammage;
        this.armor = armor;
    }
}
