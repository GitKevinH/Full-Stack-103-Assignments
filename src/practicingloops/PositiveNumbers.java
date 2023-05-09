package practicingloops;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = scanner.nextInt();

        while(num != 0){

            if(num < 0 ){
                System.out.println("Number must be a positive number");
                System.out.println("Enter a number.");
                num = scanner.nextInt();

            }
            if (num > 0 ){
                System.out.println("Number is: " + num);
                System.out.println("Enter a number.");
                num = scanner.nextInt();

            }
        }
    }
}
