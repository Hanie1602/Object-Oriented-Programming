
package Menu;

import SE171916.StudentManagementProgram;
import MyUtils.Utils;

public class Run {
    public static void main(String[] args) {
        StudentManagementProgram r = new StudentManagementProgram();
        int choice;
        
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Add new student");
            System.out.println("2. Search a student based on his/her code");
            System.out.println("3. Update name and mark of a student based on his/her code");
            System.out.println("4. Remove a student based on his/her code");
            System.out.println("5. List all students.");
            System.out.println("6. Exit");
            
            choice = Utils.getInt("Enter your choice: ", 1);
            switch(choice) {
                case 1:
                    r.addStudent();
                    break;
                case 2:
                    r.searchStudentByCode();
                    break;
                case 3:
                    r.updateStudent();
                    break;
                case 4:
                    r.removeStudent();
                    break;
                case 5:
                    r.listStudent();
                    break;
                case 6:
                    System.out.println("Exiting the program....");
                    break;
              default:
                  System.err.println("Invalid choice!!");
            }
        } while(choice != 6);
    }
}