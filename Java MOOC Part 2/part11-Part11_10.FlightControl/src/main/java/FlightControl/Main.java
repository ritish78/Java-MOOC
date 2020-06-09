package FlightControl;

import java.util.Scanner;
import ui.TextUI;
import logic.FlightControl;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();
        TextUI ui = new TextUI(flightControl, scanner);
        ui.start();
    }
}
