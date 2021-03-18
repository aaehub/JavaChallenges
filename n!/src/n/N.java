/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n;

/**
 *
 * @author Abdualrahman-AAE
 */
public class N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(factorial(6));
    }
    public static int factorial(int number) {
 
        int sum=1;
        for(int i = number;i>0;i--)
            
        {
        sum*= i;
        }
        return sum;
}
}
