
import java.util.Scanner;


public class AVClub {

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
        for (int i=0; i<pieces.length; i++){
            if (pieces[i].contains("av")){
                System.out.println(pieces[i]);
            }
        }
    }

}
