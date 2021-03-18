/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatingevennumbers;

import java.util.Arrays;

/**
 *
 * @author Abdualrahman-AAE
 */
public class CalculatingEvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        int [] arr={0,1,2,2,2,3,4};
        System.out.println((sumEven(arr)));
    }
    public static int sumEven(int[] arr) {
	// write your code here
         int sum=0;
       
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum+=arr[i];
             
            }
        }
               
       
       return sum; 
}
}
