package com.isep.rpg;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public List <Hero>players = new LinkedList<>();
    public int playerTurn;

    public static void classSelect(int nbChara){

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
        } else {
            System.out.println("VICTIMUS se demande lesquels de ses compagnons l'accompagnerons!\n (En espérant qu'il ne lui couterons pas un Round!)");
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
