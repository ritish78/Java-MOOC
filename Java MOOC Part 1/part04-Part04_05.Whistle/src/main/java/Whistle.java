/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Whistle {
    private String whistleSound;
    public Whistle(String whistleSound){
        this.whistleSound=whistleSound;
    }
    public void sound(){
        System.out.println(this.whistleSound);
    }
    
}
