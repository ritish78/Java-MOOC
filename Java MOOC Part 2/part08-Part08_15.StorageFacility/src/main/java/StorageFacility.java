
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnit;
    
    public StorageFacility(){
        this.storageUnit=new HashMap<>();
    }
    public void add(String unit, String item){
        if (this.storageUnit.get(unit)==null){
            this.storageUnit.put(unit, new ArrayList<>());
            
        }
        this.storageUnit.get(unit).add(item);
        
    }
    public ArrayList<String> contents(String storageUnit){
        if (this.storageUnit.get(storageUnit)==null){
            return new ArrayList<>();
        }
        
        return this.storageUnit.get(storageUnit);   
    }
    public void remove(String storageUnit, String item){
        if (this.storageUnit.containsKey(storageUnit)){
            this.storageUnit.get(storageUnit).remove(item);
        }
        if (this.storageUnit.get(storageUnit).size()==0){
            this.storageUnit.remove(storageUnit);
        }
    }
    public ArrayList<String> storageUnits(){
        ArrayList<String> key = new ArrayList<>();
        for (String chabi:this.storageUnit.keySet()){
            key.add(chabi);
        }
        return key;
    }
}
