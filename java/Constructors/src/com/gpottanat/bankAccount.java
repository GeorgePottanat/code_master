package com.gpottanat;

/**
 * Created by George on 12/30/2015.
 */
public class bankAccount {

   private int accountNumber;
   private int balance;
   private String customerName;
   private String customerEmail;
   private String phoneNumber;

   public void setAccountNumber(int accountNumber){
       this.accountNumber = accountNumber;
   }

   public void setBalance(int balance){
       this.balance = balance;
   }

   public void setCustomerName(String customerName){
       this.customerName = customerName;
   }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setDeposit(int deposit){

        balance = deposit + balance;
    }
    public void setWithdrawl(int withdrawl){
        balance = balance - withdrawl;
    }
}
