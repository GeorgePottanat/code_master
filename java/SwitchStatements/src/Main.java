/**
 * Created by George on 12/18/2015.
 */
public class Main {
    public static void main(String[] args){
        int value =1;
        if(value == 1){
            System.out.println("The value is 1");
        }

        int switchValue = 10;

        switch (switchValue){
            //testing same variable within each case
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("Was not 1 or 2"+ switchValue);
                break;

            default:
                System.out.println("Value was 3");
                break;
        }

       String characterA = "e";

        switch (characterA.toLowerCase()){

            case "a":
                System.out.println("This is the letter A");
                break;
            case "b":
                System.out.println("This is the letter B");
                break;
            case "c":case "d":case "e":
                System.out.println("This is the letter "+characterA);
                break;
            default:
                System.out.println("Doesn't exist in our current alphabet database!");
        }
    }
}
