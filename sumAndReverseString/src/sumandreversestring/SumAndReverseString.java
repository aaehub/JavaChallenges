/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumandreversestring;

/**
 *
 * @author Abdualrahman-AAE
 */
public class SumAndReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    String str2="finally";
    String str="weekend";
        System.out.println(reverseWords(str,str2));
  
        
    }
    public static String reverseWords(String str1, String str2) {
	// write your code here
           
        str2=str2+", ";
            return str2+str1;
    }
}
