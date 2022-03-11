package com.isep.rpg;

public abstract class SpellCaster extends Hero{
    private int mP;
    SpellCaster gandalf = new Mage(100, 60, 30);
    SpellCaster soraka = new Healer(100, 30, 15);
    public SpellCaster(int mP){
        this.mP = mP;
    }
}
