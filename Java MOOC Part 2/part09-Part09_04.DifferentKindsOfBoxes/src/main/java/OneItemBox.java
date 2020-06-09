
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
public class OneItemBox extends Box{
    private ArrayList<Item> item;
    
    
    public OneItemBox(){
        super();
        this.item = new ArrayList<>();
        
    }
    @Override
    public boolean isInBox(Item item){
        if (this.item.size()==0){
            return false;
        }
        if (this.item.get(0).equals(item)){
            return true;        
        }
        return false;
    }
    public void add(Item item){
        if (this.item.size()==0){
            this.item.add(item);
        }
    }
   
    
}
