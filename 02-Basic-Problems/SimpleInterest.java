//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the principal amount:");
	int principal = input.nextInt();
	System.out.print("Enter the time:");
	int time = input.nextInt();
	System.out.print("Enter the Rate(in %):");
	int rate = input.nextInt();

	System.out.println("SIMPLE INTEREST:"+ (principal*time*rate) / 100 ); 
	}
}

