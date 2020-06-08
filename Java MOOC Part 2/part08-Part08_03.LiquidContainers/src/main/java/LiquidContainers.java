
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1=0;
        int container2=0;


        while (true) {
            System.out.print("> ");
            System.out.println("First: "+container1+"/100");
            System.out.println("Second: "+container2+"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] pieces = input.split(" ");
            String command = pieces[0];
            int amount = Integer.valueOf(pieces[1]);
            if (amount<0){
                continue;
            }
            if (command.equals("add")){
                container1+=amount;
                if (container1>100){
                    container1=100;
                }
            }else if(command.equals("move")){
                if (container1<amount){
                    container2+=container1;
                    container1=0;
                }else{
                    container2+=amount;
                    container1-=amount;
                }
                if (container2>100){
                    container2=100;
                }
                
            }else if(command.equals("remove")){
                container2-=amount;
                if (container2<0){
                    container2=0;
                }
            }

        }
    }

}
