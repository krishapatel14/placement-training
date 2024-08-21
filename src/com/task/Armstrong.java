package com.task;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int tmp, rem, result = 0;
        tmp = n;
        while (tmp != 0)
        {
            rem = tmp % 10;
            result += Math.pow(rem, 3);
            tmp /= 10;
        }
        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");

	}

}
