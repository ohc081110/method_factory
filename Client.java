/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author OMAR HC
 */
public class Client {
        public static void main(String []args){
        Phone iphone14=AppleStore.getPhone("IPhone14");
        System.out.println(iphone14.getdescription());
        System.out.println(iphone14.getPrice());
        System.out.println();
        Phone iphone13=AppleStore.getPhone("IPhone14ProMax");
        System.out.println(iphone13.getdescription());
        System.out.println(iphone13.getPrice());
    }
    
}
