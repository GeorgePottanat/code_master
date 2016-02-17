/**
 * Created by George on 12/16/2015.
 */
public class Main {
    public static void main(String[] args){
       calculateScore("George", 1000);

        double calculateCM = calcFeetAndInchesToCentimeters(6, 5);

        System.out.println("Their height is "+calculateCM+" cm.");

        calculateCM = calcFeetAndInchesToCentimeters(50);

        System.out.println("The size in inches is "+calculateCM+" cm.");

    }

    public static int calculateScore(String name, int score){
        System.out.println("Player "+name+" has a score of "+score);
        return score *1000;
    }
    public static int calculateScore(int score){
        System.out.println("You have scored "+score);

        return -1;
    }

    public static double calcFeetAndInchesToCentimeters( int feet, int inches){

        double inchesToCentimeters = 0;
        double feetToCentimeters =0;

        if (feet>=0){
          feetToCentimeters = feet*30.48;
        }
        if (inches<12 && inches>=0){
         inchesToCentimeters = inches * 2.54;
        }

        return feetToCentimeters+inchesToCentimeters;
    }
    public static double calcFeetAndInchesToCentimeters(int inches){

        double inchesToCentimeters = 0;
        if (inches>=0){
            inchesToCentimeters = inches * 2.54;
        }

        return inchesToCentimeters;
    }
}
