
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

    private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.print("To add:");
                String toAdd = scanner.nextLine();
                todolist.add(toAdd);
                continue;
            }
            if (command.equals("list")) {
                todolist.print();
                continue;
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int toremove = Integer.valueOf(scanner.nextLine());
                todolist.remove(toremove);
                continue;
            }
        }
    }
}
