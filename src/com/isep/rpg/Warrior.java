package com.isep.rpg;

public class Warrior extends Hero{
    public Warrior(int life, int protection, int degats){
        this.lP = life;
        this.armor = protection;
        this.weaponDamage = degats;
    }
    @Override
    public String toString() {
        return "Healer{" +
                "lP=" + lP +
                ", armor=" + armor +
                ", weaponDamage=" + weaponDamage +
                ", potions=" + potions +
                ", lembas=" + lembas +
                '}';
    }
}
