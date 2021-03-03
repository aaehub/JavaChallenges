/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package issame;

/**
 *
 * @author abdularahman
 */
public class IsSame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         isSame("ahmed","ahmed");
    }
    public static String isSame(String name1, String name2) {
        
        if ( name1.equals(name2)==true  )
        {  return"متشابهتين";}
      
        else {
            return"غير متشابهتين"; }
      
    }
}
