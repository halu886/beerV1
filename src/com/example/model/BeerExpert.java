package com.example.model;
import java.util.*;

/**
 * BeerExpert
 */
public class BeerExpert {
    public ArrayList getBrands(String color){
        ArrayList<String> brands = new ArrayList<String>();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose"); 
        }
        else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return(brands);
    }
    
}