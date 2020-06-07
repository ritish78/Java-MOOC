
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.List;

public class Sandbox {

    public static void main(String[] args) throws Exception{
       
            PrintWriter writer = new PrintWriter("file.txt"); 
            String word = "Kina navayeko?";
            writer.print("Mula sag ");
            writer.append(word);
            writer.println(word);
            writer.append("Wow!");
            writer.close();

    }
}
