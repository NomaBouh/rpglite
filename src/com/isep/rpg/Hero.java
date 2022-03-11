package com.isep.rpg;

import java.util.Arrays;
import java.util.List;

public abstract class Hero {
    public int lP;
    public int armor;
    public int weaponDamage;
    private List potions;
    private List lembas;
    SpellCaster gandalf = new Mage(100, 100, 60, 30);

    public static void guérrisseur() {
        SpellCaster soraka = new Healer(100, 100, 30, 15);
        System.out.println(soraka);
    }
}
