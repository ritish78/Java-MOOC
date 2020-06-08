
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
public class IOU {
    private HashMap<String, Double> finance;
    
    public IOU(){
        this.finance=new HashMap<>();
        
    }
    public void setSum(String toWhom, double amount){
        this.finance.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        for(String match:finance.keySet()){
            if (match.equals(toWhom)){
                return finance.get(match);
            }
        }
        return 0;
    }
    
}
