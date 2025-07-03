package ThiThu03;

/*
    Write a class MyCala, which implements the interface ICala. The class MyCala implements methods f1, f2 and f3 in ICala as below (you can add othe functions in MyCala class)
    f1: Suppose all oners contain at least 2 characters. Count and return number of elements with owner having 2nd character (owner.charAt(1)) is a letter
    f2: Remove the second element having minimum price (do nothing if only one minimum element in the list)
    f3: Suppose all owners contain at least 2 characters. Sort the list t descendingly by the 2nd character of owner. 
*/
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCala implements ICala {
    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for(Cala cala : t) {
            if (cala.getOwner().length() >= 2 && Character.isLetter(cala.getOwner().charAt(1))) {       //Character.isDigit (số)
                count ++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int minPrice = Integer.MAX_VALUE;
        int minPriceIndex = 0;
        int price;
        
        for(int i =0; i<t.size(); i++) {
            price = t.get(i).getPrice();
            if(price < minPrice) {
                minPrice = price;
                minPrice = i;
            }
        }
        t.remove(minPriceIndex);
    }

    @Override
    public void f3(List<Cala> t) {
        Collections.sort(t, new Comparator<Cala>() {
            @Override
            public int compare(Cala cala1, Cala cala2) {
                //return cala1.getOwner().codePointAt(1) - cala2.getOwner().codePointAt(1);     Thứ tự tăng dần
                String owner1 = cala1.getOwner();
                String owner2 = cala2.getOwner();
                if (owner1.length() >= 2 && owner2.length() >= 2) {
                    return Character.compare(owner2.charAt(1), owner1.charAt(1));
                }
                return 0;
            }
        });
    }
}
