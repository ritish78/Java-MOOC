/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Book {
    private String title;
    private int noOfPages;
    private int publishedYear;
    public Book(String title, int noOfPages, int publishedYear){
        this.title=title;
        this.noOfPages=noOfPages;
        this.publishedYear=publishedYear;
    }
    public String getTitle(){
        return this.title;
    }
    public int getNoOfPages(){
        return this.noOfPages;
    }
    public int getPublishedYear(){
        return this.publishedYear;
    }
    public String toString(){
        return this.title+", "+this.noOfPages+" pages, "+this.publishedYear;
    }
    
    
    
}
