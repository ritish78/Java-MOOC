/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import domain.Airplane;
import domain.Flight;
import domain.Place;
import java.util.Collection;
import java.util.HashMap;


/**
 *
 * @author HP
 */
public class FlightControl {
    private HashMap<String, Airplane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private HashMap<String, Place> places;
    
    public FlightControl(){
        this.airplanes=new HashMap<>();
        this.flights=new HashMap<>();
        this.places=new HashMap<>();
    }
    public void addAirplanes(String ID, int capacity){
        Airplane plane = new Airplane(ID, capacity);
        this.airplanes.put(ID, plane);
    }
    public void addFlight(Airplane airplane, String departureID, String tarID){
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(tarID, new Place(tarID));
        
        Flight flight = new Flight(airplane, this.places.get(departureID), this.places.get(tarID));
        this.flights.put(flight.toString(), flight);
    }
    public Collection<Airplane> getAirplanes(){
        return this.airplanes.values();
    }
    public Collection<Flight> getFlights(){
        return this.flights.values();
    }
    public Airplane getAirplace(String ID){
        return this.airplanes.get(ID);
    }
}
