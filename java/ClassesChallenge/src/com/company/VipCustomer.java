package com.company;

/**
 * Created by George on 6/12/2016.
 */
public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Zeena Princess", 10000, "xena@warriors.com");
        System.out.println("The default account has been created!");
    }

    public VipCustomer(String name, String emailAddress) {
        this.name = name;
        this.creditLimit = 2500;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName(){
        return this.name;
    }

    public int getCreditLimit(){
        return this.creditLimit;
    }

    public String getEmailAddress(){
        return this.emailAddress;
    }

}
