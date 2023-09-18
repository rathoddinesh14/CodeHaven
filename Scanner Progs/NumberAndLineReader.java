import java.util.Scanner;

public class NumberAndLineReader {

    /** This program reads an integer, a double, 
     * and a string from the user and prints them back.
     * Note : nextInt() and nextDouble() do not consume the newline character
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a double: ");
        double d = sc.nextDouble();

        // Consume the leftover newline character
        sc.nextLine();

        // read a string line
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("You entered int: " + num);
        System.out.println("You entered double: " + d);
        System.out.println("You entered string: " + s);
        sc.close();
    }
}