package com.isep.rpg;

import java.util.*;

public class Game {
    public List <Hero>players = new LinkedList<>();
    public int playerTurn;

    public static int[] classSelect(int nbChara) {
        Scanner scanner = new Scanner(System.in);

        int[] persos = {};
        for (int i = nbChara; i > 0; i--) {
            System.out.println("Sélectionner les Compagnons De Victimus!");
            System.out.println("1.Gandalf - Mage\n2.Soraka - Healer\n3.Geralt - Chasseur\n4.Gutz - Guérrier");
            int select = scanner.nextInt();
            persos[nbChara]=select;
            }
        System.out.println("Heureusement pour vous, Et pour VICTIMUS,\nVous pouviez choisir plusieurs fois le même personnage\nCar VICTIMUS peut faire du clonnage\nA l'aide de son MagnumMordificus!\n(... Et ne demander ce que c'est!)");
        return persos;
    }


    public static void playGame(){
        //Initialiser le nombre de personnage jouables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue sur RAT, POGNONS ET VICTIMUS");
        System.out.println("Selectionner le nombre de compagnions de VICTIMUS :");
        int nbCompagnons = scanner.nextInt();
        if(nbCompagnons == 4){
            System.out.println("VICTIMUS sera donc accompagné de tous ses accolytes!\n En Avant!");
        } else if(nbCompagnons>4) {
            System.out.println("VICTIMUS n'as guère besoin d'une si grande companie\n (... Car VICTIMUS n'as plus un crésus!)");
        } else if(nbCompagnons == 1){
            System.out.println("VICTIMUS se demande lequel de ses compagnons l'accompagneras!\n (... En espérant qu'il ne coutera pas trop chère à VICTIMUS!)");
            String tabula = Arrays.toString(new int[][]{classSelect(nbCompagnons)});
            System.out.println(tabula);
        } else {
            System.out.println("VICTIMUS se demande lesquels de ses compagnons l'accompagnerons!\n (En espérant qu'il ne lui couterons pas un Round!)");
            String tabula = Arrays.toString(new int[][]{classSelect(nbCompagnons)});
            System.out.println(tabula);
        }


        //Définir les classes des personnage choisie si nb max non atteint

        //Démarer partie (définir le nombre de tour en fonction du nombre de PJ

        //Système d'upgrade de stat après chaques combats

        //Deafeat

        //Gestion du système d'inventaire à l'aide d'une list par personnages

        //Gestion de système de lancer de mana/dégat/défense

    }
    public static void generateCombat(){

    }

}
