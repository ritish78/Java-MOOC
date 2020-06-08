
import java.util.ArrayList;
import java.util.Scanner;

public class LastWords {

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
        int last = pieces.length-1;
        System.out.println(pieces[last]);
        
        


    }
}
