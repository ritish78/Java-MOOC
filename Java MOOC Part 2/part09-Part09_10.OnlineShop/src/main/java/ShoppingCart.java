
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ShoppingCart {
    private Map<String, Item> shopping;
    
    public ShoppingCart(){
        this.shopping = new HashMap<>();
    }
    public void add(String product, int price){
        if (!this.shopping.containsKey(product)){
            this.shopping.put(product, new Item(product, 1, price));
        }else{
            this.shopping.get(product).increaseQuantity();
        }
    }
    public int price(){
        int total=0;
        for (Item item:this.shopping.values()){
            total+=item.price();
        }
        
        return total;
    }
    public void print(){
        for (Item item:this.shopping.values()){
            System.out.println(item);
        }
    }
    
}
