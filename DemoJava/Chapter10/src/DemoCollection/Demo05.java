
package DemoCollection;

import java.util.ArrayList;
import java.util.List;

public class Demo05 {
    public static void main(String[] args) {
        //Mac dinh cac phan tu trong danh sach co kieu du lieu la Object (co the da hinh)
        List list01 = new ArrayList();      //Su dung ky thuat da hinh
        
        list01.add("Thu");
        list01.add("Anh");
        list01.add("Cuc");
        list01.add("Giang");
        
        list01.add(7);
        list01.add(5);
        list01.add(12);
        
        for(Object x : list01) {
            System.out.println(x);
        }
        
    }
}
