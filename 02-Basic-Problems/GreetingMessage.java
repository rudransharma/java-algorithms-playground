//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class GreetingMessage{
	public static void main(String[] args){
	System.out.print("Enter a name:");
	Scanner input = new Scanner(System.in);
	String name = input.next();
	System.out.println("Hello!! Nice to meet you "+name); 	
	}
}

