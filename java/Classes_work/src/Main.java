/**
 * Created by George on 12/30/2015.
 */
public class Main {

    public static void main(String[] args){

        Car ferrari = new Car();

        Car tesla = new Car();

        ferrari.setColor("red");

        tesla.setColor("midnight");

        ferrari.setModel("Enzo");

        //tesla.setModel("Model S");

        tesla.setModel("Jetty");

       System.out.println("The model is "+tesla.getModel());

    }

}
