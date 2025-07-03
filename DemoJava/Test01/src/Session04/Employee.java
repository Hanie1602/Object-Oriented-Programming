
package Session04;

public class Employee {

    static double TotalSalary(Employee[] emp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String code;
    String name;
    double salary;

    public Employee(String code, String name, double salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Phương thức toString() trả về chuỗi đại diện của đối tượng
    public String toString() {
        return " " + code + " - " + name + " - " + salary;
    }
    
}


