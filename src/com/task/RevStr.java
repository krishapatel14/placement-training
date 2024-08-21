package com.task;

import java.util.Scanner;

public class RevStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		String reversedStr = "";
	    for (int i=0; i<str.length(); i++)
	    {
	    	reversedStr = str.charAt(i) + reversedStr;
	    }
	    System.out.println("Reversed word: "+ reversedStr);
	}

}
