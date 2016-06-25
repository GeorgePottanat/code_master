package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int myIntValue = 5/2;
        float myFloatValue = (float) 5.4 /2;
        double myDoubleValue = 5.25/2;

        System.out.println("myIntValue ="+myIntValue);
        System.out.println("myFloatValue ="+myFloatValue);
        System.out.println("myDoubleValue ="+myDoubleValue);

        double newPounds = 200d;
        double convertKilograms = newPounds *0.45359237d;

        System.out.println("Kilograms ="+convertKilograms);
    }
}
