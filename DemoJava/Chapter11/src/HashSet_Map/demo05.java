
package HashSet_Map;

import java.util.HashSet;

//Không sắp xếp và cũng không đảm bảo thứ tự từ đầu đến cuối
public class demo05 {
    public static void main(String[] args) {
        HashSet list = new HashSet();
        list.add(3);
        list.add(5);
        list.add(20);
        list.add(3);
        list.add(9);
        list.add(17);
        System.out.println(list);
    }
}
