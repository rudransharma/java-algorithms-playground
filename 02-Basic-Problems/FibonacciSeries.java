//To calculate Fibonacci Series up to n numbers

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter n (number of terms): ");
            int n = input.nextInt();

            System.out.print("Fibonacci Series: ");
            int a = 0, b = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
        }
    }
}
