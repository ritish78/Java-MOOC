
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ChangeHistory{
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        
        this.history=new ArrayList<>();
        
    }
    public void add(double status){
        this.history.add(status);
    }
    public void clear(){
        this.history.clear();
    }
    public double maxValue(){
        if (this.history.size()==0){
            return 0;
        }
        double largest=history.get(0);
        for (Double number:history){
            if (number>largest){
                largest=number;
            }
        }
        return largest;
    }
    public double minValue(){
        if (this.history.size()==0){
            return 0;
        }
        double min = this.history.get(0);
        for (Double number:history){
            if (min>number){
                min=number;
            }
        }
        return min;
    }
    public double average(){
        double sum=0;
        for (Double number:history){
            sum+=number;
        }
        return sum/this.history.size();
    }
    
    public String toString(){
        return Arrays.toString(this.history.toArray());
    }
    
}
