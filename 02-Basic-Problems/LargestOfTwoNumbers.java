//Take 2 numbers as input and print the largest number

import java.util.Scanner;

public class LargestOfTwoNumbers {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the two numbers");
	int a = input.nextInt();
	int b = input.nextInt();
	int max = (a>b)?a:b;
	System.out.println("The greatest number is:"+ max);
	}
}
