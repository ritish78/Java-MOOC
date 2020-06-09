
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter number: Enter end or stop to stop");
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end") || input.equals("stop")){
                break;
            }
            int num = Integer.valueOf(input);
            if (num>0){
                numbers.add(num);
            }
            
        }
        System.out.println(positive(numbers));
        
        
        

    }
    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> positiveNumbers = numbers.stream().filter(value -> value>0).collect(Collectors.toCollection(ArrayList::new));
        return positiveNumbers;
    }

}
