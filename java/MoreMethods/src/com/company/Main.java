package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //methodOverloading using same methods name but with different parameters!
        int newScore = calculateScore("George", 10000);
        System.out.println("New score is "+newScore);

        int newScore2 = calculateScore(14000);
        System.out.println("New score is "+newScore2);
        calculateScore();
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet >=0 || inches>=0 && inches<12){
            double centimeters = 2.54*inches+30.48*feet;

            return centimeters;

        } return -1;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches>=0){

            int feet = (int) inches/12;

            double inchesRemaining = (int) inches%12;

           calcFeetAndInchesToCentimeters(feet, inches);
         }
        return -1;
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+ " scored "+score+" points!");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player Unknown scored "+score+" points!");
        return score*1000;
    }
    public static void calculateScore(){
        System.out.println("No player, no points!");
    }
}
