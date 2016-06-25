package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isAlien = false;
        if(isAlien == true){
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if(topScore <100){
            System.out.println("You got a great score!");
        }

        int secondTopScore = 81;
        if(topScore>secondTopScore && topScore<100){
            System.out.println("Greater than secondtopscore and less than 100!");
        }
        if((topScore>90) || (secondTopScore <=90)){
            System.out.println("One of these test is true!");
        }
        boolean isCar = false;

        boolean wasCar = isCar ? true:false;

        if(wasCar) {
            System.out.println("wasCar is true");
        }

        double pokemonLevel = 20;
        double pokemonEvolves = 80;

        double pokeScore = pokemonEvolves+pokemonLevel;
        pokeScore *=25;

        double pokeRatio = pokeScore%40;

        if(pokeRatio<=20){
            System.out.println("Total was over the limit!" + pokeRatio);
        }
    }

}
