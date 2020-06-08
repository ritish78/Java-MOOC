
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        System.out.println("");

        System.out.println("Enter names, an empty line quits.");
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while (true) {
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    break;
                }
                while (fileScanner.hasNext()){
                    list.add(fileScanner.nextLine());
                }

                if (list.contains(name)) {
                    System.out.println("The name is on the list.");
                } else {
                    System.out.println("The name is not on the list.");
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        

        System.out.println("Thank you!");
    }
}
