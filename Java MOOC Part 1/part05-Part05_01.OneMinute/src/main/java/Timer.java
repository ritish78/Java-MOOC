/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Timer {
    private int second;
    private int minute;
    
    public Timer(){
        this.second=0;
        this.minute=0;
    }
    public void advance(){
        this.second=this.second+1;
        if (this.second>99){
            this.minute++;
            this.second=0;
            if (this.minute>99){
                this.minute=0;
            }
        }
    }
    public String toString(){
        if ((this.minute<10) && (this.second<10)){
            return "0"+this.minute+":"+"0"+this.second;
        }else if((this.minute>10) && (this.second<10)){
            return this.minute+":"+"0"+this.second;
        }else if((this.minute<10) && (this.second>10)){
            return "0"+this.minute+":"+this.second;
        }
        return this.minute+":"+this.second;
   }
    }
    

