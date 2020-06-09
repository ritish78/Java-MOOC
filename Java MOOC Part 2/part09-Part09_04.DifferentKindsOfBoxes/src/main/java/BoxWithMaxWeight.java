
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
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        //super();
        this.capacity=capacity;
        this.items=new ArrayList<>();
        
    }
    @Override
    public void add(Item item){
        int totalWeight=0;
        for (Item saman:items){
            totalWeight+=saman.getWeight();
        }
        if (this.capacity>totalWeight){
            this.items.add(item);
        }
        if (item.getWeight()==0){
            this.items.add(item);
        }
        
    }
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }
    
}
