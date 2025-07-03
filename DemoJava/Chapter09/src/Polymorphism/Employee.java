
package Polymorphism;

public abstract class Employee {
    String code;
    String name;
    String phone;

    public Employee(String code, String name, String phone) {
        this.code = code;
        this.name = name;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    //abstract: sẽ dùng cho class con, nhưng mà không gắn trước giá trị được
    abstract public int SumSalary();
    abstract public void printinfo();
}