package com.isep.rpg;

import java.util.*;

public class Game {
    public List <Hero>players = new LinkedList<>();
    public int playerTurn;

    public static int[] classSelect(int nbChara) {
        Scanner scanner = new Scanner(System.in);
        int entier = 0;
        int[] persos = new int[4];
        do{
            System.out.println("Sélectionner les Compagnons De Victimus!");
            System.out.println("Sachez que Grâce à VICTIMUS,\nVous pourez choisir plusieurs fois le même personnage\nCar VICTIMUS peut Dupliquer\nCes compagnons sans la moindre Inquiétude!\n(... Et ne demander comment!)");
            System.out.println("1.Gandalf - Mage\n2.Soraka - Healer\n3.Geralt - Chasseur\n4.Gutz - Guérrier");
            int select = scanner.nextInt();
            persos[entier] = select;
            entier++;
            } while ((entier != nbChara) && nbChara>4);
            return persos;
    }
    public static void persoSelectio(int[] tableau){
        Scanner sc = new Scanner(System.in);
        int i =0;
        for (int j : tableau) {
            switch (j) {
                case 1 -> {
                    System.out.println("VICTIMUS Constate que vous avez Sélectionner Soraka!\nVoilà un choix Intéréssant!");
                    sc.nextLine();
                }
                case 2 -> {
                    System.out.println("VICTIMUS Observe Gandalf et approuve votre choix!\nUne Bonne Chose pour VICTIMUS!");
                    sc.nextLine();
                }
                case 3 -> {
                    System.out.println("Selon VICTIMUS, Faire appel à Geralt est un choix... plus que reconcevable!\nCar VICTIMUS connait les tarifs de cette personne!");
                    sc.nextLine();
                }
                case 4 -> {
                    System.out.println("VICTIMUS Comprend votre choix!\nAinsi VICTIMUS pourra partager le champs de battaille avec un alliée à sa mesure!");
                    sc.nextLine();
                }
                default -> i++;
            }
        }
    }


    public static void playGame(){
        //Initialiser le nombre de personnage jouables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue sur RAT, POGNONS ET VICTIMUS");
        System.out.println("Selectionner le nombre de compagnions de VICTIMUS :");
        int nbCompagnons = 0;
        do{
            nbCompagnons = scanner.nextInt();
            if(nbCompagnons>4) {
                System.out.println("VICTIMUS n'as guère besoin d'une si grande companie\n (... Car VICTIMUS n'as plus un crésus!)");
            }
        } while (nbCompagnons>4);
        if(nbCompagnons == 4){
            System.out.println("VICTIMUS sera donc accompagné de tous ses accolytes!\n En Avant!");
        }  else if(nbCompagnons == 1){
            System.out.println("VICTIMUS se demande lequel de ses compagnons l'accompagneras!\n (... En espérant qu'il ne coutera pas trop chère à VICTIMUS!)");
            int[] tabula = classSelect(nbCompagnons);
            persoSelectio(tabula);
            String tabperso = Arrays.toString(tabula);
            System.out.println(tabperso);
        } else {
            System.out.println("VICTIMUS se demande lesquels de ses compagnons l'accompagnerons!\n (En espérant qu'il ne lui couterons pas un Round!)");
            int[] tabula = classSelect(nbCompagnons);
            persoSelectio(tabula);
            String tabperso = Arrays.toString(tabula);
            System.out.println(tabperso);
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
