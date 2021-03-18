/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponent_x;

/**
 *
 * @author Abdualrahman-AAE
 */
public class Exponent_x {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int s= exponent_x(5,2);
        System.out.println(s);
        
    }
    public static int exponent_x(int number, int exponent) {
  // write your code here
                
           int sum=(int) Math.pow(number, exponent);
              
             return sum;
}
}
