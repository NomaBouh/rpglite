package com.isep.rpg;

public class Healer extends SpellCaster{
    public Healer(int i, int i1, int i2, int i3){
        this.lP =i;
        this.mP = i1;
        this.armor = i2;
        this.weaponDamage = i3;
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
