package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        bankAccount georgeAccount = new bankAccount();
        georgeAccount.setAccountNumber(7070);
        georgeAccount.setBalance(1000000);
        georgeAccount.setCustomerName("George Pottanat");
        georgeAccount.setEmail("pottanat.george@xyys.efu");
        georgeAccount.setPhoneNumber("571 426 1461");

        georgeAccount.depositFunds(300);
        georgeAccount.withDrawl(500);

        bankAccount terryAccount = new bankAccount(10000, 12032321, "Terry", "pasdsad@gmasl.com", "5713451235");

        VipCustomer George = new VipCustomer();

        System.out.println(George.getCreditLimit());
    }
}
