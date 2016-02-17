package com.gpottanat;

/**
 * Created by George on 12/30/2015.
 */
public class Main {

    public static void main(String[] args){

        int deposit;

        int withdrawl;

        bankAccount George = new bankAccount();

        George.setCustomerName("George");

        George.setAccountNumber(23421123);

        George.setBalance(100000);

        George.setCustomerEmail("pottanat.george@gmail.com");

        George.setPhoneNumber("5714261461");

        George.setDeposit(10000);

        George.setWithdrawl(5000);

        System.out.println("Your current balance is $"+George.getBalance());


    }
}
