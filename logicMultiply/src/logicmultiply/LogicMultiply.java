/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicmultiply;

/**
 *
 * @author abdularahman
 */
public class LogicMultiply {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(and(false,false));
    }
    public static boolean and(boolean a, boolean b) {
	// write your code here
	boolean c=a&&b;
	
        
        
        return c;
}
}
