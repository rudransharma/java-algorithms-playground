//To find Armstrong Number between two given number

import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = input.nextInt();
        System.out.print("Enter end number: ");
        int end = input.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}

//A number where the sum of its digits, each raised to the power of the total digit count, equals the number itself
//For each number in the range, copy it into temp (so we don't destroy the original num, since we need it later to compare).
//Extract digits one by one using % 10 (last digit) and / 10 (remove last digit).
//Cube each digit (digit * digit * digit) and add to sum.
//If sum equals the original number, print it.
