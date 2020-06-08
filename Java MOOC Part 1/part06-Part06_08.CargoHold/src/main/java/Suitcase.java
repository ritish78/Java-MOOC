
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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;
    public Suitcase(int maxWeight){
        this.maxWeight=maxWeight;
        this.items= new ArrayList<>();
        this.totalWeight=0;
    }
    public void addItem(Item item){
        if (this.maxWeight<totalWeight+item.getWeight()){
            return;
        }
        this.totalWeight+=item.getWeight();
        this.items.add(item);
        
    }
    public void printItems(){
        for (Item item:items){
            System.out.println(item);
        }
    }
    public int totalWeight(){
        return this.totalWeight;
    }
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        int heaviest=0;
        Item heavy = this.items.get(0);
        for (int i=0; i<items.size(); i++){
            if (items.get(i).getWeight()>heaviest){
                heaviest=items.get(i).getWeight();
                heavy=items.get(i);
            }
        }
        return heavy;
    }
    public String toString(){
        if (items.size()==1){
            return items.size()+" item "+"("+this.totalWeight+" kg)";
        }else if(items.size()>1){
            return items.size()+" items "+"("+this.totalWeight+" kg)";
        }
        return "no items "+"("+this.totalWeight+" kg)";
    }
    
    
}
