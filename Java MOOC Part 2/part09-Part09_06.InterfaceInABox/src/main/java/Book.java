/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Book implements Packable{
    private String author;
    private String bookTitle;
    private double weight;
    
    public Book(String author, String bookTitle, double weight){
        this.author=author;
        this.bookTitle=bookTitle;
        this.weight=weight;
    }
    public double weight(){
        return this.weight;
    }
    public String toString(){
        return this.author+": "+this.bookTitle;
    }
    
}
