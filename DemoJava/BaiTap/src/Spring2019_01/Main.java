package Spring2019_01;

// ======= DO NOT EDIT THIS FILE ============
import java.io.*;
class Main {
   public static void main(String args[]) throws Exception {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter employee name: ");
       String name = in.readLine();
       System.out.print("Enter employee salary: ");
       double salary = Double.parseDouble(in.readLine()); 
       System.out.print("Enter employee revenue: ");
       double revenue = Double.parseDouble(in.readLine());
       System.out.print("Enter TC: ");
       int tc = Integer.parseInt(in.readLine());
       System.out.println("OUTPUT:");      
       if(tc == 1) {
            Employee m = new Employee(name, salary);
            System.out.println(m);
            m = new Seller(name, revenue, salary);
            System.out.println(m);
       }
       else if(tc == 2) {
           Seller b = new Seller(name, revenue, salary);
           System.out.println(b.getSalary());
       }
   }
 }
