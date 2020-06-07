
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int sum=0;
        while (true){
            int num=Integer.valueOf(scanner.nextLine());
            if (num>0){
                count++;
                sum+=num;
                continue;
            }else if(num<0){
                continue;
            }else{
                break;
            }
        }
        if (count!=0){
            System.out.println((double)sum/count);
        }else{
            System.out.println("Cannot calculate the average");
        }

    }
}
