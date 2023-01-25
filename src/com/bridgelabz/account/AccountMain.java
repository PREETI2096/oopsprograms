package com.bridgelabz.account;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to your bank ");
		System.out.println("1.To view current balance \n2.To add balance \n3.To withdraw balance");
		Account account = new Account();
		int choice = sc.nextInt();
		switch (choice) {
		case 1 :
			System.out.println("The balance is:");
			account.viewBalance();
			break;
		case 2 :
			account.addBalance();
			break;
		case 3:
			account.withdrawBalance();      
			break;
		}

	}
}
