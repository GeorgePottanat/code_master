package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1+13;

        System.out.println("1+13 = "+result);

        int previousResult = result;

        result = 10*result-1;

        System.out.println("The new result is now : "+result);

        result += 10;
        result -= 20;
        result *=10;
        result /=523213;
        result = result%7;
        System.out.println(result);
    }
}
