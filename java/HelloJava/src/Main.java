/**
 * Created by George on 8/18/2015.
 */
public class Main {
    public static void main(String[] args){

        calculateScore(true, 5000, 5, 100);
        calculateScore(true, 10000, 8, 200);

        int highScorePosition=calculateHighScorePosition(1500);
        displayHighScorePosition("George Pottanat", highScorePosition);

        highScorePosition=calculateHighScorePosition(900);
        displayHighScorePosition("Tony Stark",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Hulk",highScorePosition);
    }
    public static void calculateScore( boolean simonSays, int score, int levelCompleted, int bonus){
        System.out.println("That's a great score!");
        if(simonSays){
            int finalScore = score +  (levelCompleted*bonus);
            finalScore += 1000;
            System.out.println("Your final score was "+ finalScore);
        }
    }
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore>1000){
            return 1;
        }
        else if(playerScore>500 && playerScore<1000){
            return 2;
        }
        else if(playerScore>100 && playerScore<500){
            return 3;
        }else{ return 4;
        }
    }
}


