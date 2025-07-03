
package DemoSort02;

import java.util.Comparator;

public class SortSalary implements Comparator {
    
    @Override
    public int compare (Object t, Object t1) {
        
        Employee e1 = (Employee)t;
        Employee e2 = (Employee)t1;
        
        int d = e1.getSalary()-e2.getSalary();
        
        if(d>0) return -1;          //Sắp giảm dần theo Salary
        if(d==0) return e1.getID().compareTo(e2.getID());       //Sắp tăng dần theo ID
        return 1;
    }
    
}
