/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arearraysidentical;

import java.util.Arrays;

/**
 *
 * @author Abdualrahman-AAE
 */
public class AreArraysIdentical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
       String [] arr={"b","a"};
       String [] arr2={"a","b"};
        System.out.println(match_array(arr,arr2));
    }
   
    
   public static boolean match_array(String[] arr1, String[] arr2) {  
             
     Arrays.sort(arr1);
        Arrays.sort(arr2);
        
      
        return  Arrays.equals(arr1, arr2);
    
  
  
}
}
