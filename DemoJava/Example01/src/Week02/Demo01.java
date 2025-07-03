
package Week02;

// Viet chuong trinh cho phep nguoi dung nhap fullname, birthday, arg

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        String fullname, birthday, address;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fullname:");
        fullname = sc.nextLine();
        
        System.out.print("Enter Birthday:");
        birthday = sc.nextLine();
        
        // chuyển chuỗi số thành số nguyên 
        System.out.print("Enter Age:");
        age = Integer.parseInt(sc.nextLine());
        
        System.out.print("Enter Address:");
        address = sc.nextLine();
        
        System.out.println("-----------------------------");
        System.out.println(fullname + "-" + birthday + "-" + age + "-" + address);
    }
}
