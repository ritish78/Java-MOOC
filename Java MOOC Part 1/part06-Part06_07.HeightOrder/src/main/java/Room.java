
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
public class Room {
    private ArrayList<Person> person;
    
    public Room(){
        this.person = new ArrayList<>();
    }
    public void add(Person person){
        this.person.add(person);
    }
    public boolean isEmpty(){
        return this.person.isEmpty();
    }
    public ArrayList<Person> getPersons(){
        return this.person;
    }
    public Person shortest(){
        if (this.person.isEmpty()){
            return null;
        }
        int shortest=this.person.get(0).getHeight();
        Person shortestPerson = this.person.get(0);
        for (Person shorte:person){
            if (shorte.getHeight()<shortest){
                shortest=shorte.getHeight();
                shortestPerson=shorte;
            }
            
        
        }
        return shortestPerson;
    }
    public Person take(){
        Person newShort = shortest();
        this.person.remove(newShort);
        return newShort;
    }
    
    
}
