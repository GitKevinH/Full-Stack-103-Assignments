package calculations;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter one number.");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number.");
        int num2 = scanner.nextInt();

        System.out.println( Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + (num1+num2));
        System.out.println( Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + (num1-num2));
        System.out.println( Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + (num1*num2));
        System.out.println( Integer.toString(num1) + " / " + Integer.toString(num2) + " = " + (num1/num2));
        System.out.println( Integer.toString(num1) + " % " + Integer.toString(num2) + " = " + (num1%num2));

    }
}
