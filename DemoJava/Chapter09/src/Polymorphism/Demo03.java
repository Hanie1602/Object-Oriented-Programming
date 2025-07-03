
package Polymorphism;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        try {
            System.out.print("Enter your Age: ");
            age = Integer.parseInt(sc.nextLine());
            if(age<0) {
                System.out.println("Age must >0!!!");
            }
        } catch (Exception e) {
            System.out.println("Wrong format!!!");
        }
        System.out.println("-------------------------------");
        System.out.println("Your age: " + age);
        System.out.println("Finish Successfully!!!!");
    }
}