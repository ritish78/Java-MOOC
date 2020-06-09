/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Dog extends Animal{
    private String name;
    public Dog(){
       this.name=name;
    }
    public Dog(String name){
        this.name=name;
    }
    public void bark(){
        System.out.println(this.name+" barks");
    }
    public void eat(){
        //super.eat();
    }
    public void sleep(){
        //super.sleep();
    }
}
