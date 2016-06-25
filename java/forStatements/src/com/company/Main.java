package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest = $"+calculateInterest(10000.0, 2.0));

        for(int i = 10; i<100; i+=10){
            System.out.println("10,000 at "+i+"% interest = $"+String.format("%.2f",calculateInterest(10000.0, i)));
        }
        for(int i = 8; i>=2; i--){
            System.out.println("10,000 at "+i+"% interest = $"+String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count =0;

        for(int i=0; i<100; i++){
            if(isPrime(i)){
                count++;
                System.out.println("The number "+i+" is a prime number!");
                if (count == 10){
                    System.out.println("Exit the loop!");
                    break;
                }
            }
        }

        System.out.println(isPrime(10));
    }
    public static double calculateInterest(double amount, double rate){
        return(amount*(rate/100));
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
