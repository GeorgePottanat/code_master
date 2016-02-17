/**
 * Created by George on 8/19/2015.
 */
public class methodOverloading {

    public static void main(String[] args){

        calcFeetAndInchesToCentimeters(10,10);
        calcFeetAndInchestoCentimeters(20);
    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet>=0){
            return feet;
        }else if(inches>=0 && inches<=12){
            return inches;
        }else{
            return -1;
        }
    }
    public static int calcFeetAndInchestoCentimeters(int inches){
        if(inches>=0){
            return inches;
        }else{
            return -1;
        }
    }

}

