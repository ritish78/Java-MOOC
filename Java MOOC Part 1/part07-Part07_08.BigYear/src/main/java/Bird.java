/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Bird {
    private String name;
    private String latinName;
    private int count;
    public Bird(String name, String latinName){
        this.name=name;
        this.latinName=latinName;
    }
    public String getName(){
        return this.name;
    }
    public String getLatinName(){
        return this.latinName;
    }
    public void increaseCount(){
        this.count++;
    }
    public String toString(){
        return this.name+" ("+this.latinName+"): "+this.count+" observations";
    }
    
}
