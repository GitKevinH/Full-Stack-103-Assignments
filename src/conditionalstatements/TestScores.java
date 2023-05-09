package conditionalstatements;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name a number between 0-100");
        int grade = scanner.nextInt();

        if (grade > 90){
            System.out.println("Your grade is an A!");
        }
        if (grade >= 80 && grade <= 89){
            System.out.println("Your grade is a B!");
        }
        if (grade >= 70 && grade <= 79){
            System.out.println("Your grade is a C.");
        }
        if (grade >= 60 && grade <= 69){
            System.out.println("Your grade is a D.");
        }
        if (grade >= 50 && grade <= 59){
            System.out.println("Your grade is an F.");
        }


    }
}
