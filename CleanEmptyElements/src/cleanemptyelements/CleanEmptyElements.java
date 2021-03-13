/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cleanemptyelements;

import java.util.Arrays;

/**
 *
 * @author abdularahman
 */
public class CleanEmptyElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer [] s ={2,null,4,5};
        cleanArray(s);
    
    }
    public static int[] cleanArray(Integer[] arr) {
       int timesofnull=0;
        
        for (int i=0;i<arr.length;i++){
            if(arr[i]==null){
            timesofnull++;
            
            }
                  
        
        }
        
        
        
     int arrB [] =new int[arr.length-timesofnull];
       int i,k = 0;
       
        for(i=0;i<arr.length;i++){
           
          if(arr[i]!=null){
         
           arrB[k]= arr[i].intValue();
            k++;}else{continue;}
            
       
        
        }
        
        System.out.println(Arrays.toString(arrB));
      return arrB;  
        
        
        
        
        
        
        
        
}
}
