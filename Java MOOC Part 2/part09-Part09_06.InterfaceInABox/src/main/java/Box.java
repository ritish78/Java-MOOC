
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
public class Box implements Packable{

    private double maxWeight;
    private ArrayList<Packable> items;
    private double totalWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        int totalWeight=0;
    }

    public void add(Packable packable) {
        if (totalWeight+packable.weight() <= this.maxWeight) {
            if (!this.items.contains(packable)) {
                this.items.add(packable);
                totalWeight+=packable.weight();
            }
        }
    }
    public double weight(){
        double weight=0;
        for (Packable item:items){
            weight+=item.weight();
        }
        return weight;
    }
    
    

    public String toString() {
        return "Box: " + this.items.size() + " items, " + "total weight "+totalWeight+" kg";
    }

}
