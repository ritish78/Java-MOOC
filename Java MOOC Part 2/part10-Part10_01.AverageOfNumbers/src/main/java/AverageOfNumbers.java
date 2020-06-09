
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type "+  "\"end\""+" to stop.");
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            int num=Integer.valueOf(input);
            numbers.add(num);
        }
        double average = numbers.stream().mapToInt(element -> Integer.valueOf(element)).average().getAsDouble();
        System.out.println("average of the numbers: "+ average);
        
        
      

    }
}
