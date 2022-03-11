package com.isep.rpg;

import java.util.List;

public abstract class Hero {
    public int lP;
    public int armor;
    public int weaponDamage;
    public List potions;
    public List lembas;


    public static void guerrisseur() {
        SpellCaster soraka = new Healer(100, 100, 30, 15);
        System.out.println(soraka);
    }
    public static void attack(){

    }
    public static void defend(){

    }
    /*public static void useConsumable(Consumable){

    }
    */
}
