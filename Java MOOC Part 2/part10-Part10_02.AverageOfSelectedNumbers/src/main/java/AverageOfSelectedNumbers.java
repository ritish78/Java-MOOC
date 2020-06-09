
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positiveNums = new ArrayList<>();
        ArrayList<Integer> negativeNums = new ArrayList<>();
        System.out.println("Input numbers, type "+  "\"end\""+" to stop.");
        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            int num = Integer.valueOf(input);
            if (num>=0){
                positiveNums.add(num);
            }else{
                negativeNums.add(num);
            }
            
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        double average=0;
        if (choice.equals("p")){
            average=positiveNums.stream().mapToInt(element -> Integer.valueOf(element)).average().getAsDouble();
            System.out.println("Average of the positive numbers: "+average);
        }else{
            average=negativeNums.stream().mapToInt(element -> Integer.valueOf(element)).average().getAsDouble();
            System.out.println("Average of the negative numbers: "+average);
        }
        

    }
}
