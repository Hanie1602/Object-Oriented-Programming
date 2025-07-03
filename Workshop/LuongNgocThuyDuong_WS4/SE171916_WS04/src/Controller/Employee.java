package Controller;

public abstract class Employee {
    String code;
    String fullname;
    String phone;
    String address;
    String department;

    public Employee(String code, String fullname, String phone, String address, String department) {
        this.code = code;
        this.fullname = fullname;
        this.phone = phone;
        this.address = address;
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    abstract public float totalSalary();                //Phương thức trừu tượng ko có thân hàm
    abstract public void printinfo();
}
