
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
public class Stack {
    private ArrayList<String> value;
    public Stack(){
        this.value= new ArrayList<>();
    }
   
    public boolean isEmpty(){
        if (value.size()==0){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.value.add(value);
    }
    public ArrayList<String> values(){
        return value;
    }
    public String take(){
        String taking = value.get(value.size()-1);
        value.remove(value.size()-1);
        return taking;
    }
    
}
