/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Song {
    private String name;
    private int lengthSeconds;
    public Song(String name, int lengthSeconds){
        this.name=name;
        this.lengthSeconds=lengthSeconds;
    }
    public String name(){
        return this.name;
    }
    public int length(){
        return this.lengthSeconds;
    }
    
}
