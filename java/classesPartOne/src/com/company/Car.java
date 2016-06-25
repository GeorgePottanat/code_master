package com.company;

/**
 * Created by George on 6/12/2016.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("model s") || validModel.equals("carrera")){
        this.model = model;}
        else{
            this.model = "unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
