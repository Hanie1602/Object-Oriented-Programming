package PE2021_SUM02;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyBrick implements IBrick{

    //Count and return number of elements with place starting with digit and ending with letter.
    // Đếm và trả về số phần tử có vị trí bắt đầu bằng chữ số và kết thúc bằng chữ cái.
    @Override
    public int f1(List<Brick> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            char s = list.get(i).getPlace().charAt(0);
            char e = list.get(i).getPlace().charAt(list.get(i).getPlace().length()-1);
            if(Character.isDigit(s) && Character.isAlphabetic(e))
                count++;
        }
        return count;
    }

    //Find the (first) brick having maximum odd price and change its place to "0"
    //Tìm viên gạch (đầu tiên) có giá lẻ tối đa và thay đổi vị trí của nó thành "0"
    @Override
    public void f2(List<Brick> list) {
        int maxPrice = 0;
        for (Brick b : list) {
            if(b.getPrice() % 2 == 1 && b.getPrice()> maxPrice){
                maxPrice = b.getPrice();
            }
        }
        for (Brick brick : list) {
            if(brick.getPrice() == maxPrice){
                brick.setPlace("XX");
                break;
            } 
        }
    }

    //Find the (first) brick having maximum price and sort all elements before it ascendingly by price.
    //Tìm viên gạch (đầu tiên) có giá tối đa và sắp xếp tất cả các phần tử trước nó tăng dần theo giá.
    @Override
    public void f3(List<Brick> list) {
        Comparator<Brick> c = new Comparator<Brick>() {
            @Override
            public int compare(Brick t1, Brick t2) {
                return t1.getPrice()-t2.getPrice();
            }
        };
        int indexMax=0;
        int maxPrice = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() > maxPrice){
                maxPrice=list.get(i).getPrice();
                indexMax=i;
            }
        }
        Collections.sort(list.subList(0, indexMax), c);
    }
    
}


//TEST:
//0     1       (1AB,5) (B2,4) (CT,3) (DX1,4) (2E,5) (F4,2)         Out: 2
//0     3       (A,8) (D,7) (E,6) (B,9) (E,1) (F,2) (G,9) (H,3)     Out: (E,6) (D,7) (A,8) (B,9) (E,1) (F,2) (G,9) (H,3)
//0     2       (A,4) (C,5) (B,7) (D,3) (E,7) (F,8)                 Out: (A,4) (C,5) (XX,7) (D,3) (E,7) (F,8) 