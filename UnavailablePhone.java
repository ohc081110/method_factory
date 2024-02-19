package com.mycompany.factory;

/**
 *
 * @author OMAR HC
 */
public class UnavailablePhone extends Phone {
       public UnavailablePhone(){

    }
    @Override
    public String getdescription(){
        return "This phone is not available";
    }
    @Override
    public double getPrice(){
        return 0.00;
    }
    
    
}
