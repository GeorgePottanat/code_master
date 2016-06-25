package com.company;

/**
 * Created by George on 6/15/2016.
 */
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int teeth;
    private String coat;
    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes =eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("The dog chews!!!");
    }
    @Override
    public void eat(){
        System.out.println("The dog is eating");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Time to go for a walk!");
        move(10);
    }
    public void run(){
        System.out.println("The dog is now running!");
        move(20);
    }


    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
