/**
 * Created by George on 8/25/2015.
 */
public class bankAccount {
    public int bankAccount, balance;
    public String customerName, email, phoneNumber;

    public void setBankAccount(int bankAccount){
        this.bankAccount=bankAccount;
    }
    public void setBalance(int balance){
                this.balance=balance;
    }
    public void setCustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setEmail(String email){
        this.email = email;
            }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getBankAccount(){
        return bankAccount;
    }
    public int getBalance(){
        return balance;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void depositFunds(int deposit){
        this.balance += deposit;
        System.out.println("Thank you for your deopsit of $"+deposit);
        System.out.println("Your new account balance is $"+balance);
    }
    public void withdrawFunds(int withdraw) {
        if (balance >= withdraw) {
           this.balance -= withdraw;
            System.out.println("Your remaining balance is $"+balance);
        } else {
          System.out.println("You have insufficient funds to make a withdraawl, please make sure to deposit more money!");
        }
    }
}
