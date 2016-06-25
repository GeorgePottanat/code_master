package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        //width of 16 or 2 bytes
        System.out.println("Unicode output was: "+ myChar);

        boolean myBoolean = true;
        boolean isMale = true;

        char myRegistered = '\u00AE';

        System.out.println(myRegistered);
    }
}
