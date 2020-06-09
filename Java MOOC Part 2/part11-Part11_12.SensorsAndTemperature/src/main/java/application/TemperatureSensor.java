/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author HP
 */
public class TemperatureSensor implements Sensor {

    private boolean state;

    public TemperatureSensor() {
        this.state = false;
    }

    public boolean isOn() {
        return this.state;
    }

    public void setOn() {
        this.state = true;
    }

    public void setOff() {
        this.state = false;
    }

    public int read() {
        if (isOn()) {
            Random random = new Random();
            int num = random.nextInt(61) - 30;
            return num;
        }else{
            throw new IllegalStateException();
        }

    }

}
