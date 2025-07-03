package Controller;

import java.util.ArrayList;
import MyUtils.Utils;

public class ListEmployee {
    String code, fullname, phone, address, department;
    float salary, dailyWage;
    int absent, present;
    
 ArrayList employees = new ArrayList();
 
 //The company has a maximum of 100 employees
 public boolean checkS() {
        return employees.size()<100;
     
 }
 
 //Each employee has a different code
  public void addFullTime () {
      boolean check = true;
      String code = " ";
      do {
           code = Utils.getStringreg("Enter code (FS followed by 5 digits): ", "^FS\\d{5}$", 
              "Code cannot be empty!", "Code format is invalid. It should start with FS followed by 5 digits.");
           if (employees.isEmpty()) {
               check = false;
           } else {
               for (Object employee : employees) {
                   if (((Employee)employee).getCode().equals(code))
                       System.out.println("Code already exists, pleasee enter another code.");
                   else
                       check = false;
               }
           }
      } while (check);
      
      fullname = Utils.getString("Enter Fullname: ", "Fullname cannot be empty!");
      phone = Utils.getStringreg("Enter phone: ", "\\d{10,11}", "Phone cannot be empty!", "Phone format is invalid!!");
      address = Utils.getString("Enter address: ", "Address cannot be empty!");
      department = Utils.getString("Enter department: ", "Department cannot be empty!");
      
      salary = Utils.getFloat("Enter salary (must be > 1500): ", 1500);
      absent = Utils.getInt("Enter number of absences: ", 0);
      
      FullTime ft = new FullTime(code, fullname, phone, address, department, salary, absent);
      employees.add(ft);
      
      System.out.println("Full-time employee added successfully");
  }
  
  public void addPartTime () {
      boolean check = true;
      String code = " ";
      do {
           code = Utils.getStringreg("Enter code (FS followed by 5 digits): ", "^FS\\d{5}$", 
              "Code cannot be empty!", "Code format is invalid. It should start with FS followed by 5 digits.");
           if (employees.isEmpty()) {
               check = false;
           } else {
               for (Object employee : employees) {
                   if (((Employee)employee).getCode().equals(code))
                       System.out.println(" Code already exists, pleasee enter another code. ");
                   else
                       check = false;
               }
           }
      } while (check);
      
      fullname = Utils.getString("Enter Fullname: ", "Name cannot be empty!");
      phone = Utils.getStringreg("Enter phone: ", "\\d{10,11}", "Phone cannot be empty!", "Phone format is invalid!!");
      address = Utils.getString("Enter address: ", "Address cannot be empty!");
      department = Utils.getString("Enter department: ", "Department cannot be empty!");
      
      dailyWage = Utils.getFloat("Enter dailyWage (must be > 10): ", 10);
      present = Utils.getInt("Enter number of days present: ", 0);
      
      PartTime pt = new PartTime(code, fullname, phone, address, department, dailyWage, present);
      employees.add(pt);
      
      System.out.println("Part-Time employee added successfully");
  }
  
  public void printFullTime () {
      System.out.println("Full-Time Employee: ");
      
      for (Object employee : employees) {
          if (employee instanceof FullTime) {
              ((FullTime) employee).printinfo();
          }
      }
  }
  
  public void printPartTime() {
      System.out.println("Part-Time Employee: ");
      
      for(Object employee : employees) {
          if (employee instanceof PartTime) {
              ((PartTime) employee).printinfo();
          }
      }
  }
}