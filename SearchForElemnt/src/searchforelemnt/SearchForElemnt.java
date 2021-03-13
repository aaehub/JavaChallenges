/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchforelemnt;

import java.util.Arrays;

/**
 *
 * @author abdularahman
 */
public class SearchForElemnt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println(search("Programming","o"));
    
    }
    public static int search(String str, String character) {

        // the hard way
//        int i =0;
//        int num=0;
//        int num2=-2;
//        boolean r =true;
//        String [] arr = new String[str.length()];
//        
//        String c;
//        for(i=0;i<str.length();i++){
//            
//            c=String.valueOf(str.charAt(i));
//            
//            arr[i]=c;
//            
//            
//        }
//  
//         for( i=0;i<arr.length;i++){
//        
//             
//        if(arr[i].equals(character)){
//         
//         num=i;num2=i;
//         break;
//         }
//    
//         }
//         
//         if(num2==-2)
//             return -1;
//         else
//             return num;


   
   int index= str.indexOf(character);
    
    return index;
    

    
   } 
}
