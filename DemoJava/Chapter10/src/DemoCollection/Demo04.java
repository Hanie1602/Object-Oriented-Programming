
package DemoCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo04 {
    public static void main(String[] args) {
        //Mac dinh cac phan tu trong danh sach co kieu du lieu la Object (co the da hinh)
        List list01 = new ArrayList();      //Su dung ky thuat da hinh
        
        list01.add("Thu");
        list01.add("Anh");
        list01.add("Cuc");
        list01.add("Giang");
        list01.add("Lan");
        
        list01.add(7);
        list01.add(5);
        list01.add(12);
        
        System.out.println(list01);
        
        System.out.println("-------------------------------------------");
        
        //Su dung iteraator - Bieu thi cac phan tu cua list
        Iterator iterator = list01.iterator();
        System.out.println("Cac phan tu co trong list la: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
