
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;


        while (true) {
            System.out.print("> ");
            System.out.print("First: ");
            System.out.print(container1+"/100\n");
            System.out.print("Second: ");
            System.out.print(container2+"/100\n");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] pieces = input.split(" ");
            int litre=Integer.valueOf(pieces[1]);
            if (pieces[0].equals("add") && litre>0){
                container1+=litre;
            }
            if (container1>100){
                container1=100;
            }
            if (pieces[0].equals("move") && litre>0 && container2<=100){
                if (container1-litre>=0){
                    container2+=litre;
                    container1-=litre;
                }
                else if (litre>container1){
                    container2+=container1;
                    container1=0;
                }
                
                if (container2>100){
                    container2=100;
                }
                
            }
            if (pieces[0].equals("remove") && litre>0){
                container2-=litre;
                if (container2<0){
                    container2=0;
                }
            }
        }
    }

}
