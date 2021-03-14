/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isitempty;

/**
 *
 * @author abdularahman
 */
public class IsItEmpty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isEmpty(""));
    }
    public static boolean isEmpty(String str) {
        // write your code here
       
        boolean empty;
        if(str==" "){
            
        empty=false;
        }else{
             empty = str.isEmpty();
        } 
        
       return empty;
    }
}
