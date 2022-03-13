package com.isep.rpg;
public abstract class Ennemy{
    int lP;
    int weaponDammage;
    Ennemy squelleton = new BasicEnemy(50, 20);
    Ennemy squelletor = new Boss(6000, 500);
    Ennemy DIO_BRANDO = new Boss(1000000, 1);
}