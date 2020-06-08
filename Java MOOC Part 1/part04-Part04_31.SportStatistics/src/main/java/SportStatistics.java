
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int count=0;
        int win=0;         
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNext()){
                
                String teamData=fileScanner.nextLine();
                String[] pieces = teamData.split(",");
                int home = Integer.valueOf(pieces[2]);
                int away = Integer.valueOf(pieces[3]);
                
                for (String piece:pieces){
                    if (piece.equals(team)){
                        count++;
                    }
                    if ((pieces[0].equals(team)) && (home>away)){
                        win++;
                    }
                    if((pieces[1].equals(team)) && (away>home)){
                        win++;
                    } 
                }    
            }
        }catch (Exception e){
            System.out.println("The file "+e.getMessage()+" doesn't exist.");
            return;
        }
        System.out.println("Games: "+count);
        System.out.println("Wins: "+win/4);
        System.out.println("Losses: "+(count-win/4));
    }
}
