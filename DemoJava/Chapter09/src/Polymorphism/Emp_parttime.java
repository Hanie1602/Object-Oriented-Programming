
package Polymorphism;

public class Emp_parttime extends Employee {
   private int present;             //số ngày làm việc

    public Emp_parttime(String code, String name, String phone, int present) {
        super(code, name, phone);
        this.present = present;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }
   
    //Tổng thực lãnh trong tháng
    public int SumSalary() {
        return present*40;
    }
    
    public void printinfo() {
        System.out.println(code + " - " + name + " - " + phone + " - " + SumSalary());
    }
}
