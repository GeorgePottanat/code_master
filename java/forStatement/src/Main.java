/**
 * Created by George on 12/18/2015.
 */
public class Main {
    public static void main(String[] args){

        System.out.println("10,000 at 2% interest is "+calculateInterest(10000, 2));
        System.out.println("50,000 at 10% interest is "+calculateInterest(50000, 10));
        System.out.println("600,000 at 1% interest is "+calculateInterest(600000, 1));

        for(int i = 0; i<2; i++){
            System.out.println("Loop "+i+" has went through "+i+" loops!");
        }

        for(int i = 2; i<9; i++){

            double rateAmount = calculateInterest(1000, i);

            System.out.println("The amount of interest at "+i+"% for $1000 is $"+ rateAmount);

        }
            for(int i = 8; i>=2; i--){

            double rateAmount = calculateInterest(1000, i);

            System.out.println("The amount of interest at "+i+"% for $1000 is $"+ rateAmount);

        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
