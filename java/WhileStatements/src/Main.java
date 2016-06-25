/**
 * Created by George on 6/12/2016.
 */
public class Main {
    public static void main(String[] args){
        int count = 1;

        while(count !=6){
            System.out.println("Count value is "+count);
            count++;
    }
        int number = 5;
        int finishNumber = 30;
        int evens =0;

        while(number<=finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            System.out.println("Even number "+number);
            number++;
            evens++;
        }
        System.out.println("The total number of even numbers is "+evens);
    }

    public static boolean isEvenNumber(int n){
        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
