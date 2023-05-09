package conditionalstatements;

import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number.");

        int num1 = scanner.nextInt();

        System.out.println("Enter another number.");

        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("The first number is larger than the second.");
        }

        if(num1 < num2){
            System.out.println("The second number is larger than the first.");
        }

        if(num1 == num2){
            System.out.println("The numbers are equal.");
        }
}
}
