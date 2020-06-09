/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Student extends Person {
    private int credit;
    public Student(String name, String address){
        super(name, address);
        this.credit=0;
    }

    Student(String kenny, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public void  study(){
        this.credit++;
    }
    
    public int credits(){
        return this.credit;
    } 
    @Override
    public String toString(){
        return getName()+"\n  "+getAddress()+"\n  "+"Study credits "+this.credit;
    }
}
