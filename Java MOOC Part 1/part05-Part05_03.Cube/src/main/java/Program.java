
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        System.out.print("Enter length: ");
        int length=Integer.valueOf(scanner.nextLine());
        Cube cube = new Cube(length);
        System.out.println(cube.volume());
        System.out.println(cube);
        
        
    }
}
