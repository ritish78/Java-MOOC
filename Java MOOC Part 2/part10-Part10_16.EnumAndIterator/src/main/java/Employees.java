
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Employees {
    private ArrayList<Person> personList;
    
    public Employees(){
        this.personList=new ArrayList<>();
    }
    public void add(Person personToAdd){
        this.personList.add(personToAdd);
    }
    public void add(List peopleToAdd){
        this.personList.addAll(peopleToAdd);
    }
    public void print(){
        Iterator<Person> iterator = personList.iterator();
        if (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
    public void fire(Education education){
        for (Person person:personList){
            if (person.getEducation().equals(education)){
                personList.remove(person);
            }
        }
    }
    
    
}
