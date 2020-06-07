
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String pahilo = scan.nextLine();
        System.out.println("Give an integer:");
        int dosro=Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double tesro = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean last = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+pahilo);
        System.out.println("You gave the integer "+dosro);
        System.out.println("You gave the double "+tesro);
        System.out.println("You gave the boolean "+last);

    }
}
