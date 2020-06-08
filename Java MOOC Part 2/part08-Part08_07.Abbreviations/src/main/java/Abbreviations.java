
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
public class Abbreviations {
    private String abbreviation;
    private String explanation;
    private HashMap<String, String> hashList;
    public Abbreviations(){
        this.hashList=new HashMap<>();
        
    }
    public void addAbbreviation(String abbreviation, String explanation){
        this.hashList.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        return this.hashList.containsKey(abbreviation);
    }
    public String findExplanationFor(String abbreviation){
        if (!hasAbbreviation(abbreviation)){
            return null;
        }
        return this.hashList.get(abbreviation);
    }
}
