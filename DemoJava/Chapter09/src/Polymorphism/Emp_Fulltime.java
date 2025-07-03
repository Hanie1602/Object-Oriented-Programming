
package Polymorphism;

public class Emp_Fulltime extends Employee {
    private int salary;         //lương cơ bản
    private int absent;         //số ngày nghỉ làm

    public Emp_Fulltime(String code, String name, String phone, int salary, int absent) {
        super(code, name, phone);
        this.salary = salary;
        this.absent = absent;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    //Tổng thực lãnh trong tháng
    public int SumSalary() {
        return salary - (absent*50);
    }
    
    public void printinfo() {
        System.out.println(code + " - " + name + " - " + phone + " - " + SumSalary());
    }
}
