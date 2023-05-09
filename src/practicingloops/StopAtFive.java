package practicingloops;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        String answer = scanner.nextLine();

        while (Integer.valueOf(answer) != 5){
            System.out.println("Give another number");
            answer = scanner.nextLine();
        };
    }
}
