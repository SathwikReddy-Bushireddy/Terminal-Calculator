package DSA_Project.Terminal_Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int choice;
        double num1,num2,ans=0.0;
         while (true) {

            System.out.println("!--- Calculator Menu ---!");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit Calculator");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting Calculator...");
                break;
            }

            if (choice >= 1 && choice <= 4) {
                System.out.println("Enter two numbers");
                System.out.print("First Number: ");
                num1 = sc.nextDouble();
                System.out.print("Second Number: ");
                num2 = sc.nextDouble();

                switch (choice) {
                    case 1:
                        ans = num1 + num2;
                        System.out.printf("Addition of %.2f and %.2f is: %.2f\n", num1, num2, ans);
                        break;

                    case 2:
                        ans = num1 - num2;
                        System.out.printf("Subtraction of %.2f and %.2f is: %.2f\n", num1, num2, ans);
                        break;

                    case 3:
                        ans = num1 * num2;
                        System.out.printf("Multiplication of %.2f and %.2f is: %.2f\n", num1, num2, ans);
                        break;

                    case 4:
                        try {
                            if (num2 == 0) {
                                throw new ArithmeticException("Division by zero is not possible");
                            }
                            ans = num1 / num2;
                            System.out.printf("Division of %.2f and %.2f is: %.2f\n", num1, num2, ans);
                        } catch (ArithmeticException e) {
                            System.out.println("Error!! " + e.getMessage());
                        }
                        break;
                }
            } else {
                System.out.println("Invalid choice. Enter a valid choice");
            }
            System.out.println();
            
        }
        sc.close();

    }
}
