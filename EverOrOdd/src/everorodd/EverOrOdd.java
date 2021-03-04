/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everorodd;

/**
 *
 * @author abdularahman
 */
public class EverOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(oddEven(8));
    }
    public static String oddEven(int number) {
        if (number%2 == 0){
            return "زوجي";
                   
        }else{
        
        return "فردي";
        }
        
  
}
}
