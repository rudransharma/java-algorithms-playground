//Write a program to print whether a number is even or odd, also take input from the user

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = input.nextInt();
            System.out.println(num % 2 == 0 ? "Even Number" : "Odd Number");
        }
    }
}
