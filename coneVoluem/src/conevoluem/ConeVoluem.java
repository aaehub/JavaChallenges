/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conevoluem;

/**
 *
 * @author abdularahman
 */
public class ConeVoluem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println(ConeVolume(3,7));
           
    
    }
    public static double ConeVolume(double radius, double height) {
	// write your code here
        double x = Math.PI;
    
        double result =height/3*3.14*radius*radius;
        return result;
        
    }
    
    
    
    
}
