
package SE171916;

import MyUtils.Utils;
import java.util.ArrayList;

public class StudentManagementProgram {
    String code, name;
    float mark;
    
    ArrayList s = new ArrayList();
    
    public void addStudent() {
        code = Utils.getStringreg("Enter student code (format: S***, * is a digit): ", 
                "S\\d{3}", "Code cannot be blank", "Invalid code format. Please use format S***");
        
        for (Object student : s) {
            if (((Student)student).getCode().equals(code)) {
                System.err.println("Code already exists, pleasee enter another code");
                return;
            }
        }
        
        name = Utils.getString("Enter name: ", "Name cannot be empty!!");
        mark = Utils.getFloat("Enter student mark (0 - 10): ", 0, 10);
        
        Student st = new Student(code, name, mark);
        s.add(st);
        
        System.out.println("Student added successfully.");
    }
    
    //Search a student based on his/her code.
    public void searchStudentByCode() {
        code = Utils.getStringreg("Enter student code (format: S***, * is a digit): ", 
                "S\\d{3}", "Code cannot be blank", "Invalid code format. Please use format S***");
        
        for(Object student : s) {
            if(((Student)student).getCode().equals(code)) {
                System.out.println("Student found: ");
                
            if (student instanceof Student) {
                ((Student)student).printinfo();
                }
                return;
            }
        }
        System.err.println("Student not found with the provided code.");
        System.out.println("----------------------------------------------------");
    }
    
    //Update name and mark of a student based on his/her code
    public void updateStudent() {
        code = Utils.getStringreg("Enter student code to update (format: S***, * is a digit): ", 
                "S\\d{3}", "Code cannot be blank", "Invalid code format. Please use format S***");
        
        for (Object student : s) {
            if(((Student)student).getCode().equals(code)) {
                name = Utils.getString("Enter new name: ", "Name cannot be empty!!!");
                mark = Utils.getFloat("Enter new student mark ( 0 - 10): ", 0, 10);
                ((Student)student).setName(name);
                ((Student)student).setMark(mark);
                System.out.println("Student information updated successfully.");
                return;
            }
        }
        System.err.println("Student not found with the provided code");
        System.out.println("----------------------------------------------------");
    }
    
    //Remove a student based on his/her code
    public void removeStudent() {
        code = Utils.getStringreg("Enter student code to remove (format: S***, * is a digit): ", 
                "S\\d{3}", "Code cannot be blank", "Invalid code format. Please use format S***");
        
        for(Object student : s) {
            if(((Student)student).getCode().equals(code)) {
                s.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.err.println("Student not found with the provided code");
        System.out.println("----------------------------------------------------");
    }
    
    //List all students.
    public void listStudent() {
        if(s.isEmpty()) {
            System.err.println("No student found");
            return;
        }
        
        System.out.println("List of student: ");
        for (Object student : s) {
            if (student instanceof Student) {
                ((Student)student).printinfo();
                System.out.println("------------------------------------------------");
            }
        }
    }
}
