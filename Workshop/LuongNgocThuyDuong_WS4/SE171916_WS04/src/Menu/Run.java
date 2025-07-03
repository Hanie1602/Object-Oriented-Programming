package Menu;

import Controller.ListEmployee;
import MyUtils.Utils;

public class Run {
    public static void main(String[] args) {
        ListEmployee r = new ListEmployee();
        
        int choice;
      do {
          System.out.println("--------------------------------------------------");
          System.out.println("1. Create a new full-time employee");
          System.out.println("2. Create a new part-time employee");
          System.out.println("3. Print a list of full-time employees");
          System.out.println("4. Print a list of part-time employees");
          System.out.println("5. Exit");
          choice = Utils.getInt("Enter your choice: ", 0);
          
          switch (choice) {
              case 1:
                  if(r.checkS()) {
                      r.addFullTime();
                  } else {
                      System.out.println("The company has a maximum of 100 employees!!!");
                  }
                  break;
              case 2:
                  if(r.checkS()) {
                      r.addPartTime();
                  } else {
                      System.out.println("The company has a maximum of 100 employees!!!");
                  }
                  break;
              case 3:
                  r.printFullTime();
                  break;
              case 4:
                  r.printPartTime();
                  break;
              case 5:
                  System.out.println("Exiting the program......");
                  break;
              default:
                  System.out.println("Invalid choice!!");
          }
      } while (choice != 5);
    }
}
