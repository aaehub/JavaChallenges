/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrmean;

/**
 *
 * @author Abdualrahman-AAE
 */
public class ArrMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [ ] b={2,3,4,5,5};  
        System.out.println(getMean(b));
    }
    public static double getMean(int[] arr) {
	// write your code here
        double sum=0;
        int i;
        for(i=0;i<arr.length;i++){
        
        sum+=arr[i];
        }
        double result = sum/arr.length;
        return result;
}
}
