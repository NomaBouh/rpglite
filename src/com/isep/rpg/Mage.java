package com.isep.rpg;

public class Mage extends SpellCaster{
    public Mage(int life, int mana, int protection, int degats){
        this.lP =life;
        this.mP = mana;
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
                ", mP=" + mP +
                '}';
    }
}
