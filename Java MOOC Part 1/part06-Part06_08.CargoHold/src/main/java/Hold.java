
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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;
    public Hold(int maxWeight){
        this.maxWeight=maxWeight;
        this.suitcases=new ArrayList<>();
        this.totalWeight=0;
    }
    public void addSuitcase(Suitcase suitcase){
        if (this.maxWeight<this.totalWeight+suitcase.totalWeight()){
            return;
        }
        this.totalWeight+=suitcase.totalWeight();
        this.suitcases.add(suitcase);
        
    }
    public void printItems(){
        for (Suitcase suit:suitcases){
            suit.printItems();
        }
    }
    public String toString(){
        return suitcases.size()+" suitcases ("+this.totalWeight+" kg)";
    }
    
}
