/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isittheroot;

/**
 *
 * @author abdularahman
 */
public class IsItTheRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(rootCheck(81,9));
    }
   public static int rootCheck(double sqr, int num) {
	// write your code here

        double root= num*num;
       
  
        if(root==sqr){
        return num;
        }else return 0;
} 
}
