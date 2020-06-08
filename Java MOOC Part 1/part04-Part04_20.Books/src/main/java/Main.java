import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> booksInfo = new ArrayList<>();
        while (true){
            System.out.println("Title:");
            String title= scanner.nextLine();
            if (title.equals("")){
                break;
            }
            System.out.println("Pages:");
            int pages=Integer.valueOf(scanner.nextLine());
            System.out.println("Publication Year:");
            int publication=Integer.valueOf(scanner.nextLine());
            booksInfo.add(new Book(title, pages, publication));   
        }
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        if (info.equals("name")){
            for (Book book:booksInfo){
                System.out.println(book.getTitle());
            }
        }
        if(info.equals("everything")){
            for (Book book:booksInfo){
                System.out.println(book);
            }
        } 

    }
}
