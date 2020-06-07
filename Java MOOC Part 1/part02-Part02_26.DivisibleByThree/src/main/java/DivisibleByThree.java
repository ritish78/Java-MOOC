
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first =Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        divisibleByThreeInRange(first, second);
    }
    public static void divisibleByThreeInRange(int pahilo, int arko){
        for (;pahilo<=arko;pahilo++){
            if (pahilo%3==0){
                System.out.println(pahilo);
            }
        }
    }

}
