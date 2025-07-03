
package Workshop02;

import java.util.Scanner;

public class Employee {
    private String code;
    private String fullname;
    private String phone;
    private double salary;
    private double salaryCoefficient;
    private String department;

    public Employee(String code, String fullname, String phone, double salary, double salaryCoefficient, String department) {
        this.code = code;
        this.fullname = fullname;
        this.phone = phone;
        this.salary = salary;
        this.salaryCoefficient = salaryCoefficient;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        int n = Integer.parseInt(sc.nextLine());
        
        Employee[] employeeList = new Employee[n];
        
        for(int i=0; i<n; i++) {
            System.out.println("\n Enter information for employee " + (i+1));
            
            System.out.print("Enter employee code: ");
            String code = sc.nextLine();
            
            System.out.print("Enter full name: ");
            String fullname = sc.nextLine();
            
            System.out.print("Enter phone number: ");
            String phone = sc.nextLine();
            
            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter salary coefficient: ");
            double salaryCoefficient = Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter department: ");
            String department = sc.nextLine();
            
            employeeList[i] = new Employee(code, fullname, phone, salary, salaryCoefficient, department);
        }
        
        System.out.println("----------------------------------------------------");
        System.out.println("\n Employee List: ");
        for(Employee e : employeeList) {
            System.out.println("\nCode: " + e.getCode());
            System.out.println("Full name: " + e.getFullname());
            System.out.println("Phone: " + e.getPhone());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Salary Coefficient: " + e.getSalaryCoefficient());
            System.out.println("Department: " + e.getDepartment());
        }
        
        double totalSalary = 0;
        for (Employee e : employeeList) {
            totalSalary += e.getSalary()*e.getSalaryCoefficient();
        }
        System.out.println("\n Total Salary: " + totalSalary);
        
        System.out.println("----------------------------------------------------");
        System.out.print("Enter the number of employees who need upcdate salary: ");
        int nUpdate = Integer.parseInt(sc.nextLine());
        for(int c = 1; c <= nUpdate; c++) {
            System.out.print("Enter employee code to update salary: ");
            String updateCode = sc.nextLine();
            
            for (Employee e : employeeList) {
                if (e.getCode().equals(updateCode)) {
                    System.out.print("Enter new salary: ");
                    double newSalary = Double.parseDouble(sc.nextLine());
                    e.setSalary(newSalary);
                    System.out.println("Salary updated successfully.");
                }
            }
        }
        
        totalSalary = 0;
        for (Employee e : employeeList) {
            totalSalary += e.getSalary()*e.getSalaryCoefficient();
        }
        
        System.out.println("----------------------------------------------------");
        System.out.println("\nUpdated Employee List: ");
        for(Employee e : employeeList) {
            System.out.println("\nCode: " + e.getCode());
            System.out.println("Full name: " + e.getFullname());
            System.out.println("Phone: " + e.getPhone());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Salary Coefficient: " + e.getSalaryCoefficient());
            System.out.println("Department: " + e.getDepartment());
        }
        System.out.println("\n Total Salary: " + totalSalary);
    }
}