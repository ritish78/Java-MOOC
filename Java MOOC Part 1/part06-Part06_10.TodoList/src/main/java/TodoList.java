/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TodoList {

    private ArrayList<String> task;

    public TodoList() {
        this.task = new ArrayList<>();
    }

    public void add(String task) {
        this.task.add(task);
    }

    public void print() {
        int i = 1;
        for (String tasks : task) {
            System.out.println(i + ": " + tasks);
            i++;
        }
    }

    public void remove(int number) {
        task.remove(number - 1);
    }
}
