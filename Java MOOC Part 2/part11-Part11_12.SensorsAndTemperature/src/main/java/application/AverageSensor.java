/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author HP
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> temperature;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.temperature = new ArrayList<>();
    }
    public boolean isOn(){
        for (Sensor sensor:this.sensors){
            if (!sensor.isOn()){
                return false;
            }
        }
        return true;
    }
    public void setOn(){
        for (Sensor sensor:this.sensors){
            sensor.setOn();
        }
    }
    public void setOff(){
        for (Sensor sensor:this.sensors){
            sensor.setOff();;
        }
    }
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    public int read(){
       int sum=0;
       int count=0;
       if (!this.sensors.isEmpty() && isOn()){
           for (Sensor sensor:this.sensors){
               sum += sensor.read();
           }
           int average = sum/this.sensors.size();
           this.temperature.add(average);
           return average;
       }else{
           throw new IllegalStateException("Average sensor must be on");
       }  
    }
    public List<Integer> readings(){
        return this.temperature;
    }
    
}
