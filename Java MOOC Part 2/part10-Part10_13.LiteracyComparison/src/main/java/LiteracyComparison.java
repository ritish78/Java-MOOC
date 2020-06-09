
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args){
        System.out.println("What file to read? ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Literacy> rows = new ArrayList<>();
        ArrayList<Integer> data = new ArrayList<>();
        String file = scanner.nextLine();
        
        
        try{
           //Files.lines(Paths.get(file)).map(row->row.split(",")).map(parts->rows).sorted().forEach(element->System.out.println(element));
            //Files.lines(Paths.get(file)).map(row->row.split(",")).map(parts->Double.valueOf(parts[5])).sorted().forEach(element->System.out.println(element));
            Files.lines(Paths.get(file)).map(row->row.split(",")).map(pieces->new Literacy(pieces[3], pieces[4], pieces[2], Double.valueOf(pieces[5]))).sorted().forEach(element->System.out.println(element));
            //Files.lines(Paths.get(file)).map(row->row.split(",")).map(parts->Integer.valueOf(parts[5])).sorted((c1,c2)->{return Integer.valueOf(c1)-Integer.valueOf(c2);}).forEach(element->System.out.println(element));
            //Files.lines(Paths.get(file)).map(row->row.split(",")).sorted((c1,c2)->Integer.compare(Integer.parseInt(c1[5].trim()), Integer.parseInt(c2[5].trim()))).forEach(element->System.out.println(element));
            /*
            Scanner fileScanner = new Scanner(Paths.get(file));
            while (fileScanner.hasNext()){
                String row = fileScanner.nextLine();
                System.out.println(row);
                String[] pieces = row.split(",");
                double literacyRate = Double.valueOf(pieces[5]);
               
                rows.add(new Literacy(pieces[3], pieces[4], pieces[1], literacyRate));
            }
            Collections.sort(rows, (c1,c2)->c1.compareTo(c2));
            rows.stream().forEach(ele->System.out.println(ele));
            //rows.stream().sorted((c1,c2)->{return c1.compareTo(c2);}).forEach(element->System.out.println(element));
            */
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        

    }
}
