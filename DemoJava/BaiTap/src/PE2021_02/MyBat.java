package PE2021_02;

/*
    f1, f2 and f3 in IBat as below (you can add other functions in MyBat class):
    f1: Count and return number of ordered pairs in the list t. (pair = two adjacent elements. The pair (x,y) is ordered if x's price <= y's price). E.g. the list (A,3), (C,4), (B,5),(D,2) contains 2 ordered pairs: ((A,3), (C,4)) and ((C,4), (B,5))
    f2: Find the first element x having duplicate price (i.e. there is an element y having the same price as x), then change owner of all elements having the same price as x to "T". (If no element with duplicate price then do nothing)
    f3: Suppose the list contains at least 6 elements. Sort elements from position 1 to 5 by owner descendingly (other elements are unchanged), in case owners are the same, sort them ascendingly by price).
*/
import java.util.*;

public class MyBat implements IBat {
     @Override
    public int f1(List<Bat> t) {
        int count = 0;
        for (int i = 0; i < t.size() - 1; i++) {
            Bat current = t.get(i);
            Bat next = t.get(i + 1);
            if (current.getPrice() <= next.getPrice()) {
                count++;
            }
        }
        return count;
    }

     @Override
    public void f2(List<Bat> t) {
        for (int i = 0; i < t.size() - 1; i++) {
            Bat currentBat = t.get(i);
            for (int j = i + 1; j < t.size(); j++) {
                Bat nextBat = t.get(j);
                if (currentBat.getPrice() == nextBat.getPrice()) {
                    setOwnersWithSamePriceToT(t, currentBat.getPrice());
                    return;
                }
            }
        }
    }

    @Override
    public void f3(List<Bat> t) {
        List<Bat> sublist = t.subList(1, 6);
        sublist.sort(Comparator.comparing(Bat::getOwner).reversed()
                .thenComparingInt(Bat::getPrice));
    }
    
    private void setOwnersWithSamePriceToT(List<Bat> t, int price) {
        for (Bat bat : t) {
            if (bat.getPrice() == price) {
                bat.setOwner("T");
            }
        }
    }
}

//pair = two adjacent elements: cặp = 2 phần từ kề nhau
//f2: Tìm phần tử đầu tiên có giá trùng x (tức là có phần tử y có cùng giá với x), sau đó đổi chủ tất cả các phần tử có cùng giá với x thành "T". (Nếu không có phần tử nào có giá trùng lặp thì không làm gì cả)
//f3: Giả sử danh sách chứa ít nhất 6 phần tử. Sắp xếp các phần tử từ vị trí 1 đến 5 theo chủ sở hữu giảm dần (các phần tử khác không đổi), trường hợp các chủ sở hữu giống nhau thì sắp xếp tăng dần theo giá).

//TEST: Enter owner     Enter price     Enter color     
//0     1       (A,5) (B,4) (C,3) (D,4) (E,5) (F,2)             Out: 2
//0     2       (A,3) (C,4) (B,5) (D,4) (E,5) (F,4)             Out: A,3) (T,4) (B,5) (T,4) (E,5) (T,4) 
//0     3       A,8) (D,7) (E,6) (B,5) (E,4) (F,3) (G,2) (H,1)  Out:(A,8) (F,3) (E,4) (E,6) (D,7) (B,5) (G,2) (H,1)