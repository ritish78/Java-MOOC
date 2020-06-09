
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
public class Ticket {
    private int seat;
    private int code;
    private ArrayList<Show> show;
    
    public Ticket(){
        this.show=new ArrayList<>();
    }
    public ArrayList<Show> getShow(){
        return this.show;
    }
    public void addTicket(Show show){
        this.show.add(show);
    }
   
    
}
