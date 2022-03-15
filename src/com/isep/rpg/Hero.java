package com.isep.rpg;

import java.util.List;

public abstract class Hero {
    public int lP;
    public int armor;
    public int weaponDamage;
    public List potions;
    public List lembas;


    public static void guerrisseur() {
        Hero soraka = new Healer(100, 100, 30, 15);
        System.out.println(soraka);
    }
    public static void sorcelleur(){
        Hero geralt = new Hunter(100,30,40,40);
        System.out.println(geralt);
    }
    public static void youShouldNotPass(){
        Hero gandalf = new Mage(100,100,35,60);
        System.out.println(gandalf);
    }
    public static void berserk(){
        Hero gutz = new Warrior(100,60,65);
        System.out.println(gutz);
    }
    public static void attack(){

    }
    public static void defend(){

    }
    /*public static void useConsumable(Consumable){

    }
    */
}
