public class Casting {
    public static void main(String[] args) {
        double varOne = 112.35;
        int varTwo = (int) varOne;

        System.out.println("Double: " + varOne);
        System.out.println("Int: " + varTwo);

        String varThree = "49";
        int varFour = Integer.parseInt(varThree);

        System.out.println(); //for line break
        System.out.println("The string value is: "+ varThree);
        System.out.println("The integer value is: "+varFour);
    }

}
