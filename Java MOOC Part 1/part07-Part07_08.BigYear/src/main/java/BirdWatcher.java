
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
public class BirdWatcher {
    private ArrayList<Bird> birdWatch;
    private Bird bird;
    
    public BirdWatcher(){
        this.birdWatch=new ArrayList<>();
    }
    public void addBird(String name, String latinName){
        bird = new Bird(name, latinName);
        this.birdWatch.add(bird);
    }
    public ArrayList<Bird> getBirds(){
        return this.birdWatch;
    }
    public void showAll(){
        for (Bird bird:birdWatch){
            System.out.println(bird);
        }
    }
    
}
