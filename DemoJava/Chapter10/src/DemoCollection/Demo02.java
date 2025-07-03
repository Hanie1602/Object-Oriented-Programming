
package DemoCollection;

import java.util.ArrayList;

public class Demo02 {
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
        
        list01.remove("Anh");
        
        //Xem nhanh cac phan tu trong danh sach
        System.out.println("------------------------------------");
        System.out.println(list01);
        
        if(list01.contains("Cuc")) {
            System.out.println("I Love u");
        }
        else {
            System.out.println("Not Found!!!");
        }
    }
}
