
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
     
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNext()){
                String names = fileScanner.nextLine();
                String[] pieces = names.split(",");
                String name=pieces[0];
                int age=Integer.valueOf(pieces[1]);
                String years="years";
                if (age==1){
                    years="year";
                }
                System.out.println(name+", age: "+age+" "+years);
            }
        }catch(Exception e){
            System.out.println("The file "+e.getMessage()+" doesn't exist.");
        }

    }
}
