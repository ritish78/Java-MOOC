


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Literacy implements Comparable<Literacy>{
    private String country;
    private String year;
    private String gender;
    private double literacyRate;
    public Literacy(String country, String year, String gender, double literacyRate){
        this.country=country;
        this.gender=gender;
        this.year=year;
        this.literacyRate=literacyRate;
    }

    public String getCountry() {
        return country;
    }

    public String getYear() {
        return year;
    }

    public String getGender() {
        if (this.gender.contains("female")){
            return "female";
        }else{
            return "male";
        }
    }

    public double getLiteracyRate() {
        return literacyRate;
    }
    public String toString(){
        return this.country+" ("+this.year+")"+", "+getGender()+", "+this.literacyRate;
    }
   @Override
    public int compareTo(Literacy literacy){
        if (this.literacyRate==literacy.getLiteracyRate()){
            return 0;
        }
       if ((this.literacyRate-literacy.getLiteracyRate())<0){
           return -1;
       }else{
           return 1;
       }
    }

    
    
}
