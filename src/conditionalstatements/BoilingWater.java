package conditionalstatements;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number.");

        int temp = scanner.nextInt();

        if(temp > 212){
            System.out.println("Your water is boiling!");
        }
        else {
            System.out.println("Your water ain't boiling!");
        }





    }
}
