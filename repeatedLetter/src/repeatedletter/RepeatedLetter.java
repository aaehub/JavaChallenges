/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatedletter;

import java.util.Arrays;

/**
 *
 * @author Abdualrahman-AAE
 */
public class RepeatedLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println(countChar("Coder Hub","f")); 
    
    }
    
    
    public static int countChar(String str, String ch) {
	// write your code here
            int count=0;
             char[] arr = str.toCharArray(); 
             String cha=ch;
             System.out.println(Arrays.toString(arr));
             
            char c =ch.charAt(0);
              
                 int n = 10; 
                 for (int i = 0; i < str.length(); i++) 
                    if (str.charAt(i) == c) 
                     count++; 
             
    return count;
    }
}
