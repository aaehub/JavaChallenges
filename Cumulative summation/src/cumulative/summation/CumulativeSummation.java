/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cumulative.summation;

import java.util.Arrays;

/**
 *
 * @author abdularahman
 */
public class CumulativeSummation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] a = new int[]{2 , 4 , 9 , 23 , 435};
      
        System.out.println(Arrays.toString(cumulativeAddition(a)));
    }
    public static int[] cumulativeAddition(int[] array) {
    
            int e = array.length ;
            int sum=0;
       
          
        for(int i =0 ; i< array.length;i++){
         
            sum += array[i];
            
        }
        
         int[] result ={sum,e};
       
         return result;
}
}
