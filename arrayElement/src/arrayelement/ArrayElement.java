/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayelement;

/**
 *
 * @author abdularahman
 */
public class ArrayElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int [] a = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
        System.out.println(num_elements(a));
    }
    public static int num_elements(int[] array) {
  
       return array.length;
  
}
}
