package com.isep.rpg;
public abstract class Ennemy{
    int lP;
    int weaponDammage;
    Ennemy squelleton = new BasicEnemy(50, 20);
    Ennemy squelletor = new Boss(6000, 500);
    Ennemy it_was_me_DIO = new Boss(1000000, 1);
}