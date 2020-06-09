
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    //private ArrayList<String> translations;
    public DictionaryOfManyTranslations(){
        this.dictionary=new HashMap<String, ArrayList<String>>();
        //this.translations=new ArrayList<>();
    }
    public void add(String word, String translation){
        if (this.dictionary.get(word)==null){
            this.dictionary.put(word, new ArrayList<>());
        }
        this.dictionary.get(word).add(translation);
        
    }
    public ArrayList<String> translate(String word){
        if (this.dictionary.get(word)==null){
            return new ArrayList<>();
        }
        
        return this.dictionary.get(word);
    }
    public void remove(String word){
        this.dictionary.remove(word);
    }
    
}
