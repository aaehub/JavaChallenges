/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiusofthecircle;

/**
 *
 * @author abdularahman
 */
public class RadiusOfTheCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        System.out.println(raduis(4.7));
    }
    public static double raduis(double circumference) {
	// write your code here
        double a= circumference/(6.28 );
        return a;
}
}
