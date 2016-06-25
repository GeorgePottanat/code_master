package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //class is a user defined data type compared to a siple data type
        //new object created with template car

        Car porsche = new Car(); //new Car() is a constructor
        Car tesla = new Car();

        porsche.setModel("Carrera");
        tesla.setModel("Model S");

        System.out.println("This is the porche model "+ porsche.getModel());
    }
}
