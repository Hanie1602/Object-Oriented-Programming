package Spring2023_HN_02;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCala implements ICala{
    //Count and return number of elements that its price is an even number. 
    //Đếm và trả về số phần tử mà giá của nó là một số chẵn
    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (Cala cala : t) {
            if (cala.getPrice() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Remove the second element having minimum price (do nothing if only one element in the list)
    //Loại bỏ phần tử thứ hai có giá tối thiểu
    public void f2(List<Cala> t) {
       if (t.size() > 1) {
            Cala minSecond = Collections.min(t.subList(2, t.size()), Comparator.comparingInt(Cala::getPrice));
            t.remove(minSecond);
        }
    }

    // Suppose all owners contain at least 1 character. Sort the list t descendingly by the 1st character of the owner.
    //Giả sử tất cả các chủ chứa ít nhất 1 ký tự. Sắp xếp danh sách t giảm dần theo ký tự đầu tiên của chủ sở hữu.
    public void f3(List<Cala> t) {
        Collections.sort(t, new Comparator<Cala>() {
            @Override
            public int compare(Cala cala1, Cala cala2) {
                char firstChar1 = cala1.getOwner().charAt(0);
                char firstChar2 = cala2.getOwner().charAt(0);
                return Character.compare(firstChar2, firstChar1);
            }
        });
    }
}



//TEST:
//0     1       A1B,5) (BC2,4) (CT,3) (D3X,4) (2E1,5) (FY4,2)       Out: 3
//0     2       (A,4) (C,3) (B,7) (D,3) (E,7) (F,5)                 Out: (A,4) (C,3) (B,7) (E,7) (F,5) 
//0     3       (A8,1) (B1,2) (C7,3) (D2,4) (E6,5) (F3,6)           Out: (F3,6) (E6,5) (D2,4) (C7,3) (B1,2) (A8,1) 