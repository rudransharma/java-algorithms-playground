//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the 2 numbers:");
            int a = input.nextInt();
            int b = input.nextInt();

            System.out.print("Enter the Operation: ");
            char op = input.next().charAt(0);

            switch (op) {
                case '+' -> System.out.println("Result: " + (a + b));
                case '-' -> System.out.println("Result: " + (a - b));
                case '*' -> System.out.println("Result: " + (a * b));
                case '/' -> {
                    if (b == 0) {
                        System.out.println("Error: Division by zero");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }
                }
                default -> System.out.println("Enter a valid operation");
            }
        }
    }
}






// 1. main must always be void.
// The JVM only runs public static void main(String[] args) — no other signature works as an entry point.
// 2. return ≠ print.
// return sends a value back to the caller. Nothing calls main, so returning from it shows nothing to the user. Use System.out.println() to display results.
//
// 3. If a method says it returns something, every path must return something.
// No branch can be left empty/silent.
//
// 4. Split responsibilities:
// main → takes input, prints output.
// Other methods → do the actual calculation and return the result.
