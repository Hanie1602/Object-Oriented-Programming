package Controller;

public class FullTime extends Employee {
    private float salary;
    private int absent;

    public FullTime(String code, String fullname, String phone, String address, String department, float salary, int absent) {
        super(code, fullname, phone, address, department);
        this.salary = salary;
        this.absent = absent;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }

    @Override
    public float totalSalary() {                                     //Triển khai phương thức trừu tượng từ lớp cha
        return salary - (absent*35);
    }

    @Override
    public void printinfo() {                              
        System.out.println(code + " - " + fullname + " - " + phone + " - " + totalSalary());
    }

}
