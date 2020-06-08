
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        String str=scanner.nextLine();
        String[] splitvayeko=str.split(" ");
        if (!str.isEmpty()){
            for(int i=0; i<splitvayeko.length; i++){
                if (count==splitvayeko.length){
                    break;
                }
                System.out.println(splitvayeko[i]);
                count++;
            }
        }
            
            
        }
    }

