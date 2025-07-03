
package Number_Classes;

import java.util.Scanner;

public class Person {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullname, address;
        int age;
        
        System.out.print("Enter your fullname: ");
        fullname = sc.nextLine();
        
        System.out.print("Enter your age: ");
        age=Integer.parseInt(sc.nextLine());
        
        System.out.print("Enter your Address: ");
        address=sc.nextLine();
        
        System.out.println("Information : " + fullname + " - " + age + " - " + address);
    }
}
