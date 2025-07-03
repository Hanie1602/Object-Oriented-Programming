package Spring2019_02;

/*
    void f1(List<Course> a, int st) – Sort the list of courses "a" ascending by course fee if st = 1
    therwise move all of course (int the same order as original list) in the list ”a” which have fee is less than or equals 120
    int f2(List<Course> a, double fee) - count and return numbers of courses in the list “a” which are in the list “a” and has course fee greater than or equals given fee. 
*/

 
import java.util.*;

public class MyCourse implements ICourse { 

    @Override
    public void f1(List<Course> a, int st) {
        //sort -> Collection
        //remove -> use remove Method in List
        if (st == 1) {
            Comparator<Course> c = new Comparator<Course>() {
                @Override
                public int compare(Course t1, Course t2) {
                     double c1fee = t1.getFee();
                     double c2fee = t2.getFee();
                     double hieu = c1fee - c2fee;
                     if (hieu > 0)  return 1;       //Sắp xếp tăng dần thì trả về 1 || giảm dần trả về -1 đối với hieu > 0
                     else if (hieu < 0)  return -1;
                     return 0;     //bằng nhau thì ko thay đổi
                }
            };
            Collections.sort(a, c);
        } else {
            List<Course> temp = new ArrayList<>();
            for (Course e : a) {
                if(e.getFee() <= 120) {
                    temp.add(e);
                }
            }
            a.removeAll(temp);
        }
    }
    

    @Override
    public int f2(List<Course> a, double fee) {
        int count = 0;
        for(Course e : a) {
            if(e.getFee() >= fee) {
                count++;
            }
        }
        return count;
    }
     
}


//TEST:
//1     PRN292      180.0       1       Enter:1      Out: PRJ311  PRF192  DBI202  PRN292
//1     PRN292      180.0       1       Enter:2      Out: DBI202 PRN292
//1     PRN292      180.0       2       Enter: 150   Out: 2