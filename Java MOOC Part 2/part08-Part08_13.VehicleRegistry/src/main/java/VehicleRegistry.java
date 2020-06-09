
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
public class VehicleRegistry {
    //private LicensePlate licenseplate;
    
    private HashMap<LicensePlate, String> hashmap;
    public VehicleRegistry(){
        //this.licenseplate=licenseplate;
        this.hashmap= new HashMap<>();
    }
    public boolean add(LicensePlate licensePlate, String owner){
      if (hashmap.get(licensePlate)==null){
          hashmap.put(licensePlate, owner);
          return true;
      }
      return false;
    }
    public String get(LicensePlate licensePlate){
        if (hashmap.containsKey(licensePlate)){
            return hashmap.get(licensePlate);
        }
        return null;
        
    }
    public boolean remove(LicensePlate licensePlate){
        if (this.hashmap.containsKey(licensePlate)){
            this.hashmap.remove(licensePlate);
            return true;
        }
        return false;
    }
    public void printLicensePlates(){
        for (LicensePlate key:this.hashmap.keySet()){
            System.out.println(key);
        }
    }
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for (LicensePlate licensePlate:this.hashmap.keySet()){
            if (!owners.contains(this.hashmap.get(licensePlate))){
                System.out.println(this.hashmap.get(licensePlate));
                owners.add(this.hashmap.get(licensePlate));
            }
        }                                           
    }   
}
