
package DemoKeThua;

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
        
        int total=this.getSalary()-(26-workingdate)*500;
        return total;
    }
    
    public void viewinfo() {
            System.out.println(this.getCode() + "-" + this.getFullname() + "-" + SumSalary());
    }
}
