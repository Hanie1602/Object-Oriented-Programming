
package DemoKeThua01;

public class Programmer extends Employee{
    
    private int workingdate;

    public Programmer(int workingdate, String code, String fullname, int salary) {
        super(code, fullname, salary);
        this.workingdate = workingdate;
    }

    public int getWorkingdate() {
        return workingdate;
    }

    public void setWorkingdate(int workingdate) {
        this.workingdate = workingdate;
    }
    
    //Mỗi ngày nghỉ sẽ trừ 500
    public int SumSalary() {
        
        int total=this.salary-(26-workingdate)*500;
        return total;
    }
    
    
    //trả về chuỗi đại diện cho 1 đối tượng
    //phương thức này sẽ tự động đươc gọi khi 1 đối tượng của class được truy cập
    public String toString() {
        return this.code + "-" + this.fullname + "-" + SumSalary();
    }
}
