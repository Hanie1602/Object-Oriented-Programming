
package DemoCollection;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList list01 = new ArrayList();
        
        list01.add("Thu");
        list01.add("Anh");
        list01.add("Cuc");
        list01.add("Giang");
        list01.add("Lan");
        
        for(int i=0;i<list01.size();i++) {
            System.out.println(list01.get(i));
        }
        
        //Xem nhanh cac phan tu trong danh sach
        System.out.println("------------------------------------");
        System.out.println(list01);
    }
}
