
package DemoSort02;

import java.util.ArrayList;
import java.util.Collections;

public class UsingEmployee02 {
    public static void main(String[] args) {
        ArrayList listemp = new ArrayList();
        Employee e1 = new Employee("SE171916", "Nguyen Van A", 5000);
        Employee e2 = new Employee("SE179726", "Nguyen Van B", 4000);
        Employee e3 = new Employee("SE171326", "Nguyen Van C", 3000);
        Employee e4 = new Employee("SE177416", "Nguyen Van D", 4000);
        
        listemp.add(e1);
        listemp.add(e2);
        listemp.add(e3);
        listemp.add(e4);
        
        Collections.sort(listemp, new SortSalary());
        
        System.out.println("Employee List: ");
        for(int i=0; i<listemp.size();i++)
            System.out.println(listemp.get(i));
    }
}
