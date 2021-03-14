/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisiblebyfive;

/**
 *
 * @author abdualrahman-AAE
 */
public class DivisibleByFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(divisibleByFive(2));
    }
    public static boolean divisibleByFive(int num) {
	boolean able;
        able = false;
        
        if(num%5==0){
            able=true;
            
        }
        else able=false;
    
    
        return able;
    }
}
