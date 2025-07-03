
package Polymorphism;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee[]  listemp = new Employee[4];
        listemp[0] = new Emp_Fulltime("IT01", "Nguyen Van A", "0989245867", 1500, 2);
        listemp[1] = new Emp_Fulltime("IT02", "Nguyen Van B", "0989284267", 1700, 2);
        listemp[2] = new Emp_parttime("IT03", "Nguyen Van C", "0989617659", 26);
        listemp[3] = new Emp_parttime("IT04", "Nguyen Van D", "0989619652", 50);
        
        for(int i = 0; i<listemp.length;i++) {
            if (listemp[i] instanceof Emp_Fulltime) {
                listemp[i] .printinfo();
            }
        }
           // listemp[i].printinfo();
    }
}
