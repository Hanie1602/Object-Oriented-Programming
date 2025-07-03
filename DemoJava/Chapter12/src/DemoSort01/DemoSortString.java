
package DemoSort01;

import java.util.ArrayList;
import java.util.Collections;


public class DemoSortString {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Giang");
        list.add("Hoang");
        list.add("Tuan");
        list.add("An");
        list.add("Binh");
        Collections.sort(list);
        
        System.out.println("List after sourt: " + list);
    }
}
