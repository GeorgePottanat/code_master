/**
 * Created by George on 12/14/2015.
 */
public class Main {

    public static void main(String[] args){

    calculateScore(true, 800, 10, 100);

     calculateScore(true, 2000, 15, 80);

     calculateScore(false, 100, 10, 3);
        int highScorePosition = calculateHighScorePosition(500);
     displayHighScorePosition("George Pottanat", highScorePosition);


     }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){

            bonus=+1000;

            int finalScore = score + levelCompleted*1000 + bonus;

            System.out.println("Your final score is "+finalScore+" pts!");
            System.out.println("Your bonus is now "+bonus+" pts!");

            return finalScore;
        }

            return -1;

    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name+" is "+position+" on the leader board!");
    }

    public static int calculateHighScorePosition(int finalScore){
        if(finalScore>=1000){
            return 1;
        }
        else if(finalScore>=500 && finalScore<1000){
            return 2;
        }else if(finalScore>=100 && finalScore<500){
            return 3;
        }else return 4;
    }



}
