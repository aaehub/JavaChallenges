/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkfortextonarray;

/**
 *
 * @author Abdualrahman-AAE
 */
public class CheckForTextOnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] a={" ","  "," "};
        System.out.println(stringCheck(a));
    }
    public static boolean stringCheck(String[] arr) {
       
         int count=0;
        
        for(int i=0;i<arr.length;i++){
          
            if(arr[0].equals(arr[i])){
               
            
            
            }else{
               
            count++;
            }
        
        
        }
        
        
        
        
        if(count==0){
            return true;
        
        }
        else 
            return false;
    }
}