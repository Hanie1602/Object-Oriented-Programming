
package Demo;

import java.util.Iterator;
import java.util.TreeSet;

public class UsingEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee("S1", "Nguyễn Văn A", 20);
        Employee e2=new Employee("S2", "Nguyễn Văn B", 24);
        Employee e3=new Employee("S3", "Nguyễn Văn C", 21);
        Employee e4=new Employee("S4", "Nguyễn Văn D", 22);
        
        TreeSet listemp= new TreeSet();
        listemp.add(e1);
        listemp.add(e2);
        listemp.add(e3);
        listemp.add(e4);
        
        Iterator iter=listemp.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
