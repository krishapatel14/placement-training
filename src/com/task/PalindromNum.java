package com.task;

import java.util.Scanner;

public class PalindromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int rem,rev=0;
		int tmp=n;
		while(tmp!=0) {
			rem=tmp%10;
			rev=(rev*10)+rem;
			tmp/=10;
		}
		if(n==rev) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}

	}

}
