/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatype;

import java.util.Scanner;

/**
 *
 * @author abdularahman
 */
public class DataType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
      String a = scan.next();
        System.out.println(inputType(a));
        inputType(a);
       
     
       
       
    }
    public static String inputType(String value) {
      
         try {
            Integer.parseInt(value);
            return "int";
             
        } catch (NumberFormatException e) {
          try{
             Double.parseDouble(value);
            return "double";}
        
          catch (NumberFormatException d){
              
              return "String";
       
          }
             
        }
    
       
}
}
