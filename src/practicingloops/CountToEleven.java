package practicingloops;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 11");
        int num = scanner.nextInt();

        while (num<=11){
            System.out.println(num);
            num++;
        }
    }
}
