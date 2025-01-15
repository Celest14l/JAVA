// Main.java

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Sum is: " + cal.addition());
                break;
            case 2:
                System.out.println("Difference is: " + cal.subtraction());
                break;
            case 3:
                System.out.println("Product is: " + cal.multiplication());
                break;
            case 4:
                try {
                    System.out.println("Quotient is: " + cal.division());
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
        
        scanner.close();
    }
}
