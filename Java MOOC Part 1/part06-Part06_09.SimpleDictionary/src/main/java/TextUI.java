
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDictionary;

    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (input.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translated = scanner.nextLine();
                add(word, translated);
            } else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String toBe = scanner.nextLine();
                System.out.println("Translation: " + translate(toBe));
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add(String word, String translated) {
        this.simpleDictionary.add(word, translated);
    }

    public String translate(String word) {
        String translated = this.simpleDictionary.translate(word);
        if (translated==null){
            translated="Word "+ word+" was not found";
        }

        return translated;
    }

}
