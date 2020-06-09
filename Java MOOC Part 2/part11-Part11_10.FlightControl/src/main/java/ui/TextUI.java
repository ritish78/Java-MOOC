/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domain.Airplane;
import domain.Flight;
import domain.Place;
import java.util.Scanner;
import logic.FlightControl;

/**
 *
 * @author HP
 */
public class TextUI {

    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        startAirportAssetControl();
        System.out.println("");
        startFlightControl();
    }

    private void startAirportAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("-----------------");
        System.out.println("");
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("x") || input.equals("X")) {
                break;
            }
            
            if (input.equals("1")) {
                System.out.print("Give the airplane id: ");
                String airplaneID = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());
                flightControl.addAirplanes(airplaneID, capacity);
            } else if (input.equals("2")) {
                System.out.print("Give the airplane id: ");
                String airplaneID = scanner.nextLine();
                System.out.print("Give the departure airport id: ");
                String departID = scanner.nextLine();
                System.out.print("Give the target airport id: ");
                String tarID = scanner.nextLine();
                this.flightControl.addFlight(this.flightControl.getAirplace(airplaneID), departID, tarID);
            }

        }
    }

    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("-----------------");
        System.out.println("");
       
        while (true) {
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("x") || input.equals("X")) {
                break;
            }
            
            if (input.equals("1")) {
                for (Airplane airplane : this.flightControl.getAirplanes()) {
                    System.out.println(airplane);
                }
            } else if (input.equals("2")) {
                for (Flight flight : this.flightControl.getFlights()) {
                    System.out.println(flight);
                }
            } else if (input.equals("3")) {
                System.out.print("Give the airplane id: ");
                String airplaneID = scanner.nextLine();
                Airplane airplane = this.flightControl.getAirplace(airplaneID);
                if (airplane == null) {
                    System.out.println("No airplane with the id " + airplaneID + ".");

                }else{
                    System.out.println(airplane);
                }

            } 
        }
    }
}
