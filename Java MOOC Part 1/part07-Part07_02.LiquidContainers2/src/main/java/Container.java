
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
public class Container {

    private int volume;
    private int container1;
    private int container2;

    public Container() {
        this.volume = volume;
        this.container1 = container1;
        this.container2 = container2;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.volume += amount;
            if (this.volume > 100) {
                this.volume = 100;
            }
        }
    }

    public void remove(int amount) {

        if (amount > 0) {
            this.volume -= amount;
            if (this.volume < 0) {
                this.volume = 0;
            }
        }
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("> ");
            System.out.print("First: ");
            System.out.print(container1 + "/100\n");
            System.out.print("Second: ");
            System.out.print(container2 + "/100\n");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }
            String[] pieces = input.split(" ");
            int litre = Integer.valueOf(pieces[1]);
            if (pieces[0].equals("add") && litre > 0) {
                container1 += litre;
            }
            if (container1 > 100) {
                container1 = 100;
            }
            if (pieces[0].equals("move") && litre > 0 && container2 <= 100) {
                if (container1 - litre >= 0) {
                    container2 += litre;
                    container1 -= litre;
                } else if (litre > container1) {
                    container2 += container1;
                    container1 = 0;
                }

                if (container2 > 100) {
                    container2 = 100;
                }

            }
            if (pieces[0].equals("remove") && litre > 0) {
                container2 -= litre;
                if (container2 < 0) {
                    container2 = 0;
                }

            }
        }
    }

    public String toString() {
        return this.volume + "/100";
    }

}
