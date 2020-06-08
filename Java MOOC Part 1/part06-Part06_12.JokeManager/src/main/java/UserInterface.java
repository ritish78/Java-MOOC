
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
public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokeManager, Scanner scanner){
        this.jokeManager=jokeManager;
        this.scanner=scanner;
    }
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String input = scanner.nextLine();
            if (input.equals("x") || input.equals("X")){
                break;
            }
            int command = Integer.valueOf(input);
            if (command==1){
                System.out.println("Write the jobe to be added: ");
                String joke = scanner.nextLine();
                jokeManager.addJoke(joke);
                continue;
            }
            if (command==2){
                System.out.println(jokeManager.drawJoke());
                continue;
            }
            if (command==3){
                jokeManager.printJokes();
                continue;
            }
            
        }
    }
    
}
