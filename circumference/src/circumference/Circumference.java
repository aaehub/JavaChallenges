/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circumference;

/**
 *
 * @author Abdualrahman-AAE
 */
public class Circumference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    double s=calculateCircumference(9.0);
        System.out.println(s);
    }
   public static double calculateCircumference(double radius) {
	// write your code here
        return Math.PI*2*radius;
} 
}
