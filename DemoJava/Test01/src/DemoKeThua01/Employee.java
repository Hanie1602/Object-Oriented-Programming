
package DemoKeThua01;

public class Employee {
    
    protected String code;
    protected String fullname;
    protected int salary;

    
    public Employee(String code, String fullname, int salary) {
        this.code = code;
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public String getFullname() {
        return fullname;
    }

    public int getSalary() {
        return salary;
    }
    
    
}
