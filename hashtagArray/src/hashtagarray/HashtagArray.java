
package hashtagarray;

import java.util.ArrayList;

/**
 *
 * @author abdularahman
 */
public class HashtagArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String [ ] arr={"SAFCSP", "entrepreneur"};
       
       
        System.out.println(hashtagIt(arr));
    }
    public static String hashtagIt(String[] arr) {
        ArrayList<String> list = new ArrayList<String>();
     
        for(String word :arr){
         list.add("#"+word);
        }
 String str = String.join(" ", list);
      
      return "\""+str+"\"";
}
}
