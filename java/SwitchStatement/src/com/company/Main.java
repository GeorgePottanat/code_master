package com.company;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Main {

    public static void main(String[] args) {
        int value =1;
        if(value ==1){
            System.out.println("Values was 1");
        }else if(value==2){
            System.out.println("Value was 2");
        }else{
            System.out.println("What is this value???");
        }

        int switchvalue =3;

        switch(switchvalue){

            case 1:
                System.out.println("Vaue was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("was either a 3, 4, 5!");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char alpha = 'A';
        //create a switch to evaluate a char!
        switch(alpha){
            case 'A':
                System.out.println("This is the letter A!");
                break;
            case 'B':
                System.out.println("This is the letter B!");
                break;
            case 'C':
                System.out.println("This is the letter C!");
                break;
            case 'D':
                System.out.println("This is the letter D!");
                break;
            case 'E':
                System.out.println("This is the letter E!");
                break;
            default:
                System.out.println("What kind of letter is this!? It's not in my vocabulary");
                break;
        }

        String string = "Ace";
        //create a switch to evaluate a string!
        switch(string.toUpperCase()){
            case "ACE":
                System.out.println("This is an ACE!");
                break;
            case "BASS":
                System.out.println("This is a Bass!");
                break;
            case "CAT":
                System.out.println("This is a Cat!");
                break;
            case "DOG":
                System.out.println("This is a Dog!");
                break;
            case "EEL":
                System.out.println("This is an Eel!");
                break;
            default:
                System.out.println("What kind of letter is this!? It's not in my vocabulary");
                break;
        }

    }
}
