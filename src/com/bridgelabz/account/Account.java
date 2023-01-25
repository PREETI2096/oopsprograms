package com.bridgelabz.account;
import java.util.Scanner;
public class Account {
	 Scanner sc = new Scanner(System.in);
	 private  int balance = 25000;
	 
	 public void viewBalance() {
		 System.out.println(balance);
	 }
	 public void addBalance() {
		 System.out.println("Please enter the valid amount to add:");
		 int amount = sc.nextInt();
		 balance = balance + amount;
		 System.out.println("The updated account balance is: " + balance);
		 
	 }
    public void withdrawBalance() {
   	 System.out.println("Enter the amount to be withdrawn:");
   	 int amount = sc.nextInt();
   	 if (amount <= 0) {
   		 System.out.println("Enter valid amount for withdraw:");
   	 }
   	 else if (amount <= balance) {
   		 System.out.println("Withdraw is under process...... \n        \nwithdrawn process is successfull!");
   		 balance = balance - amount ;
   		 System.out.println(amount +" is debited and Updated balance is : " + balance);
   	 }
   	 else 
   		 System.out.println("Insufficient balance....");

}
}