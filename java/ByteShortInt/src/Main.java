/**
 * Created by George on 6/5/2016.
 */
public class Main {

    public static void main(String[] args){

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 5000+10 * (byteValue+shortValue+intValue);

        System.out.println("longTotal = "+longTotal);

    }

}
