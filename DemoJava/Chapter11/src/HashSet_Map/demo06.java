
package HashSet_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class demo06 {
    public static void main(String[] args) {
        HashMap mymap = new HashMap();
        Scanner sc = new Scanner (System.in);
        String NameAni;
        mymap.put("Meo", "Cat");
        mymap.put("Cho", "Dog");
        mymap.put("Gau", "Bear");
        mymap.put("Su tu", "Lion");
        
        System.out.print("Enter Name Animal: ");
        NameAni=sc.nextLine();
        
        //using Iterator
        Iterator iter = mymap.keySet().iterator();
        System.out.println("\n-----------------------------");
        while(iter.hasNext()) {
            Object key = iter.next();
            if(key.equals(NameAni))
                System.out.println(NameAni + " => " + mymap.get(key));
        }
    }
}
