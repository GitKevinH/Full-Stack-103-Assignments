import java.util.Scanner;

public class VariableInputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();

        System.out.println("Enter an integer: ");
        String numbs = scanner.nextLine();

        System.out.println("Enter a double: ");
        String doubleStr = scanner.nextLine();

        System.out.println("Enter a boolean value: ");
        String bool = scanner.nextLine();

        System.out.println("Your string is "+text);

        System.out.println("Your integer is "+ Integer.valueOf(numbs));
        System.out.println("Your double is "+ Double.valueOf(doubleStr));
        System.out.println("Your boolean is "+ Boolean.valueOf(bool));


    }
}
