
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What file do you want to read? ");
        String file = scanner.nextLine();
        System.out.println(read(file));
                

    }
    
    public static List<String> read(String file){
        ArrayList<String> contents = new ArrayList<>();
        try{
            Files.lines(Paths.get(file)).filter(element->!element.isBlank()).forEach(row->contents.add(row));
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
        return contents;
    }

}
