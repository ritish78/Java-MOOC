/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author HP
 */
public class Flight {
    private Airplane airplane;
    private Place departPlace;
    private Place targetPlace;
   
    public Flight(Airplane airplane, Place departPlace, Place targetPlace){
        this.airplane=airplane;
        this.departPlace=departPlace;
        this.targetPlace=targetPlace;
    }
    public Airplane getAirplane(){
        return this.airplane;
    }
    public Place getDepartPlace(){
        return this.departPlace;
    }
    public Place getTargetPlace(){
        return this.targetPlace;
    }
    public String toString(){
        return this.airplane.getID()+" ("+this.airplane.getCapacity()+" capacity"+") "+"("+this.departPlace+"-"+this.targetPlace+")";
    }
   
}
