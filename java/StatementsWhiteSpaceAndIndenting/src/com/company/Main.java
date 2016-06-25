package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myVariable = 50;

        if(myVariable == 50){
            System.out.println("This indenting is great for logical flow!");
        }
        myVariable++;
        myVariable--;
        System.out.println("This is a test!");

        System.out.println("This is "+"another "+"still more!");

        int anotherVariable = 50;myVariable--;
        System.out.println("This is another uno!");

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score+ (levelCompleted*bonus);
            System.out.println("Your final score was "+finalScore);
        }
        return 0;
    }
}
