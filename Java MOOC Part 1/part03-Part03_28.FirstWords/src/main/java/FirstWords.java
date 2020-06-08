
import java.util.ArrayList;
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str="";
        while (true){
            String naya = scanner.nextLine();
            if (naya.equals("")){
                break;
            }
            str=str+" "+naya;
             
        }
        String[] pieces = str.split(" ");
        System.out.println(pieces[1]);

    }
}
