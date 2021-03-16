/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getduplicateelements;

import java.util.Arrays;

/**
 *
 * @author Abdualrahman-AAE
 */
public class GetDuplicateElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr={ 8,4,4,2 };
        
        
        System.out.println(Arrays.toString(getDuplicateElements(arr)));
    
    }
    public static int[] getDuplicateElements(int[] arr) {
	// write your code here
        int[] same = new int[arr.length];
	int [] newarr=new int[arr.length];
         for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j] &&(i !=j)) 
                    same[i]=arr[j];
                    }
         }
        int targetIndex = 0;
        for( int i = 0;  i < same.length;  i++ )
            {
                     if( same[i] != 0 )
        same[targetIndex++] = same[i];
}
            int[] newArray = new int[targetIndex];
            System.arraycopy( same, 0, newArray, 0, targetIndex );
                return newArray;
 
}
}