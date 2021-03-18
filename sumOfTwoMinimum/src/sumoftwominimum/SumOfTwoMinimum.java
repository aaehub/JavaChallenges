/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoftwominimum;

import java.util.Arrays;

/**
 *
 * @author Abdualrahman-AAE
 */
public class SumOfTwoMinimum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          int [] arr={20,9,3,2};
          System.out.println(sumTwoSmallestNums(arr));
    
    }
    public static int sumTwoSmallestNums(int[] arr) {
	
         Arrays.sort(arr);
           int sum=0;
           sum=arr[0]+arr[1];
           return sum;
        
        
    }
}
