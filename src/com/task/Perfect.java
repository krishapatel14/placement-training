package com.task;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum = 0;
	    for (int i = 1; i < n; i++)
	    {
	     	if (n % i == 0)
	 	        sum += i;
	    }
	     if (sum == n)
	       System.out.println (n + " Is a perfect number");
	     else
	       System.out.println (n + " Is not a perfect number");

	   }

	}
