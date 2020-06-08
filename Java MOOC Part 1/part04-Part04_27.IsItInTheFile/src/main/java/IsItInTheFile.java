
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        boolean found=false;
 
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNext()){
                String line = fileScanner.nextLine();
                if (line.equals(searchedFor)){
                    found=true;
                }
            }
        }catch(Exception e){
            System.out.println("Reading the file "+ e.getMessage()+" failed.");
            return;
        }
        if (found){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }

    }
}
