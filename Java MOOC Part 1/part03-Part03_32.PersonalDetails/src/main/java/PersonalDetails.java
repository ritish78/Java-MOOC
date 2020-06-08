

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest=0;
        int sum=0;
        int count=0;
        String longname="";
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            if (longest<pieces[0].length()){
                longest=pieces[0].length();
                longname=pieces[0];
            }
            sum=sum+Integer.valueOf(pieces[1]);
            count++;
    }
        System.out.println("Longest name: "+longname);
        System.out.println("Average of the birth years: "+(double)sum/count);
}
}
