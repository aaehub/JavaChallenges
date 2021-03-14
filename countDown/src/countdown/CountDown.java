/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdown;

/**
 *
 * @author Abdualrahman-AAE
 */
public class CountDown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        System.out.println(countDown(3));
    }
 public static String countDown(int number) {
	// write your code here
        
        int i;
         String xText =  "";
        for(i=number;i>=0;i--){
        xText += String.valueOf(i)+" ";
        
        
        }
        return xText;
        
}
}
