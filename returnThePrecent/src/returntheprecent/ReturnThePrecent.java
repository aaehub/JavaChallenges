/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returntheprecent;

/**
 *
 * @author abdularahman
 */
public class ReturnThePrecent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        convertPercent("10%");
    }
    public static double convertPercent(String percentage) {
         
        percentage=percentage.replace("%", "");
        
        double x = Double.parseDouble(percentage); 
            
                
                
                
        return x/100;
  
  
  
  
}
}
