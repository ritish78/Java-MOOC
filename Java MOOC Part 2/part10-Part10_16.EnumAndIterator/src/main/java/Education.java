/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public enum Education {
    PHD("PHD"),
    MA("MA"),
    BA("BA"),
    HS("HS");
    private String degree;
    
    private Education(String degree){
        this.degree=degree;
    }
    public String getDegree(){
        return this.degree;
    }
}
