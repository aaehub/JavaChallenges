/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deletelastarrelement;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author abdularahman
 */
public class DeleteLastArrElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        int [ ] a = {1,2,3,4};
       
        System.out.println("the original array " + Arrays.toString(a));
        System.out.println("array after copying " +Arrays.toString(deleteElementInArray(a,2)));
                   
        
        
        
    }
    public static int[] deleteElementInArray(int[] arr, int index) {
       
        int copyarr[] = new int[arr.length-1];
        int k;
        int i;
        
        for ( i=0,k=0 ;i < arr.length; i++){
           
            if(i != index){ 
                System.out.println(k);
                 copyarr[k]=  arr[i];
                 k++;
            }
              }   
        return copyarr;
}
}
