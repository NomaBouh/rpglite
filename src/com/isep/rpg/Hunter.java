package com.isep.rpg;

public class Hunter extends Hero{
    int arrows;
    public Hunter(int life, int fleches, int protection, int degats){
        this.lP = life;
        this.arrows = fleches;
        this.armor = protection;
        this.weaponDamage = degats;
    }
}
