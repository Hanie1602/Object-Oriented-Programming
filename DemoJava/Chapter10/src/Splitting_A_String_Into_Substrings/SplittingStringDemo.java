
package Splitting_A_String_Into_Substrings;

import java.util.StringTokenizer;

public class SplittingStringDemo {
    public static void main(String[] args) {
        String str = "I study hard. So, I pass the examination";
        
        //Using the method String[] split() of the String class
        String[] strs = str.split("[ ,.]+");
        for(String s:strs) System.out.print(s);
        System.out.println();
        
        //Using the java.util.StringTokenizer class
        StringTokenizer stk = new StringTokenizer(str,"[ ,.]");
        System.out.println("Number of substrngs: " + stk.countTokens());
        while (stk.hasMoreTokens())
            System.out.println(stk.nextToken());
    }
  
}
