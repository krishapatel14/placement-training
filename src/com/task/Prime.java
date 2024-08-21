package com.task;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		Boolean flag=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println(n+" is prime");
		}else {
			System.out.println(n+" is not prime");
		}
		
		

	}

}
