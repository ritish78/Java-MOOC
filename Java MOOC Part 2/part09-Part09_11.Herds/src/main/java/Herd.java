
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Herd implements Movable{   
    private ArrayList<Organism> list;
    private Organism organism;
    
    public Herd(){
        this.list=new ArrayList<>();

    }
    
    public void move(int dx, int dy){
        for (Organism obj:list){
            obj.move(dx, dy);
        }
        
    }
    public void addToHerd(Movable movable){
      this.list.add(organism);
    }
    
    public String toString(){
       return this.list.toString();
    }
    
}
