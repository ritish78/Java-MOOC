/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author HP
 */
public class StandardSensor implements Sensor{
    private int number;
    //private boolean state;
    
    public StandardSensor(int number){
        this.number=number;
        //this.state=true;
    }
    public boolean isOn(){
        return true;
    }
    public void setOn(){
        
    }
    public void setOff(){
        
    }
    public int read(){
        return this.number;
    }
            
    
}
