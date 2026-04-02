import java.util.*;

public class Calculator {

    public static String calculatorDisplay() {
        return "Welcome to Calculator\n\n" +
               "Choose one operation:\n" +
               "1. Add\n" +
               "2. Subtract\n" +
               "3. Multiply\n" +
               "4. Divide\n" +
               "5. Exit\n";
    }

    public static void userInput(Scanner scanner, int[] numbers) {
        System.out.println("Give two numbers on two lines");
        System.out.print("Number 1 is: ");
        numbers[0] = scanner.nextInt();
        System.out.print("Number 2 is: ");
        numbers[1] = scanner.nextInt();
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }

    public static String calculatorFunction(int userChoice, Scanner scanner) {
        int[] numbers = new int[2];

        if (userChoice == 1) {
            userInput(scanner, numbers);
            return "The sum is: " + addition(numbers[0], numbers[1]);

        } else if (userChoice == 2) {
            userInput(scanner, numbers);
            return "The difference is: " + subtraction(numbers[0], numbers[1]);

        } else if (userChoice == 3) {
            userInput(scanner, numbers);
            return "The product is: " + multiplication(numbers[0], numbers[1]);

        } else if (userChoice == 4) {
            userInput(scanner, numbers);
            return "The result is: " + division(numbers[0], numbers[1]);

        } else if (userChoice == 5) {
            return "Exiting the calculator, bye bye!";

        } else {
            return "Invalid choice";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(calculatorDisplay());

            System.out.print("Select the operation: ");
            int userChoice = scanner.nextInt();

            String result = calculatorFunction(userChoice, scanner);
            System.out.println(result);

            if (userChoice == 5) {
                break;
            }
        }

        scanner.close();
    }
}
