package com.task;

public class AbstractDemo {

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount();
	     savings.deposit(50);
	     savings.withdraw(30);
	     savings.getBalance();

	     CheckingAccount checking = new CheckingAccount();
	     checking.deposit(100);
	     checking.withdraw(150);
	     checking.getBalance();
	}
}
abstract class Account {

	 public abstract void deposit(double amount);
	 public abstract void withdraw(double amount);
	 public abstract void getBalance();	 

}

class SavingsAccount extends Account {

	 @Override
	 public void deposit(double amount) {
		 System.out.println("saving deposit "+amount);
	 }

	 @Override
	 public void withdraw(double amount) {
		 System.out.println("saving Withdraw "+amount);
	 }

	 @Override
	 public void getBalance() {
		 System.out.println("saving get balance");
	 }
}

class CheckingAccount extends Account {

	 @Override
	 public void deposit(double amount) {
		 System.out.println("checking deposit "+amount);
	 }

	 @Override
	 public void withdraw(double amount) {
		 System.out.println("checking withdraw "+amount);
	 }

	 @Override
	 public void getBalance() {
		 System.out.println("checking get balance");
	 }
}
