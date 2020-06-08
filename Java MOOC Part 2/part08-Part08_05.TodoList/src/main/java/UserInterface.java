
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
    private TodoList todoList;
    private Scanner scanner;
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList=todoList;
        this.scanner=scanner;
    }
    public void start(){
        while(true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")){
                break;
            }
            if (input.equals("add")){
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }else if(input.equals("list")){
                todoList.print();
            }else if(input.equals("remove")){
                System.out.print("Which one is removed? ");
                int toBe = Integer.valueOf(scanner.nextLine());
                todoList.remove(toBe);
            }
            
        }
   
        
    }
    
}
