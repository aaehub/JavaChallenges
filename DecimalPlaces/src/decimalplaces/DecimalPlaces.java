/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalplaces;



/**
 *
 * @author Abdualrahman-AAE
 */
public class DecimalPlaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(DecimalPlaces("4"));
                
    }
   public static int DecimalPlaces(String num) {
// write your code here
           char[] ch = num.toCharArray(); 
            
           int index=0;
      
           boolean contains = false;
            for (char c : ch) {
                if (c == '.') {
                    index++;
                    contains=true; 
                    break;
                   
                            }
            }
            
            
            
            
            int result;
            if(contains==false){
            result=0;
            
             }else{
               
                result=ch.length-1-index;
            }
            
            
            
      
        return result;
            }	 
}
    
   