/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoddnumbers;

/**
 *
 * @author Abdualrahman-AAE
 */
public class SumOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [] arr={0,1,2,2,2,3,4};
        System.out.println((sumOdd(arr)));
    }
    public static int sumOdd(int[] arr) {
	
         int sum=0;
       
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum+=arr[i];
             
            }
        }
               
       
       return sum; 
    
}
}