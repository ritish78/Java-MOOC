
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        int sum=0;
        while (true){
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());
            if (num1!=0){
                num++;
                sum+=num1;
                continue;
            }else{
                break;
            }
           
        }
        System.out.println("Number of numbers: "+num);
        System.out.println("Sum of the numbers: "+sum);

    }
}
