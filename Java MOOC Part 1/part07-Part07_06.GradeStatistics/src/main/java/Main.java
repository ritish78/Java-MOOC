
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter points totals, -1 stops:");
        int sum=0;
        int count=0;
        int sumpassing=0;
        int countpassing=0;
        String grade0="";
        String grade5="";
        String grade4=""; 
        String grade3="";
        String grade2="";
        String grade1="";
        while(true){
            
            String input = scanner.nextLine();
            int value = Integer.valueOf(input);
            if (value==-1){
                break;
            }
            if (value>=0 && value<=100){
                sum+=value;
                count++;
            }
            if (value>=50 && value<=100){
                sumpassing+=value;
                countpassing++;
            }
            if (value>=0 && value<50){
                grade0=grade0+"*";
            }else if(value>=50 && value<60){
                grade1=grade1+"*";
            }else if(value>=60 && value<70){
                grade2=grade2+"*";
            }else if(value>=70 && value<80){
                grade3=grade3+"*";
            }else if(value>=80 && value<90){
                grade4=grade4+"*";
            }else if(value>=90 && value<=100){
                grade5=grade5+"*";
            }
            
        }
       
        System.out.println("Point average (all): "+(double)sum/count);
        System.out.println("Point average (passing): "+(double)sumpassing/countpassing);
        System.out.println("Pass percentage: "+ ((double)countpassing/count)*100);
        System.out.println("Grade distribution: ");
        System.out.println("5: "+grade5);
        System.out.println("4: "+grade4);
        System.out.println("3: "+grade3);
        System.out.println("2: "+grade2);
        System.out.println("1: "+grade1);
        System.out.println("0: "+grade0);
        
    }
}
