/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrofnumbers;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Arrays;

/**
 *
 * @author abdularahman
 */
public class ArrOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(numbers_range(3));
     
        
    }
    public static String numbers_range(int number) {
  // write your code here
   int [] a = new int[number+1];
 
   for( int i =0 ; i < a.length ; i++){
      
       a[i]=i;
   }
     
  StringBuilder sb = new StringBuilder();
      for(int i = 0; i < a.length; i++) {
         sb.append(a[i]+" ");
      }
      String str = sb.toString();
  return str ;
}
}